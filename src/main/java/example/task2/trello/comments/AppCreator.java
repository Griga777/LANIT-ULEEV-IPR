package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class AppCreator{

	@SerializedName("id")
	private String id;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"AppCreator{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}