
public class HelloWorld2 {
	static String str = "Hello, World"; 
	//static = �������� (class����, static����)
	public static void main(String[] args) {
		//�������� (local)
		HelloWorld2 hw = new HelloWorld2();
		
		System.out.println(hw.str);//�ּ�����
		System.out.println(HelloWorld2.str);//Ŭ����
		System.out.println(str); //����Ŭ����
		
	}
}

