package example;

import example.trello.boards.Board;
import example.trello.cards.Card;
import example.trello.lists.List;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @BeforeClass
    public static void prepare() throws IOException {
//        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my"));

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com/")
                .addHeader("uleev777@yandex.ru", "44962edeb80408666c4dd3ed952a463ad9b4555852c6f779c91f1a9536750777")
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
