import java.util.Scanner;
import java.util.Arrays;
public class ReturnDemo3 {
	public static void main(String[] args) {
		System.out.println("Program is starting....");
		int [] arr = new int[4];//{0,0,0,0}
		input(arr);  
		sort(arr);
		output(arr); // Call By Reference 
								//�ּҰ� �Ѿ�� ������ ���� �ȳѰܿ͵� �ٲ��.
		System.out.println("Program is over........");
	}
	
	static void input(int[] arr) {
		Scanner scan = new Scanner(System.in);
		for(int i =0; i< arr.length ; i++) 
			arr[i] = scan.nextInt();
	}
	static void sort(int[] arr) {
		Arrays.sort(arr);
	}
	static void output(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
