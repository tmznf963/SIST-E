
public class Calc {
	private Student[] array;
	private int count;
	
	public Calc(Student[] array, int count) { //생성자 Constructor
		this.array = array;
		this.count = count;
	}
	
	public void calc() {
		for(int i = 0 ; i < this.count ; i++) {
			Student s = this.array[i];
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
