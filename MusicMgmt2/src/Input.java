import java.util.ArrayList;
import java.util.Scanner;

class Input {
	private ArrayList<Account> array;
	private Scanner scan;
	
	Input(ArrayList<Account> array){
		this.array = array;
		scan = new Scanner(System.in);
	}
	void input(){
		int count = 0;
		char y_n = '\0';
		do{
			count++;
			System.out.print("�Ҹ�����ȣ : ");
			int no = this.scan.nextInt();
			System.out.print("���������ڵ� : ");
			String code = this.scan.next();
			System.out.print("�Ǹż��� : ");
			int su = this.scan.nextInt();
			System.out.print("�Է�/���(I/O) ? : ");
			y_n = this.scan.next().charAt(0);
			Account account = new Account(no, code, su);
			this.array.add(count - 1, account);
		}while(count <= 7 && (y_n == 'i' || y_n == 'I'));
	}
}
