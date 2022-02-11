package example;

import example.trello.boards.Board;
import example.trello.cards.Card;
import example.trello.lists.List;
import example.utils.RestWrapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static io.restassured.RestAssured.given;

public class ApiTest {
    private static RestWrapper api;

    @BeforeClass
    public static void prepare() {
//        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));
        api = RestWrapper.loginAs("uleev777@yandex.ru", "iloveMasha*159");

//        RestAssured.requestSpecification = new RequestSpecBuilder()
//                .setBaseUri("https://api.trello.com/")
//                .addHeader("uleev777@yandex.ru", "myToken")
//                .setAccept(ContentType.JSON)
//                .setContentType(ContentType.JSON)
//                .log(LogDetail.ALL)
//                .build();
//        RestAssured.filters(new ResponseLoggingFilter());
    }

//    .parameter("user", "name")
//.parameter("password", "some_password")
//.get("login_endpoint")
//.then().extract().response();
//    String authToken = login_endpoint.getCookie("cookie name with auth token");```
//
//    Ну, а дальше подкладывать его в каждый запрос, можно вот так:
//            ```RestAssured.requestSpecification = new RequestSpecBuilder().addHeader("auth header name", authToken).build();```
//    в таком случае, при всех последующих запросах, будет использоваться этот auth token

    @Test
    public void createNewBoard() {
        Board board = new Board();
        String boardName = "IPR_ULEEV";
        board.setName(boardName);

        given()
                .body(board)
                .when()
                .post("/1/boards/")
                .then()
                .statusCode(200);
        Board actual =
                given()
                        .pathParam("name", boardName)
                        .when()
                        .get("/1/boards/{name}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Board.class);
        Assert.assertEquals(actual.getName(), board.getName());
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
