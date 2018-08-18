package searchArray;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[] {1,2,3,4,5,6,7};
		int search = 1;
		java.util.Arrays.sort(data);
		int num = searchNd(search,0,7 ,data);
		System.out.println(num);
	}
	public static int searchNd(int search,int from,int to,int []array) {//通过增加参数
		int i = (from+to)/2;
		if (search == array[i]) {
			return i;
		}
		else if (search<array[i]) {
		
			return searchNd(search,0,i ,array);
			}
		else if(search>array[i]) {
			
			return searchNd(search,i+1,array.length,array);
		}
		
			
		return -1;
		
		
	}
}
