import java.util.Arrays;
public class ArrayDemo4 {

	public static void main(String[] args) {
//		int [] array = {1,2,3,4,5,6,6,7,1,4,43,34,3,5,5};
//		
//		for(int su : array) System.out.print(" "+su); //�ݺ���
//		
//		System.out.print(Arrays.toString(array)); //�Լ�
		
		String [] array = {"hello","world","Morning","Python"}; //������ �迭 = �ּ��� �迭 != ���� �迭
		
		for(int i = 0 ; i<array.length;i++) {
			System.out.printf("array[%d] = %s \n",i,array[i]);
		}
		for(String str : array) {
			System.out.println(str);
		}
		System.out.println(Arrays.toString(array));
		
	}

}
