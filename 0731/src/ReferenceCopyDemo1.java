
public class ReferenceCopyDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.kor = 90;
		
		Student younghee = new Student();
		younghee = chulsu; //�ּҹ��� ����
		chulsu.kor = 100;
		
		System.out.printf("younghee = %d\n", younghee.kor);
		System.out.printf("chulsh = %d",chulsu.kor);
	}
}

class Student{
	int kor;
}
