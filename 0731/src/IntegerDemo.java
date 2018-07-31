
public class IntegerDemo {
	public static void main(String[] args) {
		byte a = 5;
		byte b = 9;
		byte sum = (byte)(a+b);//사칙연산은 int 이상 (byte, short는 Error)
		
		int su = 128;
		System.out.printf("십진수 su = %d\n",su);
		System.out.printf("팔진수 su = %o\n",su);
		System.out.printf("십육진수 su = %x\n",su);
		System.out.print("이진수 su = " + Integer.toBinaryString(su));
	}
}
