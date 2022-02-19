package example.task2.trello.movedCards;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovedCard{

	@SerializedName("descData")
	private DescData descData;

	@SerializedName("idLabels")
	private List<Object> idLabels;

	@SerializedName("shortUrl")
	private String shortUrl;

	@SerializedName("dueComplete")
	private boolean dueComplete;

	@SerializedName("dateLastActivity")
	private String dateLastActivity;

	@SerializedName("idList")
	private String idList;

	@SerializedName("idMembersVoted")
	private List<Object> idMembersVoted;

	@SerializedName("shortLink")
	private String shortLink;

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("dueReminder")
	private Object dueReminder;

	@SerializedName("subscribed")
	private boolean subscribed;

	@SerializedName("pos")
	private int pos;

	@SerializedName("idChecklists")
	private List<String> idChecklists;

	@SerializedName("id")
	private String id;

	@SerializedName("email")
	private Object email;

	@SerializedName("idBoard")
	private String idBoard;

	@SerializedName("cardRole")
	private Object cardRole;

	@SerializedName("start")
	private Object start;

	@SerializedName("checkItemStates")
	private List<CheckItemStatesItem> checkItemStates;

	@SerializedName("url")
	private String url;

	@SerializedName("labels")
	private List<Object> labels;

	@SerializedName("badges")
	private Badges badges;

	@SerializedName("idMembers")
	private List<Object> idMembers;

	@SerializedName("idShort")
	private int idShort;

	@SerializedName("due")
	private String due;

	@SerializedName("idAttachmentCover")
	private String idAttachmentCover;

	@SerializedName("isTemplate")
	private boolean isTemplate;

	@SerializedName("name")
	private String name;

	@SerializedName("closed")
	private boolean closed;

	@SerializedName("manualCoverAttachment")
	private boolean manualCoverAttachment;

	@SerializedName("desc")
	private String desc;

	public void setDescData(DescData descData){
		this.descData = descData;
	}

	public DescData getDescData(){
		return descData;
	}

	public void setIdLabels(List<Object> idLabels){
		this.idLabels = idLabels;
	}

	public List<Object> getIdLabels(){
		return idLabels;
	}

	public void setShortUrl(String shortUrl){
		this.shortUrl = shortUrl;
	}

	public String getShortUrl(){
		return shortUrl;
	}

	public void setDueComplete(boolean dueComplete){
		this.dueComplete = dueComplete;
	}

	public boolean isDueComplete(){
		return dueComplete;
	}

	public void setDateLastActivity(String dateLastActivity){
		this.dateLastActivity = dateLastActivity;
	}

	public String getDateLastActivity(){
		return dateLastActivity;
	}

	public void setIdList(String idList){
		this.idList = idList;
	}

	public String getIdList(){
		return idList;
	}

	public void setIdMembersVoted(List<Object> idMembersVoted){
		this.idMembersVoted = idMembersVoted;
	}

	public List<Object> getIdMembersVoted(){
		return idMembersVoted;
	}

	public void setShortLink(String shortLink){
		this.shortLink = shortLink;
	}

	public String getShortLink(){
		return shortLink;
	}

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setDueReminder(Object dueReminder){
		this.dueReminder = dueReminder;
	}

	public Object getDueReminder(){
		return dueReminder;
	}

	public void setSubscribed(boolean subscribed){
		this.subscribed = subscribed;
	}

	public boolean isSubscribed(){
		return subscribed;
	}

	public void setPos(int pos){
		this.pos = pos;
	}

	public int getPos(){
		return pos;
	}

	public void setIdChecklists(List<String> idChecklists){
		this.idChecklists = idChecklists;
	}

	public List<String> getIdChecklists(){
		return idChecklists;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setEmail(Object email){
		this.email = email;
	}

	public Object getEmail(){
		return email;
	}

	public void setIdBoard(String idBoard){
		this.idBoard = idBoard;
	}

	public String getIdBoard(){
		return idBoard;
	}

	public void setCardRole(Object cardRole){
		this.cardRole = cardRole;
	}

	public Object getCardRole(){
		return cardRole;
	}

	public void setStart(Object start){
		this.start = start;
	}

	public Object getStart(){
		return start;
	}

	public void setCheckItemStates(List<CheckItemStatesItem> checkItemStates){
		this.checkItemStates = checkItemStates;
	}

	public List<CheckItemStatesItem> getCheckItemStates(){
		return checkItemStates;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setLabels(List<Object> labels){
		this.labels = labels;
	}

	public List<Object> getLabels(){
		return labels;
	}

	public void setBadges(Badges badges){
		this.badges = badges;
	}

	public Badges getBadges(){
		return badges;
	}

	public void setIdMembers(List<Object> idMembers){
		this.idMembers = idMembers;
	}

	public List<Object> getIdMembers(){
		return idMembers;
	}

	public void setIdShort(int idShort){
		this.idShort = idShort;
	}

	public int getIdShort(){
		return idShort;
	}

	public void setDue(String due){
		this.due = due;
	}

	public String getDue(){
		return due;
	}

	public void setIdAttachmentCover(String idAttachmentCover){
		this.idAttachmentCover = idAttachmentCover;
	}

	public String getIdAttachmentCover(){
		return idAttachmentCover;
	}

	public void setIsTemplate(boolean isTemplate){
		this.isTemplate = isTemplate;
	}

	public boolean isIsTemplate(){
		return isTemplate;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setClosed(boolean closed){
		this.closed = closed;
	}

	public boolean isClosed(){
		return closed;
	}

	public void setManualCoverAttachment(boolean manualCoverAttachment){
		this.manualCoverAttachment = manualCoverAttachment;
	}

	public boolean isManualCoverAttachment(){
		return manualCoverAttachment;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	@Override
 	public String toString(){
		return 
			"MovedCard{" + 
			"descData = '" + descData + '\'' + 
			",idLabels = '" + idLabels + '\'' + 
			",shortUrl = '" + shortUrl + '\'' + 
			",dueComplete = '" + dueComplete + '\'' + 
			",dateLastActivity = '" + dateLastActivity + '\'' + 
			",idList = '" + idList + '\'' + 
			",idMembersVoted = '" + idMembersVoted + '\'' + 
			",shortLink = '" + shortLink + '\'' + 
			",cover = '" + cover + '\'' + 
			",dueReminder = '" + dueReminder + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",pos = '" + pos + '\'' + 
			",idChecklists = '" + idChecklists + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",idBoard = '" + idBoard + '\'' + 
			",cardRole = '" + cardRole + '\'' + 
			",start = '" + start + '\'' + 
			",checkItemStates = '" + checkItemStates + '\'' + 
			",url = '" + url + '\'' + 
			",labels = '" + labels + '\'' + 
			",badges = '" + badges + '\'' + 
			",idMembers = '" + idMembers + '\'' + 
			",idShort = '" + idShort + '\'' + 
			",due = '" + due + '\'' + 
			",idAttachmentCover = '" + idAttachmentCover + '\'' + 
			",isTemplate = '" + isTemplate + '\'' + 
			",name = '" + name + '\'' + 
			",closed = '" + closed + '\'' + 
			",manualCoverAttachment = '" + manualCoverAttachment + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}