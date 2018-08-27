package kr.co.sist.libs.control;
import kr.co.sist.libs.model.StudentVO;

public class Calc {
	private StudentVO s;
	public Calc(StudentVO s) { //������ Constructor
		this.s = s;
	}
	
	public void calc() {
			int sum = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
			
			double avg = sum/4.;
			char grade = this.calcGrade(avg);
			
			s.setSum(sum);
			s.setAvg(avg);
			s.setGrade(grade);
	}
	private char calcGrade(double avg) {
		char grade = (avg<= 100 && avg >=90) ? 'A':
									(avg < 90 && avg >=80 ) ? 'B':
										(avg <80 && avg >=70)? 'C':
											(avg <70 && avg>= 60)? 'D' : 'F';  //3�׿����� (����)? true : false
		
		return grade;
	}
	
}
