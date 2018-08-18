package sampleJavaClass;
public  class employeeIm {
	public static void main(String args[]) {
		System.out.println("第一个简单java类emp:");
		emp  a  = new emp(223,"huang","zongjian",8000.0,800.0);
		String s  = a.getInfo();
		System.out.println(s);
		System.out.println("第二个简单java类Student：");
		Student a1 = new Student(31, "huangyiming", 7, 98, 122, 107);
		System.out.print(a1.getStudentIm());		
		
		
		}


/*class Emp{
	private int emId = 0;
	private String emname;
	private String eJob ;
	private double sal;
	private double comm;
	public Emp(int eno,String name,String job,double sa,double com) {
		setemId(eno);
		setemname(name);
		seteJob(job);
		setSal(sa);
		setComm(com);
	}
	public void setemId(int eno) {
		emId = eno;
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
					"comm = "+comm+"\n";
	}
}*/

	}
