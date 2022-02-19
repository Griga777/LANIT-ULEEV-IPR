package example.task2.trello.movedCards;

import com.google.gson.annotations.SerializedName;

public class AttachmentsByType{

	@SerializedName("trello")
	private Trello trello;

	public void setTrello(Trello trello){
		this.trello = trello;
	}

	public Trello getTrello(){
		return trello;
	}

	@Override
 	public String toString(){
		return 
			"AttachmentsByType{" + 
			"trello = '" + trello + '\'' + 
			"}";
		}
}