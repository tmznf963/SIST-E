
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Student std = null;
		try {
			std = new Student(-10);			
			System.out.println(std);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Student {
	private int kor;

	public Student(int kor) throws Exception { //Exception 선언 (표시)
		if(kor < 0 || kor >100) {//오류값 넣을 때
			throw new RuntimeException("잘못된 국어점수 입니다.");//예외처리 던지기(throw)
		}else this.kor = kor;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + "]";
	}
	
}
