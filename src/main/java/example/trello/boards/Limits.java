package example.trello.boards;

import com.google.gson.annotations.SerializedName;

public class Limits{

	@SerializedName("attachments")
	private Attachments attachments;

	public void setAttachments(Attachments attachments){
		this.attachments = attachments;
	}

	public Attachments getAttachments(){
		return attachments;
	}

	@Override
 	public String toString(){
		return 
			"Limits{" + 
			"attachments = '" + attachments + '\'' + 
			"}";
		}
}