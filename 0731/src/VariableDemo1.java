import java.util.Scanner;

public class VariableDemo1 {
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);//ǥ���Է�
		System.out.print("����� ���̴�? : ");//ǥ�����
		age = scan.nextInt();//����

		System.out.println("����� ���̴� "+age+"�Դϴ�.");
	}
}
