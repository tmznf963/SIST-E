
public class ArrayDemo1 {
	public static void main(String[] args) {
		//byte, short, int, long --> 0 ���� �ʱ�ȭ
		//float, double --> 0.0
		//boolean --> false
		//char --> null��, '\0', '\u0000' 	[ASCII 0]
		//������(String, Class, Interface) --> null����
		
		char [] array = new char[4];
		for(int i = 0 ; i <4 ; i++) {
			System.out.println("array"+i+" = "+array[i]);
		}
		
	}
}
