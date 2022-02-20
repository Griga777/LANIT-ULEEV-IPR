package example.task2.trello.comments;

import com.google.gson.annotations.SerializedName;

public class CommentItem{

	@SerializedName("date")
	private String date;

	@SerializedName("data")
	private Data data;

	@SerializedName("appCreator")
	private AppCreator appCreator;

	@SerializedName("memberCreator")
	private MemberCreator memberCreator;

	@SerializedName("id")
	private String id;

	@SerializedName("type")
	private String type;

	@SerializedName("idMemberCreator")
	private String idMemberCreator;

	@SerializedName("limits")
	private Limits limits;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setAppCreator(AppCreator appCreator){
		this.appCreator = appCreator;
	}

	public AppCreator getAppCreator(){
		return appCreator;
	}

	public void setMemberCreator(MemberCreator memberCreator){
		this.memberCreator = memberCreator;
	}

	public MemberCreator getMemberCreator(){
		return memberCreator;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setIdMemberCreator(String idMemberCreator){
		this.idMemberCreator = idMemberCreator;
	}

	public String getIdMemberCreator(){
		return idMemberCreator;
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
			"CommentItem{" + 
			"date = '" + date + '\'' + 
			",data = '" + data + '\'' + 
			",appCreator = '" + appCreator + '\'' + 
			",memberCreator = '" + memberCreator + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",idMemberCreator = '" + idMemberCreator + '\'' + 
			",limits = '" + limits + '\'' + 
			"}";
		}
}