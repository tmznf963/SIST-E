//����
import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
//		Student [] std ;
//		std = new Student[2]; //�迭 ���� ����
//		
//		std[0] = new Student(); //������ �迭 (�л���ø)
//		std[0].name = "������";
//		
//		std[1] = new Student();
//		std[1].name = "���켺";
//		
//		for(Student s : std) {
//			System.out.println(s.name);
//		}
		Student [] std;
		std = new Student[2];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < std.length; i++) {
			System.out.print("Name : ");
			String irum = scan.nextLine();
			std[i] = new Student();//�л� �ּ� �����
			std[i].name = irum;
		}
		for (Student s : std) {
			System.out.println(s.name);
		}
	}
}
