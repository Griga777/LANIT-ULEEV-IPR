package example.task2.trello.cards;

import com.google.gson.annotations.SerializedName;

public class Attachments{

	@SerializedName("perBoard")
	private PerBoard perBoard;

	public void setPerBoard(PerBoard perBoard){
		this.perBoard = perBoard;
	}

	public PerBoard getPerBoard(){
		return perBoard;
	}

	@Override
 	public String toString(){
		return 
			"Attachments{" + 
			"perBoard = '" + perBoard + '\'' + 
			"}";
		}
}