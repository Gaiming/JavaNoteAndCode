interface ISubject{
	public void save();
}
class RealSubject implements ISubject{
	public void save() {
		System.out.println("���˳ɹ�");
	}
}
class ProxySubject implements ISubject{
	private ISubject subject;
	public ProxySubject(ISubject subject) {
		this.subject = subject;
	}
	public void broke() {
		System.out.println("���Ŷ���");
	}
	public void get() {
		System.out.println("�õ�������Ϊ��");
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
