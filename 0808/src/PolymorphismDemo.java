import java.util.Scanner;
public class PolymorphismDemo {
	public static void main(String[] args) {
		while(true) {
			showMenu();
			int choice = selectMenu();
			if(choice >=5) break;
			display(choice);
		}
	}
	static void showMenu() {
		System.out.println("<<�޴�>>");
		System.out.println("1:Dog");
		System.out.println("2:Cat");
		System.out.println("3:Korean");
		System.out.println("4:American");
		System.out.println("5:Exit");
	}
	static int selectMenu() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ������ ������ �ּ��� : ");
		return scan.nextInt();
	}
	static void display(int choice) {
		Mammal m = new Mammal();
		switch(choice) {								//������
		case 1: m = new Dog(); break;
		case 2: m= new Cat(); break;
		case 3: m = new Korean(); break;
		case 4: m= new Amerrican(); break;
		}
		m.saySomething();
	}
}
