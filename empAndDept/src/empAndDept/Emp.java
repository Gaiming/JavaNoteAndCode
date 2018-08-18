package empAndDept;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Emp mgr;//领导
	private dept dept;
	
	public Emp() {
		
	}
	public Emp(int empno,String ename,String job,double sal,double comm) {
		this.comm = comm ;
		this.empno =empno ;
		this.ename= ename ;
		this.job =job ;
		this.sal =sal ;
	}

	
	public int getEmpno() {
		return this.empno;
	}
	public String getEname() {
		return this.ename;
	}
	public String getJob() {
		return this.job;
	}
	public double getSal() {
		return this.sal;
	}
	public double getComm() {
		return this.comm;
	}
	public Emp getMgr() {
		return this.mgr;
	}
	public dept getDept() {
		return this.dept;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}
	public void setDept(dept dept) {
		this.dept = dept;
	}
	public String getEmpInfo() {
		return "雇员编号："+empno+",姓名："+ename+",职位："+job+",销售额："+sal+",收入："+comm;
	}
	
}
