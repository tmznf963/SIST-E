import java.util.Scanner;

public class MoneyDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String y_n = null;
		
		int [] array ;
		array = new int[10];
		array[0] = 50000;
		array[1] = 10000;
		array[2] = 5000;
		array[3] = 1000;
		array[4] = 500;
		array[5] = 100;
		array[6] = 50;
		array[7] = 10;
		array[8] = 5;
		array[9] = 1;
		
		do {
			System.out.print("얼마 입력? ");
			int money = scan.nextInt();
			
			for(int i=0; i<10 ; i++) {
				System.out.printf("%d원권 : %d개 \n",array[i],money/array[i]);
				money = money%array[i];
			}
			System.out.print("계속 하시겠습니까? (y_n) : ");
			y_n = scan.nextLine();
			
		}while(y_n.equals("y") || y_n.equals("Y"));
	}
}
