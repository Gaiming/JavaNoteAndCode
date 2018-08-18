
public class String1 {


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = new String("hello");
		String a2 = new String("hello");
		String a3 = a1;		
		//String a4 = a2;
		System.out.println(a1==a3);
		a3 = "hello";
		//a4 = "hello";
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));		
		
		
		
		
		String string = "hello";
		System.out.println("hello"==a1);
		System.out.println(a2==a1);
		
		String str2 = new String("hello").intern();//手工入池操作
		String str3 = "hello";//指向对象池中的hello
		System.out.println(str2==str3);
		str2 += " world";
		str2 += " !!!";
		System.out.println(str2);
		char [] str11 = string.toCharArray();
		str11.toString();
		System.out.println(str2.startsWith("s"));
		//str2.co
	}

}
