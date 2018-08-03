import java.util.Scanner;
public class ScoreMgmt {
	public static void main(String[] args) {
		Student2 std = new Student2();
		ScoreMgmt sm = new ScoreMgmt();
		sm.input(std);
		sm.calc(std);
		sm.output(std);
	}
	void input(Student2 s){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		s.setName(name);
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		s.setKor(kor);
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		s.setEng(eng);
		System.out.print("수학 : ");
		int mat = scan.nextInt();
		s.setMat(mat);
		
	}//입력
	
	void calc(Student2 s){
		int sum = s.getKor()+s.getEng()+s.getMat();
		s.setSum(sum);
		double avg = sum/3.;
		s.setAvg(avg);
	}//계산
	
	void output(Student2 s){
		System.out.printf("%s %d %d %d %d %f",
				s.getName(),s.getKor(),s.getEng(),s.getMat(),s.getSum(),s.getAvg());
		
	}//출력
}
