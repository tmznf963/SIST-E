import java.util.Scanner;

public class OpDemo3 {
	public static void main(String[] args) {
//		int a = 6, b=9;
//		if(a>b) System.out.println("True");
//		else System.out.println("False");
		
//		if(num % 2 ==0) System.out.println("¦��");
//		else System.out.println("Ȧ��"); //if else ���ǹ�
		
		Scanner scan = new Scanner(System.in); //ǥ���Է�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		String result = (num %2 ==0) ? "¦��" : "Ȧ��";//���׿�����
		
		System.out.println(result);
		
	}
}
