package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class MemberCreator{

	@SerializedName("activityBlocked")
	private boolean activityBlocked;

	@SerializedName("avatarHash")
	private String avatarHash;

	@SerializedName("avatarUrl")
	private String avatarUrl;

	@SerializedName("initials")
	private String initials;

	@SerializedName("nonPublicAvailable")
	private boolean nonPublicAvailable;

	@SerializedName("idMemberReferrer")
	private Object idMemberReferrer;

	@SerializedName("fullName")
	private String fullName;

	@SerializedName("id")
	private String id;

	@SerializedName("nonPublic")
	private NonPublic nonPublic;

	@SerializedName("username")
	private String username;

	public void setActivityBlocked(boolean activityBlocked){
		this.activityBlocked = activityBlocked;
	}

	public boolean isActivityBlocked(){
		return activityBlocked;
	}

	public void setAvatarHash(String avatarHash){
		this.avatarHash = avatarHash;
	}

	public String getAvatarHash(){
		return avatarHash;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public void setInitials(String initials){
		this.initials = initials;
	}

	public String getInitials(){
		return initials;
	}

	public void setNonPublicAvailable(boolean nonPublicAvailable){
		this.nonPublicAvailable = nonPublicAvailable;
	}

	public boolean isNonPublicAvailable(){
		return nonPublicAvailable;
	}

	public void setIdMemberReferrer(Object idMemberReferrer){
		this.idMemberReferrer = idMemberReferrer;
	}

	public Object getIdMemberReferrer(){
		return idMemberReferrer;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setNonPublic(NonPublic nonPublic){
		this.nonPublic = nonPublic;
	}

	public NonPublic getNonPublic(){
		return nonPublic;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"MemberCreator{" + 
			"activityBlocked = '" + activityBlocked + '\'' + 
			",avatarHash = '" + avatarHash + '\'' + 
			",avatarUrl = '" + avatarUrl + '\'' + 
			",initials = '" + initials + '\'' + 
			",nonPublicAvailable = '" + nonPublicAvailable + '\'' + 
			",idMemberReferrer = '" + idMemberReferrer + '\'' + 
			",fullName = '" + fullName + '\'' + 
			",id = '" + id + '\'' + 
			",nonPublic = '" + nonPublic + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}