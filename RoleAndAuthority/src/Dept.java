//部门类
public class Dept {
	private int did;
	private String dname;
	private Emp emps[];//一个部门多个雇员
	private Role role;//以部门一个角色
	
	
	public Dept() {
		
	}
	public Dept(int did,String dname) {
		this.did = did;
		this.dname =dname;
	}
	public void setEmps(Emp[] emps) {
		this.emps = emps;
	}
	
	public Emp[] getEmps() {
		return this.emps;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Role getRole() {
		return this.role;
	}
	
	public void setDid(int did) {
		this.did = did;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDid() {
		return this.did;
	}
	public String getDname() {
		return dname;
	}
	public String getInfo() {
		return "【部门】did = "+did+",dname = "+dname;
	}
	
	
	
	
}
