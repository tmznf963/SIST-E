import java.util.Scanner;

public class MoneyDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String y_n = null;
		
		int [] array = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		do {
			System.out.print("�� �Է�? ");
			int money = scan.nextInt();
			
			for(int i=0; i<10 ; i++) {
				System.out.printf("%d���� : %d�� \n",array[i],money/array[i]);
				money = money%array[i];
			}
			System.out.print("��� �Ͻðڽ��ϱ�? (y_n) : ");
			y_n = scan.next();
			
		}while(y_n.equals("y") || y_n.equals("Y"));
	}
}
