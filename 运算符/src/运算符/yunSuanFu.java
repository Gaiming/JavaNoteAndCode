package ÔËËã·û;

public class yunSuanFu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		System.out.println(a++*b);
		int a1 = b>a?b:a;
		System.out.println(!(a>b));
		
		System.out.println(a>b?a:b*2);
		if(1>2&&10/0 ==0) {
			System.out.println("Ìõ¼şÂú×ã");
		}
		else {
			System.out.println("ok"+a1);
		}
		System.out.println(a<<2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a&b);
	    int num = 50 ; 
        num = num ++ * 2 ; 
        System.out.println(num) ;  
		
	}

}
