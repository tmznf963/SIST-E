import java.util.Scanner;
public class ScoreMgmt1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student [] std = new Student[2];//�迭
		
		for(int i = 0 ; i <std.length ; i++) {
			std[i] = new Student();//������
			
			System.out.println("name :"); std[i].name = scan.next();
			System.out.println("kor :"); std[i].kor = scan.nextInt();
			System.out.println("eng :"); std[i].eng = scan.nextInt();
			System.out.println("mat :"); std[i].mat = scan.nextInt();
			std[i].sum = (std[i].kor + std[i].eng + std[i].mat );
			std[i].avg = std[i].sum /3.;
		}
		for(Student s : std) {
			System.out.println("<�л����� �Դϴ�>");
			System.out.println("�̸� : " +s.name);
			System.out.println("���� : " +s.kor);
			System.out.println("���� : " +s.eng);
			System.out.println("���� : " +s.mat);
			System.out.println("���� : " +s.sum);
			System.out.println("��� : " +s.avg);
			System.out.println();
		}
		
	}
}
