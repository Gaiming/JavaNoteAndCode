package empAndDept;

public class dept {
	private int deptno;
	private String dname;
	private String loc;
	private Emp[] emps;
	
	
	
	
	public dept() {
		
	}
	public dept(int deptno,String dname,String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public void setEmp(Emp[] emps) {
		this.emps = emps;
	}
	public Emp[] getEmps() {
		return this.emps;
	}
	public void getEmpsInfo(Emp[] emps) {
		for(int i =0;i<emps.length;i++) {
			System.out.println(emps[i].getEmpInfo());
		}
	}
	
	public int getdeptno() {
		return this.deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setdeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {

		this.loc = loc;
	}
	public String getDeptInfo() {
		return "deptno:"+deptno+"dname:"+dname+"loc:"+loc;
	}
	

}
