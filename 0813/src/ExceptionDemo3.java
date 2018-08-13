
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

	public Student(int kor) throws Exception { //Exception ���� (ǥ��)
		if(kor < 0 || kor >100) {//������ ���� ��
			throw new RuntimeException("�߸��� �������� �Դϴ�.");//����ó�� ������(throw)
		}else this.kor = kor;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + "]";
	}
	
}
