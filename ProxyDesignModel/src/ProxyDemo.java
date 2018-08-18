interface ISubject{
	public void save();
}
class RealSubject implements ISubject{
	public void save() {
		System.out.println("救人成功");
	}
}
class ProxySubject implements ISubject{
	private ISubject subject;
	public ProxySubject(ISubject subject) {
		this.subject = subject;
	}
	public void broke() {
		System.out.println("破门而入");
	}
	public void get() {
		System.out.println("得到见义勇为奖");
	}
	public void save() {
		this.broke();
		this.subject.save();
		this.get();
	}
}
class Factory{
	public static ISubject getInstance() {
		return new ProxySubject(new RealSubject());
	}
}
public class ProxyDemo {
	public static void main(String []ar) {
		ISubject sub = Factory.getInstance();
		sub.save();
	}
}
