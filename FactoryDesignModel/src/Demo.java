

interface IFruit{//定义描述水果的操作
	
	public void eat();
}
class Apple implements IFruit{
	public void eat() {
		System.out.println("吃苹果");
	}
}

class Orange implements IFruit{
	public void eat() {
		System.out.println("剥皮吃橘子");
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
			System.out.println("程序错误");
		}
		IFruit iFruit = Factory.getInstandce(args[0]);
		iFruit.eat();
	}

}
