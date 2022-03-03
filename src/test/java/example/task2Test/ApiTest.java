package example.task2Test;

import example.task2.trelloAPI.boards.Board;
import example.task2.trelloAPI.cards.Card;
import example.task2.trelloAPI.checkItems.Checkitem;
import example.task2.trelloAPI.checklists.Checklist;
import example.task2.trelloAPI.lists.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.aeonbits.owner.ConfigFactory;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApiTest {
    private static final String BASE_URL = "https://api.trello.com";
    private static String ID_BOARD;
    private static String ID_LIST_BACKLOG;
    private static String ID_LIST_DONE;
    private static String ID_CARD;
    private static String ID_CHECKLIST;
    private static String ID_CHECKITEM_FIRST;
    private static String ID_CHECKITEM_SECOND;
    private static String ID_ATTACHMENT;
    private static String ID_MOVED_CARD;
    private static String ID_UPDATE_CHECKITEM_FIRST;
    private static String ID_UPDATE_CHECKITEM_SECOND;
    private static String ID_CLOSED_LIST_BACKLOG;
    private static String ID_COMMENT;

    @BeforeAll
    public static void prepareRequest() {
        MyProperties properties = ConfigFactory.create(MyProperties.class);

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .addQueryParam("key", properties.key())
                .addQueryParam("token", properties.token())
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Order(1)
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

    @Order(2)
    @Test
    public void createNewList() {
        List list1 = new List();
        List list2 = new List();
        String listName1 = "Backlog";
        String listName2 = "Done";
        list1.setName(listName1);
        list2.setName(listName2);

        // Колонка "Backlog"
        Response firstListCreation = given()
                .queryParam("name", listName1)
                .queryParam("idBoard", ID_BOARD)
                .when()
                .post("/1/lists")
                .then()
                .statusCode(200)
                .extract().response();
        ID_LIST_BACKLOG = firstListCreation.path("id").toString();
        List actual1 = given()
                .pathParam("id", ID_LIST_BACKLOG)
                .when()
                .get("/1/lists/{id}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(List.class);
        Assert.assertEquals(actual1.getName(), list1.getName());

        // Колонка "Done"
        Response secondListCreation = given()
                .queryParam("name", listName2)
                .queryParam("idBoard", ID_BOARD)
                .when()
                .post("/1/lists")
                .then()
                .statusCode(200)
                .extract().response();
        ID_LIST_DONE = secondListCreation.path("id").toString();
        List actual2 = given()
                .pathParam("id", ID_LIST_DONE)
                .when()
                .get("/1/lists/{id}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(List.class);
        Assert.assertEquals(actual2.getName(), list2.getName());
    }

    @Order(3)
    @Test
    public void createNewCard() {
        Card card = new Card();
        String cardName = "Карточка для изучения API";
        String cardDescription = "Тут будет отмечаться прогресс обучения";
        String cardDueDate = "2022-03-10T15:30:00Z";
        card.setName(cardName);

        Response cardCreation = given()
                .queryParam("name", cardName)
                .queryParam("desc", cardDescription)
                .queryParam("due", cardDueDate)
                .queryParam("idList", ID_LIST_BACKLOG)
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

    @Order(4)
    @Test
    public void createAttachmentOnCard() {
        String attachmentName;
        String actualAttachmentName;
        Path filePath = Paths.get("C:\\Users\\Uleev\\Postman\\files\\FOTO.jpg");

        Response attachmentCreation = given()
                .header("Content-Type", "multipart/form-data")
                .multiPart(new File(String.valueOf(filePath)))
                .when()
                .post("/1/cards/" + ID_CARD + "/attachments")
                .then()
                .statusCode(200)
                .extract().response();
        ID_ATTACHMENT = attachmentCreation.path("id").toString();
        attachmentName = attachmentCreation.path("name").toString();
        Response actualAttachmentCreation = given()
                .pathParam("id", ID_CARD)
                .pathParam("idAttachment", ID_ATTACHMENT)
                .when()
                .get("/1/cards/{id}/attachments/{idAttachment}")
                .then()
                .statusCode(200)
                .extract().response();
        actualAttachmentName = actualAttachmentCreation.path("name").toString();
        Assert.assertEquals(actualAttachmentName, attachmentName);
    }

    @Order(5)
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

    @Order(6)
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
        ID_CHECKITEM_FIRST = checkitemCreationFirst.path("id").toString();
        Checkitem actual1 = given()
                .pathParam("id", ID_CHECKLIST)
                .pathParam("idCheckItem", ID_CHECKITEM_FIRST)
                .when()
                .get("/1/checklists/{id}/checkItems/{idCheckItem}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Checkitem.class);
        Assert.assertEquals(actual1.getName(), checkitem1.getName());

        // Выучить методы запросов
        Response checkitemCreationSecond = given()
                .queryParam("name", checkitemName2)
                .when()
                .post("/1/checklists/" + ID_CHECKLIST + "/checkItems")
                .then()
                .statusCode(200)
                .extract().response();
        ID_CHECKITEM_SECOND = checkitemCreationSecond.path("id").toString();
        Checkitem actual2 = given()
                .pathParam("id", ID_CHECKLIST)
                .pathParam("idCheckItem", ID_CHECKITEM_SECOND)
                .when()
                .get("/1/checklists/{id}/checkItems/{idCheckItem}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Checkitem.class);
        Assert.assertEquals(actual2.getName(), checkitem2.getName());
    }

    @Order(7)
    @Test
    public void updateCheckItemOnCard() {
        Checkitem checkitem = new Checkitem();
        String checkitemState = "complete";
        checkitem.setState(checkitemState);

        Response updateCheckItemState = given()
                .queryParam("state", checkitemState)
                .when()
                .put("/1/cards/" + ID_CARD + "/checkItem/" + ID_CHECKITEM_FIRST)
                .then()
                .statusCode(200)
                .extract().response();
        ID_UPDATE_CHECKITEM_FIRST = updateCheckItemState.path("id").toString();
        Checkitem actual = given()
                .pathParam("id", ID_CARD)
                .pathParam("idCheckItem", ID_UPDATE_CHECKITEM_FIRST)
                .when()
                .get("/1/cards/{id}/checkItem/{idCheckItem}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Checkitem.class);
        Assert.assertEquals(actual.getState(), checkitem.getState());
    }

    @Order(8)
    @Test
    public void moveCardToAnotherColumn() {
        String idList;
        String actualIdList;

        Response cardMoveCreation = given()
                .queryParam("idList", ID_LIST_DONE)
                .when()
                .put("/1/cards/" + ID_CARD)
                .then()
                .statusCode(200)
                .extract().response();
        ID_MOVED_CARD = cardMoveCreation.path("id").toString();
        idList = cardMoveCreation.path("idList").toString();
        Response actualCardMove = given()
                .pathParam("id", ID_MOVED_CARD)
                .when()
                .get("/1/cards/{id}")
                .then()
                .statusCode(200)
                .extract().response();
        actualIdList = actualCardMove.path("idList").toString();
        Assert.assertEquals(actualIdList, idList);
    }

    @Order(9)
    @Test
    public void archiveOrUnarchiveList() {
        List list = new List();
        String listName = "Backlog";
        list.setName(listName);

        Response archiveOrUnarchiveListCreation = given()
                .queryParam("value", true)
                .when()
                .put("/1/lists/" + ID_LIST_BACKLOG + "/closed")
                .then()
                .statusCode(200)
                .extract().response();
        ID_CLOSED_LIST_BACKLOG = archiveOrUnarchiveListCreation.path("id").toString();
        List actual = given()
                .pathParam("id", ID_CLOSED_LIST_BACKLOG)
                .when()
                .get("/1/lists/{id}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(List.class);
        Assert.assertEquals(actual.getName(), list.getName());
    }

    @Order(10)
    @Test
    public void updateCheckItemOnAnotherCard() {
        Checkitem checkitem = new Checkitem();
        String checkitemState = "complete";
        checkitem.setState(checkitemState);

        Response updateCheckItemState = given()
                .queryParam("state", checkitemState)
                .when()
                .put("/1/cards/" + ID_CARD + "/checkItem/" + ID_CHECKITEM_SECOND)
                .then()
                .statusCode(200)
                .extract().response();
        ID_UPDATE_CHECKITEM_SECOND = updateCheckItemState.path("id").toString();
        Checkitem actual = given()
                .pathParam("id", ID_CARD)
                .pathParam("idCheckItem", ID_UPDATE_CHECKITEM_SECOND)
                .when()
                .get("/1/cards/{id}/checkItem/{idCheckItem}")
                .then()
                .statusCode(200)
                .extract().body()
                .as(Checkitem.class);
        Assert.assertEquals(actual.getState(), checkitem.getState());
    }

    @Order(11)
    @Test
    public void createCommentOnCard() {
        String cardComment = ":thumbsup:";
        String actionTypes = "commentCard";
        String responseCardComment;
        String actualResponseCardComment;

        Response cardCommentCreation = given()
                .queryParam("text", cardComment)
                .when()
                .post("/1/cards/" + ID_CARD + "/actions/comments")
                .then()
                .statusCode(200)
                .extract().response();
        ID_COMMENT = cardCommentCreation.path("id").toString();
        responseCardComment = cardCommentCreation.path("data.text").toString();
        Response actualCardCommentCreation = given()
                .pathParam("id", ID_CARD)
                .queryParam("filter", actionTypes)
                .queryParam("id", ID_COMMENT)
                .when()
                .get("/1/cards/{id}/actions")
                .then()
                .statusCode(200)
                .extract().response();
        actualResponseCardComment = actualCardCommentCreation.path("[0].data.text").toString();
        Assert.assertEquals(actualResponseCardComment, responseCardComment);
    }
}
