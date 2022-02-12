package example.task2.trello.cards;

import com.google.gson.annotations.SerializedName;

public class PerBoard{

	@SerializedName("warnAt")
	private int warnAt;

	@SerializedName("disableAt")
	private int disableAt;

	@SerializedName("status")
	private String status;

	public void setWarnAt(int warnAt){
		this.warnAt = warnAt;
	}

	public int getWarnAt(){
		return warnAt;
	}

	public void setDisableAt(int disableAt){
		this.disableAt = disableAt;
	}

	public int getDisableAt(){
		return disableAt;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"PerBoard{" + 
			"warnAt = '" + warnAt + '\'' + 
			",disableAt = '" + disableAt + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}