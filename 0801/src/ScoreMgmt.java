import java.util.Scanner;

public class ScoreMgmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("���� : ");
		int kor = scan.nextInt();
		System.out.print("���� : ");
		int eng = scan.nextInt();
		System.out.print("���� : ");
		int mat = scan.nextInt();
		
		int sum = kor + eng + mat; //����
		double avg = sum/3.; // ���� �и� �����ϳ��� �Ǽ��� �Ǿ�� ������� �Ǽ��� ���´�.
		char grade = (avg <=100 && avg >= 90) ? 'A' :
						(avg <= 90 && avg >= 80) ? 'B' :
							(avg <=80 && avg >=70) ? 'C' :
								(avg <= 70 && avg >=60) ? 'D' :'F';
		System.out.printf("�̸� %s ���� %d ���� %d ���� %d ����%d ���%f ����%c \n ",
							name,kor,eng,mat,sum,avg,grade);
	}

}
