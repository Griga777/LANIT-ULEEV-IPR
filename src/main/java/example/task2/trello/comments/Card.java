package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class Card{

	@SerializedName("idShort")
	private int idShort;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("shortLink")
	private String shortLink;

	public void setIdShort(int idShort){
		this.idShort = idShort;
	}

	public int getIdShort(){
		return idShort;
	}

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
			"Card{" + 
			"idShort = '" + idShort + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",shortLink = '" + shortLink + '\'' + 
			"}";
		}
}