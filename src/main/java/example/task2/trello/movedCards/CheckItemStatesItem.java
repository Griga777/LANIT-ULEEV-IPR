package example.task2.trello.movedCards;

import com.google.gson.annotations.SerializedName;

public class CheckItemStatesItem{

	@SerializedName("state")
	private String state;

	@SerializedName("idCheckItem")
	private String idCheckItem;

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setIdCheckItem(String idCheckItem){
		this.idCheckItem = idCheckItem;
	}

	public String getIdCheckItem(){
		return idCheckItem;
	}

	@Override
 	public String toString(){
		return 
			"CheckItemStatesItem{" + 
			"state = '" + state + '\'' + 
			",idCheckItem = '" + idCheckItem + '\'' + 
			"}";
		}
}