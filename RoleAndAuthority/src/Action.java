//权限
public class Action {
	private int Aid;
	private String title;
	private String flag;
	private Role roles[];
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Role[] getRoles() {
		return roles;
	}
	public void setRoles(Role[] roles) {
		this.roles = roles;
	}
	public Action(int Aid,String title,String flag) {
		this.Aid = Aid;
		this.flag = flag;
		this.title = title;
	}
	public String getInfo() {
		return "【权限】Aid = "+Aid+"title = "+title+"flag = "+flag;
	}
	
}
