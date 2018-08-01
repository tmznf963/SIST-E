import java.util.Scanner;

public class OpDemo3 {
	public static void main(String[] args) {
//		int a = 6, b=9;
//		if(a>b) System.out.println("True");
//		else System.out.println("False");
		
//		if(num % 2 ==0) System.out.println("짝수");
//		else System.out.println("홀수"); //if else 조건문
		
		Scanner scan = new Scanner(System.in); //표준입력
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		String result = (num %2 ==0) ? "짝수" : "홀수";//삼항연산자
		
		System.out.println(result);
		
	}
}
