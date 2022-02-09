package example.trello.cards;

import com.google.gson.annotations.SerializedName;

public class Badges{

	@SerializedName("comments")
	private int comments;

	@SerializedName("attachments")
	private int attachments;

	@SerializedName("attachmentsByType")
	private AttachmentsByType attachmentsByType;

	@SerializedName("dueComplete")
	private boolean dueComplete;

	@SerializedName("description")
	private boolean description;

	@SerializedName("subscribed")
	private boolean subscribed;

	@SerializedName("due")
	private String due;

	@SerializedName("viewingMemberVoted")
	private boolean viewingMemberVoted;

	@SerializedName("location")
	private boolean location;

	@SerializedName("votes")
	private int votes;

	@SerializedName("fogbugz")
	private String fogbugz;

	@SerializedName("checkItems")
	private int checkItems;

	@SerializedName("checkItemsChecked")
	private int checkItemsChecked;

	public void setComments(int comments){
		this.comments = comments;
	}

	public int getComments(){
		return comments;
	}

	public void setAttachments(int attachments){
		this.attachments = attachments;
	}

	public int getAttachments(){
		return attachments;
	}

	public void setAttachmentsByType(AttachmentsByType attachmentsByType){
		this.attachmentsByType = attachmentsByType;
	}

	public AttachmentsByType getAttachmentsByType(){
		return attachmentsByType;
	}

	public void setDueComplete(boolean dueComplete){
		this.dueComplete = dueComplete;
	}

	public boolean isDueComplete(){
		return dueComplete;
	}

	public void setDescription(boolean description){
		this.description = description;
	}

	public boolean isDescription(){
		return description;
	}

	public void setSubscribed(boolean subscribed){
		this.subscribed = subscribed;
	}

	public boolean isSubscribed(){
		return subscribed;
	}

	public void setDue(String due){
		this.due = due;
	}

	public String getDue(){
		return due;
	}

	public void setViewingMemberVoted(boolean viewingMemberVoted){
		this.viewingMemberVoted = viewingMemberVoted;
	}

	public boolean isViewingMemberVoted(){
		return viewingMemberVoted;
	}

	public void setLocation(boolean location){
		this.location = location;
	}

	public boolean isLocation(){
		return location;
	}

	public void setVotes(int votes){
		this.votes = votes;
	}

	public int getVotes(){
		return votes;
	}

	public void setFogbugz(String fogbugz){
		this.fogbugz = fogbugz;
	}

	public String getFogbugz(){
		return fogbugz;
	}

	public void setCheckItems(int checkItems){
		this.checkItems = checkItems;
	}

	public int getCheckItems(){
		return checkItems;
	}

	public void setCheckItemsChecked(int checkItemsChecked){
		this.checkItemsChecked = checkItemsChecked;
	}

	public int getCheckItemsChecked(){
		return checkItemsChecked;
	}

	@Override
 	public String toString(){
		return 
			"Badges{" + 
			"comments = '" + comments + '\'' + 
			",attachments = '" + attachments + '\'' + 
			",attachmentsByType = '" + attachmentsByType + '\'' + 
			",dueComplete = '" + dueComplete + '\'' + 
			",description = '" + description + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",due = '" + due + '\'' + 
			",viewingMemberVoted = '" + viewingMemberVoted + '\'' + 
			",location = '" + location + '\'' + 
			",votes = '" + votes + '\'' + 
			",fogbugz = '" + fogbugz + '\'' + 
			",checkItems = '" + checkItems + '\'' + 
			",checkItemsChecked = '" + checkItemsChecked + '\'' + 
			"}";
		}
}