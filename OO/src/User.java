

public class User {
	public static void main(String args[]) {
	person a = new person();
	a.info();
	person p1 =new person();
	person p2 = new person();
	p1.setName("blue");
	p1.setAge(19);;
	p2 = p1;
	p2.setName("yellow");;
	System.out.println("������"+p1.getAge()+"������"+"\n"+p1.getName());	
	System.out.println("������"+a.getAge()+"������"+"\n"+a.getName());	
		
	}
}




class person{
	private String name;
	private int age;
	public void info() {
		System.out.println("������"+age+"������"+"\n"+name);
	}
	
	public person() {//���췽��
		System.out.println("��ã���ʱ�����˹��췽��");
	}
	public person(String n) {//���췽������
		name = n;
	}
	public person(String n,int a) {//�вι��췽��
		name = n;
		setAge(a);
	}
	public void setName(String name1) {
		name = name1;
	}
	public void setAge(int age1) {
		if (age1<0) {
			age = 0;
		}
		else {
			age = age1;
		};
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}