

class Person{
	private String name;
	private int age;
	public Person(String name ,int age) {
		System.out.println("person���󴴽�");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void printInfo() {
		System.out.println("person��printInfo����");
	}
	
}
class Student extends Person{
	public Student(String name,int age,String school) {
		super(name,age);
		System.out.println("student���󴴽�");
	}
	private String school;

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}
	@Override
	public void printInfo() {
		System.out.println("student��printInfo����");
	}
}
 




public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("ss",22,"qinghjua");
		stu.setAge(6);
		stu.setName("abai");
		stu.setSchool("jialidun");
		stu.printInfo();
		//stu.name =  "ss";
		Person  person  = new Person("ss", 12);
		person.printInfo();
	}

}
