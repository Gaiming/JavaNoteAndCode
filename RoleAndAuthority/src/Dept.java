//������
public class Dept {
	private int did;
	private String dname;
	private Emp emps[];//һ�����Ŷ����Ա
	private Role role;//�Բ���һ����ɫ
	
	
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
		return "�����š�did = "+did+",dname = "+dname;
	}
	
	
	
	
}
