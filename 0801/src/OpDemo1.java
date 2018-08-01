
public class OpDemo1 {

	public static void main(String[] args) {
		int a = 45, b = 78;
		System.out.println("a = " + Integer.toBinaryString(a));
		System.out.println("b = " + Integer.toBinaryString(b));
		
		int result = a & b;
		System.out.println("result = " + Integer.toBinaryString(result));
		
		result = a | b;
		System.out.println("result = " + Integer.toBinaryString(result));
		
		result = a ^ b;
		System.out.println("result = " + Integer.toBinaryString(result));
	}

}
