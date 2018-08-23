//Data Transaction Object, Value Object °´Ã¼ == DTO , VO
public class Student {
	private String hakbun, irum;
	private int kor,eng,mat,edp,sum;
	private double avg;
	private char grade;
	
	public Student(String hakbun, String irum, int kor, int eng, int mat, int edp) {
		this.hakbun = hakbun;
		this.irum = irum;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEdp() {
		return edp;
	}
	public void setEdp(int edp) {
		this.edp = edp;
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
	
	
}
