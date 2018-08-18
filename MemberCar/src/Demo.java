

class Member{
	private String name;
	private int age;
	private Car car;//car = null;û�г�
	private Member child;
	private Member father;
	
	
	public Member(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Car getCar() {
		return this.car;
	}
	public void setChild(Member child) {
		this.child = child;
	}
	public Member getChild() {
		return this.child;
	}
	public void setFather(Member father) {
		this.father = father;
	}
	public Member getFather() {
		return this.father;
	}
	public String getMemberInfo() {
		return "name:"+this.name+",age:"+this.age;
	}
}
class Car{
	private String name ;
	private double price;
	private Member member;
	public Car(String name,double price) {
		this.name=name;
		this.price = price;
	}
	public void setMember(Member member) {
		this.member= member;
		
	}
	public Member getMember() {
		return this.member;
	}
	public String getCarInfo() {
		return "��Car��name:"+this.name+"��price��"+this.price;
	}	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ݹ�ϵ��������
		Member men = new Member("huang", 21);
		Car car = new Car("������", 3000000);
		Member child = new Member("lv", 2);
		
		Car cc = new Car("����", 3);
		child.setFather(men);
		men.setChild(child);
		child.setCar(cc);
		men.setCar(car);
		car.setMember(men);
		//���ݹ�ϵȡ������
		//3��ͨ���˿��Ե���
		System.out.println(men.getMemberInfo());
		System.out.println(men.getCar().getCarInfo());
		//tͨ�����ҵ���
		System.out.println(car.getMember().getMemberInfo());
		//ͨ�����ҵ����ӵĳ�
		System.out.println(men.getChild().getCar().getCarInfo());
		
		//ͨ�������Ҹ��׵ĳ�
		System.out.println(child.getFather().getCar().getCarInfo());
		
	}

}
