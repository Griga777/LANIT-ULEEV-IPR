package example.task2.trello.cards;

import com.google.gson.annotations.SerializedName;

public class IdChecklistsItem{

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
			"IdChecklistsItem{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}