

class Person{
	public void takeOff() {
		System.out.println("�ѵ�������");
	}
}

class Student extends Person{
	public void takeOff() {
		System.out.println("һ��һ���ѵ�������");
	}
}
class Worker extends Person{
	public void takeOff() {
		System.out.println("ֱ���ѵ�������");
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
		/*A a = new B();//ʵ�����������
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		//��ʱ�����ܵ��õķ���ֻ���Ǳ��ඨ��õķ���
		a.print();//���ñ���д���ķ���
		B b = (B)a;
		b.funB();*/
		in(new Worker());
		in(new Student());
	}
	public static void in(Person per) {
		per.takeOff();
	}
		
	

}
