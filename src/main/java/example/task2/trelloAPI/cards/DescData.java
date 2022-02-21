package example.task2.trelloAPI.cards;

import com.google.gson.annotations.SerializedName;

public class DescData{

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
			"DescData{" + 
			"emoji = '" + emoji + '\'' + 
			"}";
		}
}