//雇员类
public class Emp {
	private int Eid;
	
	private String Ename;
	private Dept dept;//一个雇员属于一个部门
	public Emp() {
		
	}
	public Emp(int Eid,String Ename) {
		this.Eid = Eid;
		this.Ename = Ename;
	}
	
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Dept getDept() {
		return this.dept;
	}
	
	public int getEid() {
		return this.Eid;
	}
	public String getEname() {
		return this.Ename;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getInfo() {
		return "【雇员】Eid = "+Eid+",Ename = "+Ename;
	}
	
}
