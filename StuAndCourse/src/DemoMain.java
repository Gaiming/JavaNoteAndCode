
class Outer{
private static String msg = "helloworld";
static class Inner{
public  void print(){
System.out.println(msg);
}
}

}
public class DemoMain{
	public static void main(String args[]){
		Outer.Inner in = new Outer.Inner();
		in.print();


}

}