import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù �� �Է� : ");
		int first = scan.nextInt();
		System.out.print("�ι��� �� �Է� :");
		int second = scan.nextInt();
		
		try { // ����ó�� try/catch ��
			System.out.println("�� = "+first/second);			
		}catch(ArithmeticException e) {//�и� 0�� ���� ��� ����ó��
			System.out.println("�и�� 0�� �� �� �����ϴ�.");
		}
	}
}
