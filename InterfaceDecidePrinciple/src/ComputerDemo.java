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
		System.out.println("安装U盘驱动");
	}
	public void work() {
		System.out.println("U盘工作");
	}
}

class Printer implements USB{
	public void setup() {
		System.out.println("安装打印机驱动");
	}
	public void work() {
		System.out.println("打印机工作");
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
