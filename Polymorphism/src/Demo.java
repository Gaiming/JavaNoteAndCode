

class Person{
	public void takeOff() {
		System.out.println("脱掉。。。");
	}
}

class Student extends Person{
	public void takeOff() {
		System.out.println("一件一件脱掉。。。");
	}
}
class Worker extends Person{
	public void takeOff() {
		System.out.println("直接脱掉、、、");
	}
}

class A{
	public void print(){
		// TODO Auto-generated method stub
		System.out.println("A");
	}
}
class B extends A{
	public void print(){
		// TODO Auto-generated method stub
		System.out.println("B");
	}
	public void funB() {
		System.out.println("BfunB");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A a = new B();//实例化子类对象
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		//这时候父类能调用的方法只能是本类定义好的方法
		a.print();//调用被覆写过的方法
		B b = (B)a;
		b.funB();*/
		in(new Worker());
		in(new Student());
	}
	public static void in(Person per) {
		per.takeOff();
	}
		
	

}
