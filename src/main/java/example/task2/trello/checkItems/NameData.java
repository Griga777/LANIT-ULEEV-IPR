package example.task2.trello.checkItems;

import com.google.gson.annotations.SerializedName;

public class NameData{

	@SerializedName("emoji")
	private Emoji emoji;

	public void setEmoji(Emoji emoji){
		this.emoji = emoji;
	}

	public Emoji getEmoji(){
		return emoji;
	}

	@Override
 	public String toString(){
		return 
			"NameData{" + 
			"emoji = '" + emoji + '\'' + 
			"}";
		}
}