package empAndDept;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp a =  new Emp(1, "һ��Ա��"," Ա��", 20, 10);
		Emp b = new Emp(2,"����","Ա��",20,10);
		Emp c = new Emp(3, "����", "����", 222, 122);
		Emp d = new Emp(0, "0��", "boss", 22222222, 11111111);
		dept a1 = new dept(1, "lajidui", "hojie");
		a.setDept(a1);
		b.setDept(a1);
		c.setDept(a1);
		a.setMgr(c);
		b.setMgr(c);
		c.setMgr(d);
		Emp[] ss = new Emp[] {a,b,c};
		a1.setEmp(ss);
		a1.getEmpsInfo(ss);
		System.out.println(a1.getDeptInfo());
		
		for (int i = 0; i < a1.getEmps().length; i++) {
			System.out.println(a1.getEmps()[i].getEmpInfo());
		}
		if(a.getMgr()!=null) {
		System.out.println(a.getMgr().getEmpInfo());
		}
	}

}
