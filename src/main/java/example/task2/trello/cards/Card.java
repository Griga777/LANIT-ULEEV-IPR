package example.task2.trello.cards;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Card{

	@SerializedName("descData")
	private DescData descData;

	@SerializedName("idLabels")
	private List<IdLabelsItem> idLabels;

	@SerializedName("shortUrl")
	private String shortUrl;

	@SerializedName("dateLastActivity")
	private String dateLastActivity;

	@SerializedName("idList")
	private String idList;

	@SerializedName("idMembersVoted")
	private List<String> idMembersVoted;

	@SerializedName("shortLink")
	private String shortLink;

	@SerializedName("creationMethod")
	private String creationMethod;

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("dueReminder")
	private String dueReminder;

	@SerializedName("subscribed")
	private boolean subscribed;

	@SerializedName("pos")
	private int pos;

	@SerializedName("idChecklists")
	private List<IdChecklistsItem> idChecklists;

	@SerializedName("id")
	private String id;

	@SerializedName("email")
	private String email;

	@SerializedName("limits")
	private Limits limits;

	@SerializedName("address")
	private String address;

	@SerializedName("idBoard")
	private String idBoard;

	@SerializedName("locationName")
	private String locationName;

	@SerializedName("coordinates")
	private String coordinates;

	@SerializedName("checkItemStates")
	private List<String> checkItemStates;

	@SerializedName("url")
	private String url;

	@SerializedName("labels")
	private List<String> labels;

	@SerializedName("badges")
	private Badges badges;

	@SerializedName("idMembers")
	private List<String> idMembers;

	@SerializedName("idShort")
	private int idShort;

	@SerializedName("due")
	private String due;

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

	public void setIdLabels(List<IdLabelsItem> idLabels){
		this.idLabels = idLabels;
	}

	public List<IdLabelsItem> getIdLabels(){
		return idLabels;
	}

	public void setShortUrl(String shortUrl){
		this.shortUrl = shortUrl;
	}

	public String getShortUrl(){
		return shortUrl;
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

	public void setIdMembersVoted(List<String> idMembersVoted){
		this.idMembersVoted = idMembersVoted;
	}

	public List<String> getIdMembersVoted(){
		return idMembersVoted;
	}

	public void setShortLink(String shortLink){
		this.shortLink = shortLink;
	}

	public String getShortLink(){
		return shortLink;
	}

	public void setCreationMethod(String creationMethod){
		this.creationMethod = creationMethod;
	}

	public String getCreationMethod(){
		return creationMethod;
	}

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setDueReminder(String dueReminder){
		this.dueReminder = dueReminder;
	}

	public String getDueReminder(){
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

	public void setIdChecklists(List<IdChecklistsItem> idChecklists){
		this.idChecklists = idChecklists;
	}

	public List<IdChecklistsItem> getIdChecklists(){
		return idChecklists;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setLimits(Limits limits){
		this.limits = limits;
	}

	public Limits getLimits(){
		return limits;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setIdBoard(String idBoard){
		this.idBoard = idBoard;
	}

	public String getIdBoard(){
		return idBoard;
	}

	public void setLocationName(String locationName){
		this.locationName = locationName;
	}

	public String getLocationName(){
		return locationName;
	}

	public void setCoordinates(String coordinates){
		this.coordinates = coordinates;
	}

	public String getCoordinates(){
		return coordinates;
	}

	public void setCheckItemStates(List<String> checkItemStates){
		this.checkItemStates = checkItemStates;
	}

	public List<String> getCheckItemStates(){
		return checkItemStates;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setLabels(List<String> labels){
		this.labels = labels;
	}

	public List<String> getLabels(){
		return labels;
	}

	public void setBadges(Badges badges){
		this.badges = badges;
	}

	public Badges getBadges(){
		return badges;
	}

	public void setIdMembers(List<String> idMembers){
		this.idMembers = idMembers;
	}

	public List<String> getIdMembers(){
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
			"Card{" + 
			"descData = '" + descData + '\'' + 
			",idLabels = '" + idLabels + '\'' + 
			",shortUrl = '" + shortUrl + '\'' + 
			",dateLastActivity = '" + dateLastActivity + '\'' + 
			",idList = '" + idList + '\'' + 
			",idMembersVoted = '" + idMembersVoted + '\'' + 
			",shortLink = '" + shortLink + '\'' + 
			",creationMethod = '" + creationMethod + '\'' + 
			",cover = '" + cover + '\'' + 
			",dueReminder = '" + dueReminder + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",pos = '" + pos + '\'' + 
			",idChecklists = '" + idChecklists + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",limits = '" + limits + '\'' + 
			",address = '" + address + '\'' + 
			",idBoard = '" + idBoard + '\'' + 
			",locationName = '" + locationName + '\'' + 
			",coordinates = '" + coordinates + '\'' + 
			",checkItemStates = '" + checkItemStates + '\'' + 
			",url = '" + url + '\'' + 
			",labels = '" + labels + '\'' + 
			",badges = '" + badges + '\'' + 
			",idMembers = '" + idMembers + '\'' + 
			",idShort = '" + idShort + '\'' + 
			",due = '" + due + '\'' + 
			",name = '" + name + '\'' + 
			",closed = '" + closed + '\'' + 
			",manualCoverAttachment = '" + manualCoverAttachment + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}