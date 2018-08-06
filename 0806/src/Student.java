
public class Student {
	private String name;
	private int kor,eng,mat,sum;
	private double avg;
	private char grade;
	
	public Student(String name, int kor, int eng, int mat) {//생성자
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}
	public void display() {
		System.out.printf("%-10s  %5d  %5d  %5d %5d  %10.2f  \n",
				this.name,kor,eng,mat,sum,avg); //10 <-- 10자리 오른쪽 정렬
	}//%5c ,grade
	
}//
