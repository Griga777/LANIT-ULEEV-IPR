package example.task2Test;

import example.task2.trello.boards.Board;
import example.task2.trello.cards.Card;
import example.task2.trello.lists.List;
import example.task2Test.utils.RestWrapper;
import example.task2Test.utils.UserLogin;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.StringContains.containsString;

public class ApiTest {
    private static RestWrapper api;
    private static final String BASE_URL = "https://api.trello.com";
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public static void prepareRequest() {
//        api = RestWrapper.loginAs("ca92798ed22edd169506048c77755169",
//                                  "44962edeb80408666c4dd3ed952a463ad9b4555852c6f779c91f1a9536750777");

//        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));

        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com")
                .addQueryParam("key", "ca92798ed22edd169506048c77755169")
                .addQueryParam("token", "44962edeb80408666c4dd3ed952a463ad9b4555852c6f779c91f1a9536750777")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
        RestAssured.requestSpecification = requestSpec;
    }

    public static void prepareResponse() {
        ResponseSpecification responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody(containsString("success"))
                .build();
        RestAssured.responseSpecification = responseSpec;
    }

    @Test
    public void createNewBoard() {
        Board board = new Board();
        String name = "IPR_ULEEV";
        String id;
        board.setName(name);

        given()
                .body(board)
                .when()
                .post("/1/boards")
                .then()
                .statusCode(200)
                .extract().jsonPath().getString("[0].id");
        id = get().jsonPath().getString("[0].id");
        Board actual =
                given()
                        .pathParam("id", id)
                        .when()
                        .get("/1/boards/{id}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Board.class);
        Assert.assertEquals(actual.getId(), board.getId());
    }

    @Test
    public void createNewList() {
        List list = new List();
        String listName = "Backlog";
        list.setName(listName);

        given()
                .body(list)
                .when()
                .post("/1/lists/")
                .then()
                .statusCode(200);
        List actual =
                given()
                        .pathParam("name", listName)
                        .when()
                        .get("/1/lists/{name}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(List.class);
        Assert.assertEquals(actual.getName(), list.getName());
    }

    @Test
    public void createNewCard() {
        Card card = new Card();
        String cardName = "Карточка для изучения API";
        card.setName(cardName);

        given()
                .body(card)
                .when()
                .post("/1/cards/")
                .then()
                .statusCode(200);
        Card actual =
                given()
                        .pathParam("name", cardName)
                        .when()
                        .get("/1/cards/{name}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Card.class);
        Assert.assertEquals(actual.getName(), card.getName());
    }

}
