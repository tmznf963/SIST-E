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
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		s.setName(name);
		System.out.print("���� : ");
		int kor = scan.nextInt();
		s.setKor(kor);
		System.out.print("���� : ");
		int eng = scan.nextInt();
		s.setEng(eng);
		System.out.print("���� : ");
		int mat = scan.nextInt();
		s.setMat(mat);
		
	}//�Է�
	
	void calc(Student2 s){
		int sum = s.getKor()+s.getEng()+s.getMat();
		s.setSum(sum);
		double avg = sum/3.;
		s.setAvg(avg);
	}//���
	
	void output(Student2 s){
		System.out.printf("%s %d %d %d %d %f",
				s.getName(),s.getKor(),s.getEng(),s.getMat(),s.getSum(),s.getAvg());
		
	}//���
}
