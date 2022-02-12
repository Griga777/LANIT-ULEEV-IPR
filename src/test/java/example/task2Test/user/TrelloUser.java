package example.task2Test.user;

import example.task2Test.annotations.ServiceDomain;
import example.task2Test.annotations.QueryParameters;
import example.task2Test.annotations.QueryParameter;
import example.task2Test.annotations.ContentType;
import example.task2Test.annotations.Resource;
import net.serenitybdd.core.rest.RestMethod;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("https://api.trello.com/1/")
@QueryParameters({
        @QueryParameter(key = "key", value = "ca92798ed22edd169506048c77755169"),
        @QueryParameter(key = "token", value = "44962edeb80408666c4dd3ed952a463ad9b4555852c6f779c91f1a9536750777")
})

public class TrelloUser {

    @ContentType(JSON) @Resource("/boards")
    public static RestMethod boards;

    @ContentType(JSON) @Resource("/boards/{board_id}")
    public static RestMethod board;

    @ContentType(JSON) @Resource("/boards/{board_id}/cards")
    public static RestMethod getBoardCardsList;

    @ContentType(JSON) @Resource("/boards/{board_id}/cards/{short_card_id}")
    public static RestMethod getBoardCardById;

    @ContentType(JSON) @Resource("/members")
    public static RestMethod membersList;

    @ContentType(JSON) @Resource("/cards")
    public static RestMethod cardsList;

    @ContentType(JSON) @Resource("/cards/{card_id}/actions/comments")
    public static RestMethod postNewCommentToCard;

    @ContentType(JSON) @Resource("/cards/{card_id}")
    public static RestMethod getCardByUniqueId;

    @ContentType(JSON) @Resource("/members/{user_name}/boards")
    public static RestMethod getAllMemberBoards;
}
