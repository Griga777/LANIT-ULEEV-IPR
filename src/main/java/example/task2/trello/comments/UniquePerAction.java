package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class UniquePerAction{

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
			"UniquePerAction{" + 
			"warnAt = '" + warnAt + '\'' + 
			",disableAt = '" + disableAt + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}