package example.task2.trelloAPI.checklists;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Checklist{

	@SerializedName("idBoard")
	private String idBoard;

	@SerializedName("pos")
	private int pos;

	@SerializedName("idCard")
	private String idCard;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("checkItems")
	private List<Object> checkItems;

	@SerializedName("limits")
	private Limits limits;

	public void setIdBoard(String idBoard){
		this.idBoard = idBoard;
	}

	public String getIdBoard(){
		return idBoard;
	}

	public void setPos(int pos){
		this.pos = pos;
	}

	public int getPos(){
		return pos;
	}

	public void setIdCard(String idCard){
		this.idCard = idCard;
	}

	public String getIdCard(){
		return idCard;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCheckItems(List<Object> checkItems){
		this.checkItems = checkItems;
	}

	public List<Object> getCheckItems(){
		return checkItems;
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
			"Checklist{" + 
			"idBoard = '" + idBoard + '\'' + 
			",pos = '" + pos + '\'' + 
			",idCard = '" + idCard + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",checkItems = '" + checkItems + '\'' + 
			",limits = '" + limits + '\'' + 
			"}";
		}
}