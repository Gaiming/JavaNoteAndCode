/*interface IMessage{
	String MSG = "www.baidu.com";
	void print();}
interface INews{
	public abstract String get();
	public abstract void print1();}
class MessageImpl implements IMessage,INews{
@Override
	public void print() {
		System.out.println("ssss");}	
	@Override
	public void print1() {
		System.out.println(this.get());}
	@Override
	public String get() {
		return IMessage.MSG;//���ʳ����������������
		}}*/
interface INews{
	public String get();
}
abstract class AbstractMessage implements INews{
	public abstract void print();
}
class NewsImpl extends AbstractMessage implements INews{
	public String get() {
		return "www.get.com";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}


public class IDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	IMessage aIMessage = new MessageImpl();//����ת��
	//	aIMessage.print();//���ñ����าд���ķ���
		// INews aI = (MessageImpl)aIMessage;//����ת��
		//aI.print1();
		INews aINews = new NewsImpl();
		System.out.println(aINews.get());
		AbstractMessage a2 = (AbstractMessage)aINews;
		System.out.println(a2.get());
		
		
	}

}
