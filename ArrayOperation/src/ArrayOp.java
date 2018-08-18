

class Array{
	private int data[];
	private int foot = 0;
	public Array(int len) {//实现自定义数组长度
		if (len>0) {
			this.data = new int[len];
		}
		else {
			this.data = new int[1];
		}
	}
	public int [] getArray() {//获取数组
		return this.data;
	}
	public boolean add(int num) {//实现向数组内加数字
		this.data[foot] = num;
		foot++;
		if(foot>=this.data.length) {
			return false;
		}
		else return true;
	}
	public void inc(int num) {//动态扩充数组长度:先
		int []newData = new int[this.data.length+num];
		System.arraycopy(this.data, 0,newData, 0, this.data.length);
		//this.data = new int[this.data.length+num];//这么设计会直接清空原数组
		this.data = newData;
	}
	public int getDataLength() {
		return this.data.length;
	}
	
}
class sortArray extends Array{//paixuzilei
	//父类没有无参构造，所以子类必须明确调用父类的构造方法
	
	public sortArray(int len) {
		super(len);
	}	
	//父类的取得数据的方法名称很标准，但是功能不足，又希望继续使用这个方法名称，那么就要对方法进行扩充，扩充就是方法覆写的核心作用
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
