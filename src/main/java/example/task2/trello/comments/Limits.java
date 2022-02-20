package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class Limits{

	@SerializedName("reactions")
	private Reactions reactions;

	public void setReactions(Reactions reactions){
		this.reactions = reactions;
	}

	public Reactions getReactions(){
		return reactions;
	}

	@Override
 	public String toString(){
		return 
			"Limits{" + 
			"reactions = '" + reactions + '\'' + 
			"}";
		}
}