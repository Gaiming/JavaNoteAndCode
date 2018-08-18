

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
	System.out.println("年龄是"+p1.getAge()+"姓名是"+"\n"+p1.getName());	
	System.out.println("年龄是"+a.getAge()+"姓名是"+"\n"+a.getName());	
		
	}
}




class person{
	private String name;
	private int age;
	public void info() {
		System.out.println("年龄是"+age+"姓名是"+"\n"+name);
	}
	
	public person() {//构造方法
		System.out.println("你好！此时调用了构造方法");
	}
	public person(String n) {//构造方法重载
		name = n;
	}
	public person(String n,int a) {//有参构造方法
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