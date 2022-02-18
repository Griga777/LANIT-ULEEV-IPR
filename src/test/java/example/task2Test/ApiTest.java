package example.task2Test;

import example.task2.trello.attachments.Attachment;
import example.task2.trello.boards.Board;
import example.task2.trello.cards.Card;
import example.task2.trello.checkItems.Checkitem;
import example.task2.trello.checklists.Checklist;
import example.task2.trello.lists.List;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.params.CoreConnectionPNames;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class ApiTest {
    private static final String BASE_URL = "https://api.trello.com";
    private static String ID_BOARD = "620e35aa60e2c97521f0ba0d";
    private static String ID_LIST = "620e35c31179650bb3d4d79e";
    private static String ID_CARD = "620e35d736b7581d7891c6ca";
    private static String ID_ATTACHMENT;
    private static String ID_CHECKLIST = "620ea9c120e926405a560b41";
    private static String ID_CHECKITEM_FIRST;
    private static String ID_CHECKITEM_SECOND;

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
        ID_BOARD = boardCreation.path("id").toString();
        Board actual = given()
                .pathParam("id", ID_BOARD)
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
        list.setName(listName);

        Response listCreation = given()
                .queryParam("name", listName)
                .queryParam("idBoard", ID_BOARD)
                .when()
                .post("/1/lists")
                .then()
                .statusCode(200)
                .extract().response();
        ID_LIST = listCreation.path("id").toString();
        List actual = given()
                .pathParam("id", ID_LIST)
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
        String cardDescription = "Тут будет отмечаться прогресс обучения";
        String cardDueDate = "2022-02-18T23:41:00Z";
        card.setName(cardName);

        Response cardCreation = given()
                .queryParam("name", cardName)
                .queryParam("desc", cardDescription)
                .queryParam("due", cardDueDate)
                .queryParam("idList", ID_LIST)
                .when()
                .post("/1/cards")
                .then()
                .statusCode(200)
                .extract().response();
        ID_CARD = cardCreation.path("id").toString();
        Card actual = given()
                .pathParam("id", ID_CARD)
                .when()
                .get("/1/cards/{id}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Card.class);
        Assert.assertEquals(actual.getName(), card.getName());
    }

    @Test
    public void createAttachmentOnCard() {
        Attachment attachment = new Attachment();
        String attachmentName;
        Path filePath = Paths.get("C:\\Users\\Uleev\\Postman\\files\\FOTO.jpg");
        RestAssuredConfig config = RestAssured.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam("http.connection.timeout", 5000)
                        .setParam("http.socket.timeout", 5000)
                        .setParam("http.connection-manager.timeout", 5000));

        Response attachmentCreation = given()
                .queryParam("file", filePath)
                .when()
                .config(config)
                .post("/1/cards/" + ID_CARD + "/attachments")
                .then()
                .statusCode(200)
                .extract().response();
        ID_ATTACHMENT = attachmentCreation.path("id").toString();
        attachmentName = attachmentCreation.path("name").toString();
        Attachment actual = given()
                .pathParam("id", ID_CARD)
                .pathParam("idAttachment", ID_ATTACHMENT)
                .when()
                .get("/1/cards/{id}/attachments/{idAttachment}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Attachment.class);
        Assert.assertEquals(actual.getName(), attachmentName);
    }

    @Test
    public void createChecklist() {
        Checklist checklist = new Checklist();
        String checklistName = "Чек-лист";
        checklist.setName(checklistName);

        Response checklistCreation = given()
                .queryParam("name", checklistName)
                .queryParam("idCard", ID_CARD)
                .when()
                .post("/1/checklists")
                .then()
                .statusCode(200)
                .extract().response();
        ID_CHECKLIST = checklistCreation.path("id").toString();
        Checklist actual = given()
                .pathParam("id", ID_CHECKLIST)
                .when()
                .get("/1/checklists/{id}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Checklist.class);
        Assert.assertEquals(actual.getName(), checklist.getName());
    }

    @Test
    public void createCheckitemOnChecklist() {
        Checkitem checkitem1 = new Checkitem();
        Checkitem checkitem2 = new Checkitem();
        String checkitemName1 = "Понять протокол HTTP";
        String checkitemName2 = "Выучить методы запросов";
        checkitem1.setName(checkitemName1);
        checkitem2.setName(checkitemName2);

        // Понять протокол HTTP
        Response checkitemCreationFirst = given()
                .queryParam("name", checkitemName1)
                .when()
                .post("/1/checklists/" + ID_CHECKLIST + "/checkItems")
                .then()
                .statusCode(200)
                .extract().response();
        ID_CHECKLIST = checkitemCreationFirst.path("idChecklist").toString();
        ID_CHECKITEM_FIRST = checkitemCreationFirst.path("id").toString();
        Checkitem actual = given()
                .pathParam("id", ID_CHECKLIST)
                .pathParam("idCheckItem", ID_CHECKITEM_FIRST)
                .when()
                .get("/1/checklists/{id}/checkItems/{idCheckItem}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Checkitem.class);
        Assert.assertEquals(actual.getName(), checkitem1.getName());

        // Выучить методы запросов
    }
}
