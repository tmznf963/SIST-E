import java.util.Arrays;
public class ReturnDemo1 {
	public static void main(String[] args) {

		int [] arr = new int[] {1,2,3,4};
		arr = demo(arr);
		System.out.println(Arrays.toString(arr));//�����Լ�
	}
	static int [] demo(int [] arr1) {//int [] arr1 = arr   //�ּҺ���
		arr1 = new int[] {10,9,8,7,6,5,4,3,2,1};
		return arr1;
	}//����Ÿ�� �޼ҵ��̸� ��ȣ ex) void demo ()
}
