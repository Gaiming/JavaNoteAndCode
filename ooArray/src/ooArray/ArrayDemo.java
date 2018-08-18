package ooArray;
class person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public person() {
		
	}
	public person(String n,int a) {
		this.name = n;
		this.age = a;
	}
	public String getInfo(){
		return "姓名："+name+"，年龄："+age;
	}
	public void fun() {
		System.out.println("【fun方法】"+this);
	}
}


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	person pr[] = new person[3];
	pr[0] = new person("zhang", 3);
	pr[1] = new person("zhang", 3);
	pr[2] = new person("zhang", 3);
	for (int i = 0; i < pr.length; i++) {
		System.out.println(pr[i].getInfo());
	}
	person p1 = new person();
	System.out.println("【main方法】"+p1);//对象地址
	p1.fun();
	person p2 = new person();
	System.out.println("【main方法】"+p2);
	p2.fun();
	}

}
