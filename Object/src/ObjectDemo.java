interface IMessage{
	
}
class MessageImoL implements IMessage{
	public String toString() {
		return "hello";
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
	IMessage msg = new MessageImoL();
	Object object = msg;
	System.out.println(msg);
	
	}
}
