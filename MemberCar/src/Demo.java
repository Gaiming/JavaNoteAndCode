

class Member{
	private String name;
	private int age;
	private Car car;//car = null;没有车
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
		return "【Car】name:"+this.name+"，price："+this.price;
	}	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//根据关系设置数据
		Member men = new Member("huang", 21);
		Car car = new Car("法拉利", 3000000);
		Member child = new Member("lv", 2);
		
		Car cc = new Car("宝马", 3);
		child.setFather(men);
		men.setChild(child);
		child.setCar(cc);
		men.setCar(car);
		car.setMember(men);
		//根据关系取出数据
		//3、通过人可以到车
		System.out.println(men.getMemberInfo());
		System.out.println(men.getCar().getCarInfo());
		//t通过车找到人
		System.out.println(car.getMember().getMemberInfo());
		//通过人找到儿子的车
		System.out.println(men.getChild().getCar().getCarInfo());
		
		//通过儿子找父亲的车
		System.out.println(child.getFather().getCar().getCarInfo());
		
	}

}
