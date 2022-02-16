package example.task2.trello.cards;

import com.google.gson.annotations.SerializedName;

public class Cover{

	@SerializedName("idUploadedBackground")
	private Object idUploadedBackground;

	@SerializedName("brightness")
	private String brightness;

	@SerializedName("color")
	private Object color;

	@SerializedName("size")
	private String size;

	@SerializedName("idAttachment")
	private Object idAttachment;

	@SerializedName("idPlugin")
	private Object idPlugin;

	public void setIdUploadedBackground(Object idUploadedBackground){
		this.idUploadedBackground = idUploadedBackground;
	}

	public Object getIdUploadedBackground(){
		return idUploadedBackground;
	}

	public void setBrightness(String brightness){
		this.brightness = brightness;
	}

	public String getBrightness(){
		return brightness;
	}

	public void setColor(Object color){
		this.color = color;
	}

	public Object getColor(){
		return color;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setIdAttachment(Object idAttachment){
		this.idAttachment = idAttachment;
	}

	public Object getIdAttachment(){
		return idAttachment;
	}

	public void setIdPlugin(Object idPlugin){
		this.idPlugin = idPlugin;
	}

	public Object getIdPlugin(){
		return idPlugin;
	}

	@Override
 	public String toString(){
		return 
			"Cover{" + 
			"idUploadedBackground = '" + idUploadedBackground + '\'' + 
			",brightness = '" + brightness + '\'' + 
			",color = '" + color + '\'' + 
			",size = '" + size + '\'' + 
			",idAttachment = '" + idAttachment + '\'' + 
			",idPlugin = '" + idPlugin + '\'' + 
			"}";
		}
}