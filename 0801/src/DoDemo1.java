import java.util.Scanner;
public class DoDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String y_n = null;
		do {
			System.out.print("첫 번쨰숫자 : ");
			int first = scan.nextInt();
			
			System.out.print("두 번쨰숫자 : ");
			int second = scan.nextInt();
			
			System.out.print("Operator(+ - * / %) ? :");
			String op = scan.next();
			switch(op) {
			case"+" : System.out.printf("%d + %d = %d \n",first,second,(first+second)); break;
			case"-" : System.out.printf("%d - %d = %d \n",first,second,(first-second)); break;
			case"*" : System.out.printf("%d * %d = %d \n",first,second,(first*second)); break;
			case"/" : System.out.printf("%d / %d = %d \n",first,second,(first/second)); break;
			case"%" : System.out.printf("%d %% %d = %d \n",first,second,(first%second)); break;
			}
			System.out.println("다시 하시겠습니까?(y/n) : ");
			y_n = scan.next();
		}while(y_n.equals("y") || y_n.equals("Y"));
		System.out.println("종료되었습니다.");
	}
}
