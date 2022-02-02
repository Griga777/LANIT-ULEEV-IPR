package example.trello;

import com.google.gson.annotations.SerializedName;

public class LabelNames{

	@SerializedName("orange")
	private String orange;

	@SerializedName("red")
	private String red;

	@SerializedName("sky")
	private String sky;

	@SerializedName("pink")
	private String pink;

	@SerializedName("green")
	private String green;

	@SerializedName("blue")
	private String blue;

	@SerializedName("lime")
	private String lime;

	@SerializedName("yellow")
	private String yellow;

	@SerializedName("black")
	private String black;

	@SerializedName("purple")
	private String purple;

	public void setOrange(String orange){
		this.orange = orange;
	}

	public String getOrange(){
		return orange;
	}

	public void setRed(String red){
		this.red = red;
	}

	public String getRed(){
		return red;
	}

	public void setSky(String sky){
		this.sky = sky;
	}

	public String getSky(){
		return sky;
	}

	public void setPink(String pink){
		this.pink = pink;
	}

	public String getPink(){
		return pink;
	}

	public void setGreen(String green){
		this.green = green;
	}

	public String getGreen(){
		return green;
	}

	public void setBlue(String blue){
		this.blue = blue;
	}

	public String getBlue(){
		return blue;
	}

	public void setLime(String lime){
		this.lime = lime;
	}

	public String getLime(){
		return lime;
	}

	public void setYellow(String yellow){
		this.yellow = yellow;
	}

	public String getYellow(){
		return yellow;
	}

	public void setBlack(String black){
		this.black = black;
	}

	public String getBlack(){
		return black;
	}

	public void setPurple(String purple){
		this.purple = purple;
	}

	public String getPurple(){
		return purple;
	}

	@Override
 	public String toString(){
		return 
			"LabelNames{" + 
			"orange = '" + orange + '\'' + 
			",red = '" + red + '\'' + 
			",sky = '" + sky + '\'' + 
			",pink = '" + pink + '\'' + 
			",green = '" + green + '\'' + 
			",blue = '" + blue + '\'' + 
			",lime = '" + lime + '\'' + 
			",yellow = '" + yellow + '\'' + 
			",black = '" + black + '\'' + 
			",purple = '" + purple + '\'' + 
			"}";
		}
}