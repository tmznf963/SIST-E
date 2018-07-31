import java.util.Scanner;

public class VariableDemo1 {
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);//표준입력
		System.out.print("당신의 나이는? : ");//표준출력
		age = scan.nextInt();//정수

		System.out.println("당신의 나이는 "+age+"입니다.");
	}
}
