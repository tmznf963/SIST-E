import java.util.Scanner;
public class DoDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String y_n = null;
		do {
			System.out.print("ù �������� : ");
			int first = scan.nextInt();
			
			System.out.print("�� �������� : ");
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
			System.out.println("�ٽ� �Ͻðڽ��ϱ�?(y/n) : ");
			y_n = scan.next();
		}while(y_n.equals("y") || y_n.equals("Y"));
		System.out.println("����Ǿ����ϴ�.");
	}
}
