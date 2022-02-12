package example.task2.trello.lists;

import com.google.gson.annotations.SerializedName;

public class List{

	@SerializedName("idBoard")
	private String idBoard;

	@SerializedName("pos")
	private int pos;

	@SerializedName("name")
	private String name;

	@SerializedName("closed")
	private boolean closed;

	@SerializedName("id")
	private String id;

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

	@Override
 	public String toString(){
		return 
			"List{" + 
			"idBoard = '" + idBoard + '\'' + 
			",pos = '" + pos + '\'' + 
			",name = '" + name + '\'' + 
			",closed = '" + closed + '\'' + 
			",id = '" + id + '\'' + 
			",limits = '" + limits + '\'' + 
			"}";
		}
}