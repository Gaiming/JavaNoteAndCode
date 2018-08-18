
class Outer{
	private String msg = "hello world";
	public void fun(final int num) {
		class Inner{
			public void print() {
				System.out.println("num = "+num);
				System.out.println("msg = "+msg);
			}
		}
		new Inner().print();
	}
	
}



public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.fun(100);
	}

}
