
public class CastDemo1 {
	public static void main(String[] args) {
		Object obj = new Object();
		//String str = new String("Hello");
		Integer intg = new Integer(100);
		
		obj = intg; // �ּ�, �ڽ��� �θ��

		if (obj instanceof Integer) { // obj�� Integer�� �ٲ��?
			System.out.println("����");
			 Integer in = (Integer)obj;
			 System.out.println("in = " + in);
		}else
			System.out.println("�Ұ���");
		

		System.out.println("obj = "+obj);

	}
}
