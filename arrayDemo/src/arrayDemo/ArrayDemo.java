package arrayDemo;



public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int data[] = new int[3];//�������鲢���ٿռ䳤��Ϊ3
		int data1[] = {1,2,3};
		int temp[] = new int[] {1,2,3};
		
		temp = data1;
																//System.out.println(data1[1]);
		temp[1] = 111;
		data1 = reArray();//���÷���	
																//printArray(data1);
		inc(data1);//���������ô���
																//printArray(data1);
		java.util.Arrays.sort(data1);//��������
																//printArray(data1);
																//System.out.println(data1[1]);
																//System.out.println(new int[] {1,2,3,41,2,314,123,4,1,243,22}.length);
		System.arraycopy(data1, 1, temp, 0, 3);
		printArray(temp);
		
	}	
		//�����������
		public static void  printArray(int temp[]) {
			for (int i = 0; i < temp.length; i++) {
				System.out.println(temp[i]+"\\");
			}
		}
		public static int[] reArray() {
			return new int[] {2,31,542,53,21,1};
		}
		public static void inc(int temp[]) {
			for (int i = 0; i < temp.length; i++) {
				temp[i] = temp[i]*2;
				
			}
		}
		public static int arrayMax(int []t) {
			int max = t[0];
			for (int i = 0; i < t.length; i++) {
				if (max<t[i]) {
					
					max = t[i];
					
				}
			}
			return max;
		}
		public static int arrayMin(int []t) {
			int min = t[0];
			for (int i = 0; i < t.length; i++) {
				if (min>t[i]) {
					
					min = t[i];
					
				}
			}
			return min;
		}
		public static int arraySum(int []t) {
			
			int sum = 0;
			for (int i = 0; i < t.length; i++) {
				sum = sum +t[i];
			}
			
			return sum;
			
		}
		public static int arrayAvg(int []t) {
			int sum = arraySum(t);
			return sum/t.length;
		}
		
		//ʵ���˹��ܵ�������������Ƚ϶�
		//������ʵ��






}
