
public class MethodDemo4 {
	public static void main(String[] args) {
		MethodDemo4 md4 = new MethodDemo4();

		int[] arr = {5,9};
		System.out.println("���� ��");
		System.out.printf("a=%d   b=%d \n",arr[0],arr[1]);
		md4.swap(arr);
		System.out.println("���� ��");
		System.out.printf("a=%d   b=%d \n",arr[0],arr[1]);
		
	}
	void swap(int [] arr2) {//Call By Reference //�迭�� �ּҺ���
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		
		System.out.println("===�޼ҵ�===");
		System.out.printf("a=%d b=%d \n",arr2[0],arr2[1]);
		System.out.println("===�޼ҵ�===");
	}
}
