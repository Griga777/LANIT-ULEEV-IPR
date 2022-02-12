package example.task2.trello.cards;

import com.google.gson.annotations.SerializedName;

public class IdLabelsItem{

	@SerializedName("idBoard")
	private String idBoard;

	@SerializedName("color")
	private String color;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setIdBoard(String idBoard){
		this.idBoard = idBoard;
	}

	public String getIdBoard(){
		return idBoard;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
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

	@Override
 	public String toString(){
		return 
			"IdLabelsItem{" + 
			"idBoard = '" + idBoard + '\'' + 
			",color = '" + color + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}