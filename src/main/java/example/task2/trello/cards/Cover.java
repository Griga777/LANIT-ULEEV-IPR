package example.task2.trello.cards;

import com.google.gson.annotations.SerializedName;

public class Cover{

	@SerializedName("idUploadedBackground")
	private boolean idUploadedBackground;

	@SerializedName("brightness")
	private String brightness;

	@SerializedName("color")
	private String color;

	@SerializedName("size")
	private String size;

	@SerializedName("isTemplate")
	private boolean isTemplate;

	public void setIdUploadedBackground(boolean idUploadedBackground){
		this.idUploadedBackground = idUploadedBackground;
	}

	public boolean isIdUploadedBackground(){
		return idUploadedBackground;
	}

	public void setBrightness(String brightness){
		this.brightness = brightness;
	}

	public String getBrightness(){
		return brightness;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setIsTemplate(boolean isTemplate){
		this.isTemplate = isTemplate;
	}

	public boolean isIsTemplate(){
		return isTemplate;
	}

	@Override
 	public String toString(){
		return 
			"Cover{" + 
			"idUploadedBackground = '" + idUploadedBackground + '\'' + 
			",brightness = '" + brightness + '\'' + 
			",color = '" + color + '\'' + 
			",size = '" + size + '\'' + 
			",isTemplate = '" + isTemplate + '\'' + 
			"}";
		}
}