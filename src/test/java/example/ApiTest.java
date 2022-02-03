package example;

import example.trello.Board;
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
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my"));

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://trello.com/")
                .addHeader("api_login", "api_password")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void createBoard() {
        Board board = new Board();
        String name = "IPR_ULEEV";
        board.setName(name);

        given()
                .body(board)
                .when()
                .post("/1/boards/")
                .then()
                .statusCode(200);

        Board actual =
                given()
                        .pathParam("name", name)
                        .when()
                        .get("/1/boards/{name}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(Board.class);
        Assert.assertEquals(actual.getName(), board.getName());

//        HttpResponse<String> response = Unirest.post("https://api.trello.com/1/boards/")
//                .queryString("name", name)
//                .asString();
//
//        System.out.println(response.getBody());
    }

}
