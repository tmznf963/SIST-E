
public class LocalVariableDemo {
	public static void main(String[] args) {
		int kor = 0; //�������� ---> �ʱ�ȭ���� �־�� ��.
		//local , automatic, stack, temporary
		{
			int eng = 100;
			System.out.println("eng = " + eng);
		}
		//System.out.println("eng = " + eng); �Ҹ�
		System.out.println("kor ="+kor);
	}
}
