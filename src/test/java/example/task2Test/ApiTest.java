package example.task2Test;

import example.task2.trello.boards.Board;
import example.task2.trello.cards.Card;
import example.task2.trello.lists.List;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    private static final String BASE_URL = "https://api.trello.com";
    private static String BOARD_ID;
    private static String LIST_ID;
    private static String CARD_ID;

    @BeforeClass
    public static void prepareRequest() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .addQueryParam("key", "ca92798ed22edd169506048c77755169")
                .addQueryParam("token", "44962edeb80408666c4dd3ed952a463ad9b4555852c6f779c91f1a9536750777")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void createNewBoard() {
        Board board = new Board();
        String boardName = "IPR_ULEEV";
        board.setName(boardName);

        Response boardCreation = given()
                .queryParam("name", boardName)
                .when()
                .post("/1/boards")
                .then()
                .statusCode(200)
                .extract().response();
        BOARD_ID = boardCreation.path("id").toString();
        Board actual = given()
                .pathParam("id", BOARD_ID)
                .when()
                .get("/1/boards/{id}")
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
        String boardId = BOARD_ID;
        list.setName(listName);

        Response listCreation = given()
                .queryParam("name", listName)
                .queryParam("idBoard", boardId)
                .when()
                .post("/1/lists")
                .then()
                .statusCode(200)
                .extract().response();
        LIST_ID = listCreation.path("id").toString();
        List actual = given()
                .pathParam("id", LIST_ID)
                .when()
                .get("/1/lists/{id}")
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

        Response cardCreation = given()
                .queryParam("name", cardName)
                .queryParam("idList", LIST_ID)
                .when()
                .post("/1/cards")
                .then()
                .statusCode(200)
                .extract().response();
        CARD_ID = cardCreation.path("id").toString();
        Card actual = given()
                .pathParam("id", CARD_ID)
                .when()
                .get("/1/cards/{id}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Card.class);
        Assert.assertEquals(actual.getName(), card.getName());
    }

}
