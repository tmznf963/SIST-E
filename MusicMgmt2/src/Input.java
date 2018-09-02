import java.util.ArrayList;
import java.util.Scanner;

class Input {// Input Class ������� ����.
	private ArrayList<Account> array;
	private Scanner scan;
	
	Input(ArrayList<Account> array){//�����ڿ��� ������� �ʱ�ȭ
		this.array = array;
		scan = new Scanner(System.in);
	}
	void input(){//input �޼ҵ�
		int count = 0;//�ݺ��� ����
		char y_n = '\0';// ĳ������ �ʱⰪ
		do{
			count++;
			System.out.print("�Ҹ�����ȣ : ");
			int no = this.scan.nextInt(); //int ���� Scanner�� �ޱ� ����
			System.out.print("���������ڵ� : ");
			String code = this.scan.next();//String���� Scanner�� �ޱ� ����
			System.out.print("�Ǹż��� : ");
			int su = this.scan.nextInt();
			System.out.print("�Է�/���(I/O) ? : ");
			y_n = this.scan.next().charAt(0);//charAt(0) == 0��° �ε����� String�� ��
			Account account = new Account(no, code, su);
			this.array.add(count - 1, account);
		}while(count <= 7 && (y_n == 'i' || y_n == 'I'));//7�� ���� �̰ų� i or I �� ������� Do-while �ݺ�
	}
}
