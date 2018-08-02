import java.util.Scanner;

public class MoneyDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String y_n = null;
		
		int [] array = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		do {
			System.out.print("얼마 입력? ");
			int money = scan.nextInt();
			
			for(int i=0; i<10 ; i++) {
				System.out.printf("%d원권 : %d개 \n",array[i],money/array[i]);
				money = money%array[i];
			}
			System.out.print("계속 하시겠습니까? (y_n) : ");
			y_n = scan.next();
			
		}while(y_n.equals("y") || y_n.equals("Y"));
	}
}
