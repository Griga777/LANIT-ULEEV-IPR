package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class TextData{

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
			"TextData{" + 
			"emoji = '" + emoji + '\'' + 
			"}";
		}
}