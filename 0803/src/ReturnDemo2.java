import java.util.Scanner;
import java.util.Arrays;
public class ReturnDemo2 {
	public static void main(String[] args) {
		int [] arr = null;
		ReturnDemo2 rd = new ReturnDemo2();
	arr = rd.input(arr); //�Է�
	arr = rd.sort(arr); //����
	rd.output(arr); //���
	System.out.println("Program is over.........");
	}
	
	 int [] input(int [] arr){
		 Scanner scan = new Scanner(System.in);
		 arr = new int[4]; //�迭 ����
		 for(int i = 0 ; i< arr.length ; i++) {
			 arr[i] = scan.nextInt();
		 }
		return arr;
	}
	 
	 int [] sort(int [] arr){
		 Arrays.sort(arr);//��������
		return arr;
	}
	 
	 void output(int [] arr){
		 System.out.println(Arrays.toString(arr));//Arrays.toString(arr)
	 }

}//�޼ҵ� ��� ���� : �������� & ��Ȱ��
