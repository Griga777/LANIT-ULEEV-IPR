package example.task2.trello.movedCards;

import com.google.gson.annotations.SerializedName;

public class Trello{

	@SerializedName("board")
	private int board;

	@SerializedName("card")
	private int card;

	public void setBoard(int board){
		this.board = board;
	}

	public int getBoard(){
		return board;
	}

	public void setCard(int card){
		this.card = card;
	}

	public int getCard(){
		return card;
	}

	@Override
 	public String toString(){
		return 
			"Trello{" + 
			"board = '" + board + '\'' + 
			",card = '" + card + '\'' + 
			"}";
		}
}