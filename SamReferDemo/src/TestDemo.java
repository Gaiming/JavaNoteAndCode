

 class Message{
	private String note;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}



public class TestDemo {
	public static void main(String args[]) {
		Message msg = new Message();
		int n = 8;
		msg.setNote("hello");
		fun(msg);
		System.out.println(msg.getNote());
		TestInt(n);
		System.out.println(n);
	}
	public static void fun(Message temp) {
		temp.setNote("world");
	}
	public static void TestInt(int i) {
		i = 4;
	}
	/*public static void main(String args[]) {
		String str = "hello";
		fun(str);
		System.out.println(str);
	}
	public static void fun(String temp) {
		temp = "world";
	}*/
	
}






