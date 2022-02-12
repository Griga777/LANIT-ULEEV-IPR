package example.task2Test.utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RestWrapper {
    private static final String BASE_URL = "https://api.trello.com";
    private static RequestSpecification REQ_SPEC;
    private Cookies cookies;

    private RestWrapper(Cookies cookies) {
        this.cookies = cookies;

        REQ_SPEC = new RequestSpecBuilder()
                .addCookies(cookies)
                .setBaseUri(BASE_URL)
//                .setBasePath("/users")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    public static RestWrapper loginAs(String key, String token) {
        Cookies cookies = given()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL)
//                .basePath("/login")
                .body(new UserLogin(key, token))
                .post()
//                .then().log().all()
//                .extract().detailedCookies();
                .getDetailedCookies();

        return new RestWrapper(cookies);
    }

}
