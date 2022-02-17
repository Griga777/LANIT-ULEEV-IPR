package example.task2.trello.attachments;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Attachment{

	@SerializedName("date")
	private String date;

	@SerializedName("fileName")
	private String fileName;

	@SerializedName("idMember")
	private String idMember;

	@SerializedName("mimeType")
	private String mimeType;

	@SerializedName("url")
	private String url;

	@SerializedName("edgeColor")
	private String edgeColor;

	@SerializedName("pos")
	private int pos;

	@SerializedName("bytes")
	private int bytes;

	@SerializedName("name")
	private String name;

	@SerializedName("previews")
	private List<PreviewsItem> previews;

	@SerializedName("id")
	private String id;

	@SerializedName("isUpload")
	private boolean isUpload;

	@SerializedName("limits")
	private Limits limits;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public String getFileName(){
		return fileName;
	}

	public void setIdMember(String idMember){
		this.idMember = idMember;
	}

	public String getIdMember(){
		return idMember;
	}

	public void setMimeType(String mimeType){
		this.mimeType = mimeType;
	}

	public String getMimeType(){
		return mimeType;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEdgeColor(String edgeColor){
		this.edgeColor = edgeColor;
	}

	public String getEdgeColor(){
		return edgeColor;
	}

	public void setPos(int pos){
		this.pos = pos;
	}

	public int getPos(){
		return pos;
	}

	public void setBytes(int bytes){
		this.bytes = bytes;
	}

	public int getBytes(){
		return bytes;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPreviews(List<PreviewsItem> previews){
		this.previews = previews;
	}

	public List<PreviewsItem> getPreviews(){
		return previews;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setIsUpload(boolean isUpload){
		this.isUpload = isUpload;
	}

	public boolean isIsUpload(){
		return isUpload;
	}

	public void setLimits(Limits limits){
		this.limits = limits;
	}

	public Limits getLimits(){
		return limits;
	}

	@Override
 	public String toString(){
		return 
			"Attachment{" + 
			"date = '" + date + '\'' + 
			",fileName = '" + fileName + '\'' + 
			",idMember = '" + idMember + '\'' + 
			",mimeType = '" + mimeType + '\'' + 
			",url = '" + url + '\'' + 
			",edgeColor = '" + edgeColor + '\'' + 
			",pos = '" + pos + '\'' + 
			",bytes = '" + bytes + '\'' + 
			",name = '" + name + '\'' + 
			",previews = '" + previews + '\'' + 
			",id = '" + id + '\'' + 
			",isUpload = '" + isUpload + '\'' + 
			",limits = '" + limits + '\'' + 
			"}";
		}
}