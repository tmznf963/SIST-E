import java.util.Scanner;
public class ReferenceDemo {

	public static void main(String[] args) {
		String name = "������";//4byte Stack -> ���ڿ� ���۹��� heap�޸�
		System.out.println("name = "+name);
		
		Scanner scan = new Scanner(System.in);
		String adress = null; //null����
		System.out.print("Adress : ");
		adress = scan.nextLine();
		
		System.out.println("�ּҴ� " +adress+ "�Դϴ�.");//String class ������
		
	}

}
