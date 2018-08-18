package sampleJavaClass;

public class emp {
	private int emId = 0;
	private String emname;
	private String eJob ;
	private double sal;
	private double comm;
	public emp() {
		System.out.println("这时一个新的emp对象出现了");
	}
	public emp(int emId) {
		this();
		this.emId = emId;
	}
	public emp(int eno,String name,String job,double sa,double com) {
		this();
		this.setemId(eno);
		setemname(name);
		seteJob(job);
		setSal(sa);
		setComm(com);
	}
	public void setemId(int emId) {
		this.emId = emId;
	}
	public void setemname(String name) {
		emname = name;
		
	}
	public void seteJob(String job) {
		eJob = job;
	}
	public void setSal(double sa) {
		sal = sa;
	}
	public void setComm(double com) {
		comm = com;
	}
	public int getemId() {
		return emId;
	}
	public String getemname() {
		return emname;
	}
	public String getJob() {
		return eJob;
	}
	
	public double getSal() {
		return sal;
	}
	public double getComm() {
		return comm;
	}
	public String getInfo() {
		return "emId="+emId+"\n"+
					"emname = "+emname+"\n"+
					"ejob = "+eJob+"\n"+
					"sal = "+sal+"\n"+
					"comm = "+comm;
	}
}
