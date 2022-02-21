package example.task2.trelloAPI.attachments;

import com.google.gson.annotations.SerializedName;

public class PreviewsItem{

	@SerializedName("scaled")
	private boolean scaled;

	@SerializedName("bytes")
	private int bytes;

	@SerializedName("width")
	private int width;

	@SerializedName("id")
	private String id;

	@SerializedName("_id")
	private String _id;

	@SerializedName("url")
	private String url;

	@SerializedName("height")
	private int height;

	public void setScaled(boolean scaled){
		this.scaled = scaled;
	}

	public boolean isScaled(){
		return scaled;
	}

	public void setBytes(int bytes){
		this.bytes = bytes;
	}

	public int getBytes(){
		return bytes;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void set_Id(String _id){
		this._id = _id;
	}

	public String get_Id(){
		return _id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"PreviewsItem{" + 
			"scaled = '" + scaled + '\'' + 
			",bytes = '" + bytes + '\'' + 
			",width = '" + width + '\'' + 
			",id = '" + id + '\'' + 
			",_id = '" + _id + '\'' +
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}