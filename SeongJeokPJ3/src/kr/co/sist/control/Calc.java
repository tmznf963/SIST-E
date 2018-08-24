package kr.co.sist.control;
import java.util.Vector;

import kr.co.sist.model.Student;

public class Calc {
	private Vector<Student> vector;
	
	public Calc(Vector<Student> vector) { //생성자 Constructor
		this.vector = vector;
	}
	
	public void calc() {
		for(int i = 0 ; i < this.vector.size() ; i++) {
			Student s = this.vector.get(i);//또는 ElementAt();
			int sum = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
			
			double avg = sum/4.;
			char grade = this.calcGrade(avg);
			s.setSum(sum);
			s.setAvg(avg);
			s.setGrade(grade);
		}
	}
	private char calcGrade(double avg) {
		char grade = (avg<= 100 && avg >=90) ? 'A':
									(avg < 90 && avg >=80 ) ? 'B':
										(avg <80 && avg >=70)? 'C':
											(avg <70 && avg>= 60)? 'D' : 'F';  //3항연산자 (조건)? true : false
		
		return grade;
	}
	
}
