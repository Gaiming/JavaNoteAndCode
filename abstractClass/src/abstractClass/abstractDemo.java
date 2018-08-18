package abstractClass;
abstract class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		System.out.println("per");
	}
	public abstract String getInfo();
}

class Student extends Person{
	private String school;
	public Student(String name,int age,String school){
		super(name, age);//子类构造必须明确调用父类构造
		System.out.println("Stu");
	}
	public String getInfo() {
		return null;
	}
}
public class abstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student("zhang",2,"a");
		
		
	}

}
