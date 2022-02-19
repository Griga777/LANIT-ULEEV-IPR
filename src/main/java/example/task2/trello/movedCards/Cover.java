package example.task2.trello.movedCards;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Cover{

	@SerializedName("idUploadedBackground")
	private Object idUploadedBackground;

	@SerializedName("edgeColor")
	private String edgeColor;

	@SerializedName("brightness")
	private String brightness;

	@SerializedName("color")
	private Object color;

	@SerializedName("size")
	private String size;

	@SerializedName("scaled")
	private List<ScaledItem> scaled;

	@SerializedName("idAttachment")
	private String idAttachment;

	@SerializedName("idPlugin")
	private Object idPlugin;

	public void setIdUploadedBackground(Object idUploadedBackground){
		this.idUploadedBackground = idUploadedBackground;
	}

	public Object getIdUploadedBackground(){
		return idUploadedBackground;
	}

	public void setEdgeColor(String edgeColor){
		this.edgeColor = edgeColor;
	}

	public String getEdgeColor(){
		return edgeColor;
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

	public void setScaled(List<ScaledItem> scaled){
		this.scaled = scaled;
	}

	public List<ScaledItem> getScaled(){
		return scaled;
	}

	public void setIdAttachment(String idAttachment){
		this.idAttachment = idAttachment;
	}

	public String getIdAttachment(){
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
			",edgeColor = '" + edgeColor + '\'' + 
			",brightness = '" + brightness + '\'' + 
			",color = '" + color + '\'' + 
			",size = '" + size + '\'' + 
			",scaled = '" + scaled + '\'' + 
			",idAttachment = '" + idAttachment + '\'' + 
			",idPlugin = '" + idPlugin + '\'' + 
			"}";
		}
}