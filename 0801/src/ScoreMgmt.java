import java.util.Scanner;

public class ScoreMgmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int mat = scan.nextInt();
		
		int sum = kor + eng + mat; //총점
		double avg = sum/3.; // 분자 분모 둘중하나는 실수가 되어야 결과값이 실수로 나온다.
		char grade = (avg <=100 && avg >= 90) ? 'A' :
						(avg <= 90 && avg >= 80) ? 'B' :
							(avg <=80 && avg >=70) ? 'C' :
								(avg <= 70 && avg >=60) ? 'D' :'F';
		System.out.printf("이름 %s 국어 %d 영어 %d 수학 %d 총점%d 평균%f 학점%c \n ",
							name,kor,eng,mat,sum,avg,grade);
	}

}
