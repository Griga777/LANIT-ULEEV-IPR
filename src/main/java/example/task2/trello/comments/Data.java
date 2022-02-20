package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("textData")
	private TextData textData;

	@SerializedName("text")
	private String text;

	@SerializedName("list")
	private List list;

	@SerializedName("card")
	private Card card;

	@SerializedName("board")
	private Board board;

	public void setTextData(TextData textData){
		this.textData = textData;
	}

	public TextData getTextData(){
		return textData;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setList(List list){
		this.list = list;
	}

	public List getList(){
		return list;
	}

	public void setCard(Card card){
		this.card = card;
	}

	public Card getCard(){
		return card;
	}

	public void setBoard(Board board){
		this.board = board;
	}

	public Board getBoard(){
		return board;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"textData = '" + textData + '\'' + 
			",text = '" + text + '\'' + 
			",list = '" + list + '\'' + 
			",card = '" + card + '\'' + 
			",board = '" + board + '\'' + 
			"}";
		}
}