package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class Board{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("shortLink")
	private String shortLink;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setShortLink(String shortLink){
		this.shortLink = shortLink;
	}

	public String getShortLink(){
		return shortLink;
	}

	@Override
 	public String toString(){
		return 
			"Board{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",shortLink = '" + shortLink + '\'' + 
			"}";
		}
}