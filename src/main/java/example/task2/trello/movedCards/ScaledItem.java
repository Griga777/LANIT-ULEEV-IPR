package example.task2.trello.movedCards;

import com.google.gson.annotations.SerializedName;

public class ScaledItem{

	@SerializedName("scaled")
	private boolean scaled;

	@SerializedName("bytes")
	private int bytes;

	@SerializedName("width")
	private int width;

	@SerializedName("_id")
	private String _id;

	@SerializedName("id")
	private String id;

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

	public void set_Id(String _id){
		this._id = _id;
	}

	public String get_Id(){
		return _id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
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
			"ScaledItem{" + 
			"scaled = '" + scaled + '\'' + 
			",bytes = '" + bytes + '\'' + 
			",width = '" + width + '\'' + 
			",_id = '" + _id + '\'' +
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}