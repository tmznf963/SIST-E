
public class CallByRefDemo1 {
	public static void main(String[] args) {
		int [] arr = {3,4};
		String str = "Hello";
		double pi = 3.14;
		change(arr,str,pi);
		System.out.printf("%d  %s  %f",arr[0],str,pi);
		//�ּҿ� ���� ȣ�� == ������ ex)�迭 == �ٲ��
		//���� ���� ȣ�� == primitive 8���� , String(���) == �ٲ��� ����
	}
	static void change(int[] arr , String str, double pi) {
		arr[0] = 100;
		str = "World";
		pi = 4.14;
		
	}
}
