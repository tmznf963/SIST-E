import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ���� �����ϼ���?(��//����//����//�ܿ�) ");
		String season = scan.nextLine();
		System.out.println("���� : "+season);
	
		if(season.equals("��")) {
			System.out.println("������,���޷�");
		} else if(season.equals("����")){
			System.out.println("���,��ī�þ�");
		} else if(season.equals("����")){
			System.out.println("�ڽ���,����");
		} else{
			System.out.println("����,��ȭ");
		}
	}
}
