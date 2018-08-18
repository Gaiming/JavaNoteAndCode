//角色信息
public class Role {
	private int rid;
	private String title;
	private Action[] actions;//多个部门有此角色
	private Dept[] depts;//一个角色有多个权限
	
	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Action[] getActions() {
		return this.actions;
	}

	public void setActions(Action[] actions) {
		this.actions = actions;
	}

	public Dept[] getDepts() {
		return depts;
	}

	public void setDepts(Dept[] depts) {
		this.depts = depts;
	}

	public Role(int rid,String title) {
		this.rid = rid;
		this.title = title;
	}
	
	public String getInfo() {
		return "【角色】Rid= "+this.rid+"title = "+this.title;
	}
}
