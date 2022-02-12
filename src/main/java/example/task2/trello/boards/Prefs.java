package example.task2.trello.boards;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Prefs{

	@SerializedName("backgroundBrightness")
	private String backgroundBrightness;

	@SerializedName("comments")
	private String comments;

	@SerializedName("backgroundTopColor")
	private String backgroundTopColor;

	@SerializedName("canBeEnterprise")
	private boolean canBeEnterprise;

	@SerializedName("hideVotes")
	private boolean hideVotes;

	@SerializedName("backgroundImage")
	private String backgroundImage;

	@SerializedName("canBeOrg")
	private boolean canBeOrg;

	@SerializedName("backgroundBottomColor")
	private String backgroundBottomColor;

	@SerializedName("voting")
	private String voting;

	@SerializedName("calendarFeedEnabled")
	private boolean calendarFeedEnabled;

	@SerializedName("backgroundTile")
	private boolean backgroundTile;

	@SerializedName("canBePublic")
	private boolean canBePublic;

	@SerializedName("canBePrivate")
	private boolean canBePrivate;

	@SerializedName("backgroundImageScaled")
	private List<BackgroundImageScaledItem> backgroundImageScaled;

	@SerializedName("permissionLevel")
	private String permissionLevel;

	@SerializedName("cardAging")
	private String cardAging;

	@SerializedName("canInvite")
	private boolean canInvite;

	@SerializedName("isTemplate")
	private boolean isTemplate;

	@SerializedName("background")
	private String background;

	@SerializedName("cardCovers")
	private boolean cardCovers;

	@SerializedName("selfJoin")
	private boolean selfJoin;

	public void setBackgroundBrightness(String backgroundBrightness){
		this.backgroundBrightness = backgroundBrightness;
	}

	public String getBackgroundBrightness(){
		return backgroundBrightness;
	}

	public void setComments(String comments){
		this.comments = comments;
	}

	public String getComments(){
		return comments;
	}

	public void setBackgroundTopColor(String backgroundTopColor){
		this.backgroundTopColor = backgroundTopColor;
	}

	public String getBackgroundTopColor(){
		return backgroundTopColor;
	}

	public void setCanBeEnterprise(boolean canBeEnterprise){
		this.canBeEnterprise = canBeEnterprise;
	}

	public boolean isCanBeEnterprise(){
		return canBeEnterprise;
	}

	public void setHideVotes(boolean hideVotes){
		this.hideVotes = hideVotes;
	}

	public boolean isHideVotes(){
		return hideVotes;
	}

	public void setBackgroundImage(String backgroundImage){
		this.backgroundImage = backgroundImage;
	}

	public String getBackgroundImage(){
		return backgroundImage;
	}

	public void setCanBeOrg(boolean canBeOrg){
		this.canBeOrg = canBeOrg;
	}

	public boolean isCanBeOrg(){
		return canBeOrg;
	}

	public void setBackgroundBottomColor(String backgroundBottomColor){
		this.backgroundBottomColor = backgroundBottomColor;
	}

	public String getBackgroundBottomColor(){
		return backgroundBottomColor;
	}

	public void setVoting(String voting){
		this.voting = voting;
	}

	public String getVoting(){
		return voting;
	}

	public void setCalendarFeedEnabled(boolean calendarFeedEnabled){
		this.calendarFeedEnabled = calendarFeedEnabled;
	}

	public boolean isCalendarFeedEnabled(){
		return calendarFeedEnabled;
	}

	public void setBackgroundTile(boolean backgroundTile){
		this.backgroundTile = backgroundTile;
	}

	public boolean isBackgroundTile(){
		return backgroundTile;
	}

	public void setCanBePublic(boolean canBePublic){
		this.canBePublic = canBePublic;
	}

	public boolean isCanBePublic(){
		return canBePublic;
	}

	public void setCanBePrivate(boolean canBePrivate){
		this.canBePrivate = canBePrivate;
	}

	public boolean isCanBePrivate(){
		return canBePrivate;
	}

	public void setBackgroundImageScaled(List<BackgroundImageScaledItem> backgroundImageScaled){
		this.backgroundImageScaled = backgroundImageScaled;
	}

	public List<BackgroundImageScaledItem> getBackgroundImageScaled(){
		return backgroundImageScaled;
	}

	public void setPermissionLevel(String permissionLevel){
		this.permissionLevel = permissionLevel;
	}

	public String getPermissionLevel(){
		return permissionLevel;
	}

	public void setCardAging(String cardAging){
		this.cardAging = cardAging;
	}

	public String getCardAging(){
		return cardAging;
	}

	public void setCanInvite(boolean canInvite){
		this.canInvite = canInvite;
	}

	public boolean isCanInvite(){
		return canInvite;
	}

	public void setIsTemplate(boolean isTemplate){
		this.isTemplate = isTemplate;
	}

	public boolean isIsTemplate(){
		return isTemplate;
	}

	public void setBackground(String background){
		this.background = background;
	}

	public String getBackground(){
		return background;
	}

	public void setCardCovers(boolean cardCovers){
		this.cardCovers = cardCovers;
	}

	public boolean isCardCovers(){
		return cardCovers;
	}

	public void setSelfJoin(boolean selfJoin){
		this.selfJoin = selfJoin;
	}

	public boolean isSelfJoin(){
		return selfJoin;
	}

	@Override
 	public String toString(){
		return 
			"Prefs{" + 
			"backgroundBrightness = '" + backgroundBrightness + '\'' + 
			",comments = '" + comments + '\'' + 
			",backgroundTopColor = '" + backgroundTopColor + '\'' + 
			",canBeEnterprise = '" + canBeEnterprise + '\'' + 
			",hideVotes = '" + hideVotes + '\'' + 
			",backgroundImage = '" + backgroundImage + '\'' + 
			",canBeOrg = '" + canBeOrg + '\'' + 
			",backgroundBottomColor = '" + backgroundBottomColor + '\'' + 
			",voting = '" + voting + '\'' + 
			",calendarFeedEnabled = '" + calendarFeedEnabled + '\'' + 
			",backgroundTile = '" + backgroundTile + '\'' + 
			",canBePublic = '" + canBePublic + '\'' + 
			",canBePrivate = '" + canBePrivate + '\'' + 
			",backgroundImageScaled = '" + backgroundImageScaled + '\'' + 
			",permissionLevel = '" + permissionLevel + '\'' + 
			",cardAging = '" + cardAging + '\'' + 
			",canInvite = '" + canInvite + '\'' + 
			",isTemplate = '" + isTemplate + '\'' + 
			",background = '" + background + '\'' + 
			",cardCovers = '" + cardCovers + '\'' + 
			",selfJoin = '" + selfJoin + '\'' + 
			"}";
		}
}