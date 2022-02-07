package example.trello.boards;

import com.google.gson.annotations.SerializedName;

public class Board{

	@SerializedName("descData")
	private String descData;

	@SerializedName("idTags")
	private String idTags;

	@SerializedName("pinned")
	private boolean pinned;

	@SerializedName("labelNames")
	private LabelNames labelNames;

	@SerializedName("shortUrl")
	private String shortUrl;

	@SerializedName("dateLastActivity")
	private String dateLastActivity;

	@SerializedName("datePluginDisable")
	private String datePluginDisable;

	@SerializedName("shortLink")
	private String shortLink;

	@SerializedName("memberships")
	private String memberships;

	@SerializedName("creationMethod")
	private String creationMethod;

	@SerializedName("subscribed")
	private boolean subscribed;

	@SerializedName("starred")
	private boolean starred;

	@SerializedName("idOrganization")
	private String idOrganization;

	@SerializedName("dateLastView")
	private String dateLastView;

	@SerializedName("id")
	private String id;

	@SerializedName("limits")
	private Limits limits;

	@SerializedName("powerUps")
	private String powerUps;

	@SerializedName("templateGallery")
	private String templateGallery;

	@SerializedName("url")
	private String url;

	@SerializedName("prefs")
	private Prefs prefs;

	@SerializedName("enterpriseOwned")
	private boolean enterpriseOwned;

	@SerializedName("ixUpdate")
	private int ixUpdate;

	@SerializedName("name")
	private String name;

	@SerializedName("closed")
	private boolean closed;

	@SerializedName("idMemberCreator")
	private String idMemberCreator;

	@SerializedName("desc")
	private String desc;

	public void setDescData(String descData){
		this.descData = descData;
	}

	public String getDescData(){
		return descData;
	}

	public void setIdTags(String idTags){
		this.idTags = idTags;
	}

	public String getIdTags(){
		return idTags;
	}

	public void setPinned(boolean pinned){
		this.pinned = pinned;
	}

	public boolean isPinned(){
		return pinned;
	}

	public void setLabelNames(LabelNames labelNames){
		this.labelNames = labelNames;
	}

	public LabelNames getLabelNames(){
		return labelNames;
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

	public void setDatePluginDisable(String datePluginDisable){
		this.datePluginDisable = datePluginDisable;
	}

	public String getDatePluginDisable(){
		return datePluginDisable;
	}

	public void setShortLink(String shortLink){
		this.shortLink = shortLink;
	}

	public String getShortLink(){
		return shortLink;
	}

	public void setMemberships(String memberships){
		this.memberships = memberships;
	}

	public String getMemberships(){
		return memberships;
	}

	public void setCreationMethod(String creationMethod){
		this.creationMethod = creationMethod;
	}

	public String getCreationMethod(){
		return creationMethod;
	}

	public void setSubscribed(boolean subscribed){
		this.subscribed = subscribed;
	}

	public boolean isSubscribed(){
		return subscribed;
	}

	public void setStarred(boolean starred){
		this.starred = starred;
	}

	public boolean isStarred(){
		return starred;
	}

	public void setIdOrganization(String idOrganization){
		this.idOrganization = idOrganization;
	}

	public String getIdOrganization(){
		return idOrganization;
	}

	public void setDateLastView(String dateLastView){
		this.dateLastView = dateLastView;
	}

	public String getDateLastView(){
		return dateLastView;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setLimits(Limits limits){
		this.limits = limits;
	}

	public Limits getLimits(){
		return limits;
	}

	public void setPowerUps(String powerUps){
		this.powerUps = powerUps;
	}

	public String getPowerUps(){
		return powerUps;
	}

	public void setTemplateGallery(String templateGallery){
		this.templateGallery = templateGallery;
	}

	public String getTemplateGallery(){
		return templateGallery;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setPrefs(Prefs prefs){
		this.prefs = prefs;
	}

	public Prefs getPrefs(){
		return prefs;
	}

	public void setEnterpriseOwned(boolean enterpriseOwned){
		this.enterpriseOwned = enterpriseOwned;
	}

	public boolean isEnterpriseOwned(){
		return enterpriseOwned;
	}

	public void setIxUpdate(int ixUpdate){
		this.ixUpdate = ixUpdate;
	}

	public int getIxUpdate(){
		return ixUpdate;
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

	public void setIdMemberCreator(String idMemberCreator){
		this.idMemberCreator = idMemberCreator;
	}

	public String getIdMemberCreator(){
		return idMemberCreator;
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
			"Board{" + 
			"descData = '" + descData + '\'' + 
			",idTags = '" + idTags + '\'' + 
			",pinned = '" + pinned + '\'' + 
			",labelNames = '" + labelNames + '\'' + 
			",shortUrl = '" + shortUrl + '\'' + 
			",dateLastActivity = '" + dateLastActivity + '\'' + 
			",datePluginDisable = '" + datePluginDisable + '\'' + 
			",shortLink = '" + shortLink + '\'' + 
			",memberships = '" + memberships + '\'' + 
			",creationMethod = '" + creationMethod + '\'' + 
			",subscribed = '" + subscribed + '\'' + 
			",starred = '" + starred + '\'' + 
			",idOrganization = '" + idOrganization + '\'' + 
			",dateLastView = '" + dateLastView + '\'' + 
			",id = '" + id + '\'' + 
			",limits = '" + limits + '\'' + 
			",powerUps = '" + powerUps + '\'' + 
			",templateGallery = '" + templateGallery + '\'' + 
			",url = '" + url + '\'' + 
			",prefs = '" + prefs + '\'' + 
			",enterpriseOwned = '" + enterpriseOwned + '\'' + 
			",ixUpdate = '" + ixUpdate + '\'' + 
			",name = '" + name + '\'' + 
			",closed = '" + closed + '\'' + 
			",idMemberCreator = '" + idMemberCreator + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}