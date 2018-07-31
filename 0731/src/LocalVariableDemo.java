
public class LocalVariableDemo {
	public static void main(String[] args) {
		int kor = 0; //지역변수 ---> 초기화값이 있어야 함.
		//local , automatic, stack, temporary
		{
			int eng = 100;
			System.out.println("eng = " + eng);
		}
		//System.out.println("eng = " + eng); 소멸
		System.out.println("kor ="+kor);
	}
}
