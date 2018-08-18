

interface IFruit{//��������ˮ���Ĳ���
	
	public void eat();
}
class Apple implements IFruit{
	public void eat() {
		System.out.println("��ƻ��");
	}
}

class Orange implements IFruit{
	public void eat() {
		System.out.println("��Ƥ������");
	}
}
class Factory{
	public static IFruit getInstandce(String ClassName) {
		if("apple".equals(ClassName)) {
			return new Apple();
		}
		if ("orange".equals(ClassName)) {
			return new Orange();
		}
		return null;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=1) {
			System.out.println("�������");
		}
		IFruit iFruit = Factory.getInstandce(args[0]);
		iFruit.eat();
	}

}
