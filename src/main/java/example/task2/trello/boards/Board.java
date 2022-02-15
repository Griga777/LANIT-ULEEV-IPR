package example.task2.trello.boards;

import com.google.gson.annotations.SerializedName;

public class Board{

	@SerializedName("descData")
	private Object descData;

	@SerializedName("pinned")
	private boolean pinned;

	@SerializedName("labelNames")
	private LabelNames labelNames;

	@SerializedName("shortUrl")
	private String shortUrl;

	@SerializedName("url")
	private String url;

	@SerializedName("prefs")
	private Prefs prefs;

	@SerializedName("idEnterprise")
	private Object idEnterprise;

	@SerializedName("name")
	private String name;

	@SerializedName("idOrganization")
	private String idOrganization;

	@SerializedName("closed")
	private boolean closed;

	@SerializedName("id")
	private String id;

	@SerializedName("limits")
	private Limits limits;

	@SerializedName("desc")
	private String desc;

	public void setDescData(Object descData){
		this.descData = descData;
	}

	public Object getDescData(){
		return descData;
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

	public void setIdEnterprise(Object idEnterprise){
		this.idEnterprise = idEnterprise;
	}

	public Object getIdEnterprise(){
		return idEnterprise;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIdOrganization(String idOrganization){
		this.idOrganization = idOrganization;
	}

	public String getIdOrganization(){
		return idOrganization;
	}

	public void setClosed(boolean closed){
		this.closed = closed;
	}

	public boolean isClosed(){
		return closed;
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
			",pinned = '" + pinned + '\'' + 
			",labelNames = '" + labelNames + '\'' + 
			",shortUrl = '" + shortUrl + '\'' + 
			",url = '" + url + '\'' + 
			",prefs = '" + prefs + '\'' + 
			",idEnterprise = '" + idEnterprise + '\'' + 
			",name = '" + name + '\'' + 
			",idOrganization = '" + idOrganization + '\'' + 
			",closed = '" + closed + '\'' + 
			",id = '" + id + '\'' + 
			",limits = '" + limits + '\'' + 
			",desc = '" + desc + '\'' + 
			"}";
		}
}