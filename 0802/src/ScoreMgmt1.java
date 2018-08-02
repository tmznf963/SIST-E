import java.util.Scanner;
public class ScoreMgmt1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student [] std = new Student[2];//배열
		
		for(int i = 0 ; i <std.length ; i++) {
			std[i] = new Student();//생성자
			
			System.out.println("name :"); std[i].name = scan.next();
			System.out.println("kor :"); std[i].kor = scan.nextInt();
			System.out.println("eng :"); std[i].eng = scan.nextInt();
			System.out.println("mat :"); std[i].mat = scan.nextInt();
			std[i].sum = (std[i].kor + std[i].eng + std[i].mat );
			std[i].avg = std[i].sum /3.;
		}
		for(Student s : std) {
			System.out.println("<학생정보 입니다>");
			System.out.println("이름 : " +s.name);
			System.out.println("국어 : " +s.kor);
			System.out.println("영어 : " +s.eng);
			System.out.println("수학 : " +s.mat);
			System.out.println("총점 : " +s.sum);
			System.out.println("평균 : " +s.avg);
			System.out.println();
		}
		
	}
}
