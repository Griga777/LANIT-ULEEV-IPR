package example.task2.trello.comments;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Comment{

	@SerializedName("Comment")
	private List<CommentItem> comment;

	public void setComment(List<CommentItem> comment){
		this.comment = comment;
	}

	public List<CommentItem> getComment(){
		return comment;
	}

	@Override
 	public String toString(){
		return 
			"Comment{" + 
			"comment = '" + comment + '\'' + 
			"}";
		}
}