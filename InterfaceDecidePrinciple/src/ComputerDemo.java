interface USB{
	public void setup();
	public void work();
	}
class Computer{
	public void plugin(USB usb) {
		usb.setup();
		usb.work();
	}
}
class Flash implements USB{
	public void setup() {
		System.out.println("��װU������");
	}
	public void work() {
		System.out.println("U�̹���");
	}
}

class Printer implements USB{
	public void setup() {
		System.out.println("��װ��ӡ������");
	}
	public void work() {
		System.out.println("��ӡ������");
	}
}

public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer Alienware = new Computer();
		Flash Samsung = new Flash();
		Alienware.plugin(Samsung);
	}

}
