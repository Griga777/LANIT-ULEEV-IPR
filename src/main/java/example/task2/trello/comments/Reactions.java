package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class Reactions{

	@SerializedName("perAction")
	private PerAction perAction;

	@SerializedName("uniquePerAction")
	private UniquePerAction uniquePerAction;

	public void setPerAction(PerAction perAction){
		this.perAction = perAction;
	}

	public PerAction getPerAction(){
		return perAction;
	}

	public void setUniquePerAction(UniquePerAction uniquePerAction){
		this.uniquePerAction = uniquePerAction;
	}

	public UniquePerAction getUniquePerAction(){
		return uniquePerAction;
	}

	@Override
 	public String toString(){
		return 
			"Reactions{" + 
			"perAction = '" + perAction + '\'' + 
			",uniquePerAction = '" + uniquePerAction + '\'' + 
			"}";
		}
}