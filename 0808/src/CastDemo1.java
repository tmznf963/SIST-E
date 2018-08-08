
public class CastDemo1 {
	public static void main(String[] args) {
		Object obj = new Object();
		//String str = new String("Hello");
		Integer intg = new Integer(100);
		
		obj = intg; // 주소, 자식이 부모로

		if (obj instanceof Integer) { // obj가 Integer로 바뀌어?
			System.out.println("가능");
			 Integer in = (Integer)obj;
			 System.out.println("in = " + in);
		}else
			System.out.println("불가능");
		

		System.out.println("obj = "+obj);

	}
}
