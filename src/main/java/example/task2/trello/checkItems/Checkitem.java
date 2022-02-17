package example.task2.trello.checkItems;

import com.google.gson.annotations.SerializedName;

public class Checkitem{

	@SerializedName("pos")
	private int pos;

	@SerializedName("due")
	private Object due;

	@SerializedName("idChecklist")
	private String idChecklist;

	@SerializedName("idMember")
	private Object idMember;

	@SerializedName("name")
	private String name;

	@SerializedName("nameData")
	private NameData nameData;

	@SerializedName("state")
	private String state;

	@SerializedName("id")
	private String id;

	@SerializedName("limits")
	private Limits limits;

	public void setPos(int pos){
		this.pos = pos;
	}

	public int getPos(){
		return pos;
	}

	public void setDue(Object due){
		this.due = due;
	}

	public Object getDue(){
		return due;
	}

	public void setIdChecklist(String idChecklist){
		this.idChecklist = idChecklist;
	}

	public String getIdChecklist(){
		return idChecklist;
	}

	public void setIdMember(Object idMember){
		this.idMember = idMember;
	}

	public Object getIdMember(){
		return idMember;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNameData(NameData nameData){
		this.nameData = nameData;
	}

	public NameData getNameData(){
		return nameData;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
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
			"Checkitem{" + 
			"pos = '" + pos + '\'' + 
			",due = '" + due + '\'' + 
			",idChecklist = '" + idChecklist + '\'' + 
			",idMember = '" + idMember + '\'' + 
			",name = '" + name + '\'' + 
			",nameData = '" + nameData + '\'' + 
			",state = '" + state + '\'' + 
			",id = '" + id + '\'' + 
			",limits = '" + limits + '\'' + 
			"}";
		}
}