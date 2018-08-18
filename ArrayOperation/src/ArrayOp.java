

class Array{
	private int data[];
	private int foot = 0;
	public Array(int len) {//ʵ���Զ������鳤��
		if (len>0) {
			this.data = new int[len];
		}
		else {
			this.data = new int[1];
		}
	}
	public int [] getArray() {//��ȡ����
		return this.data;
	}
	public boolean add(int num) {//ʵ���������ڼ�����
		this.data[foot] = num;
		foot++;
		if(foot>=this.data.length) {
			return false;
		}
		else return true;
	}
	public void inc(int num) {//��̬�������鳤��:��
		int []newData = new int[this.data.length+num];
		System.arraycopy(this.data, 0,newData, 0, this.data.length);
		//this.data = new int[this.data.length+num];//��ô��ƻ�ֱ�����ԭ����
		this.data = newData;
	}
	public int getDataLength() {
		return this.data.length;
	}
	
}
class sortArray extends Array{//paixuzilei
	//����û���޲ι��죬�������������ȷ���ø���Ĺ��췽��
	
	public sortArray(int len) {
		super(len);
	}	
	//�����ȡ�����ݵķ������ƺܱ�׼�����ǹ��ܲ��㣬��ϣ������ʹ������������ƣ���ô��Ҫ�Է����������䣬������Ƿ�����д�ĺ�������
	@Override
	public int[] getArray() {
		java.util.Arrays.sort(super.getArray());
		return super.getArray();
	}
	
}
class ReverseArray extends Array{

	public ReverseArray(int len) {
		super(len);
		// TODO Auto-generated constructor stub
	}
	public int [] getArray() {
		int center  = super.getArray().length/2;
		int head = 0;
		int tail = super.getArray().length-1;
		for (int i = 0; i < center; i++) {
			int temp = super.getArray()[head];
			super.getArray()[head] = super.getArray()[tail];
			super.getArray()[tail] = temp;
			head++;
			tail--;
		}
		return super.getArray();
	}
	
}


public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray array = new ReverseArray(5);
		System.out.println(array.add(1));
		array.add(2);
		array.add(7);
		array.add(4);
		array.add(3);
		int result[] = array.getArray();
		for (int i = 0; i < result.length; i++) {
			//System.out.println(result[i]);
		}
		//System.out.println(array.getDataLength());
		array.inc(3);
		//System.out.println(array.getDataLength());
		System.out.println(array.add(9));
		array.add(6);
		array.add(5);
		int result2[] = array.getArray();
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
		}
		
}
