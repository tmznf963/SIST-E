import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 수 입력 : ");
		int first = scan.nextInt();
		System.out.print("두번쨰 수 입력 :");
		int second = scan.nextInt();
		
		try { // 예외처리 try/catch 문
			System.out.println("몫 = "+first/second);			
		}catch(ArithmeticException e) {//분모에 0을 넣을 경우 예외처리
			System.out.println("분모는 0이 될 수 없습니다.");
		}
	}
}
