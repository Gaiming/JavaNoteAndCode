//��Ա��
public class Emp {
	private int Eid;
	
	private String Ename;
	private Dept dept;//һ����Ա����һ������
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
		return "����Ա��Eid = "+Eid+",Ename = "+Ename;
	}
	
}
