
public class OpDemo4 {
	public static void main(String[] args) {
//		int a = 5;
//		//a++; //a = a + 1;
//		a = a+3;
//		a += 3;
		
//		byte a = 8;
//		byte result = ~a;// + - ~ int ���� �Ѵ�.
		
//		byte = 6;
//		byte = 9;
//		byte sum = a+b; //���׿����� int �̻� 

//		int a = 7;
//		double result = (a<100) ? 10: 10.9; //���׿����� �� ���� Type
//		System.out.println(result);
		
		short a = 32767;
		short result = true ? a : 100; // 100�� int(4byte) ������ short(2byte) �� ����ȯ
		
		byte b = Byte.MAX_VALUE;
		short s = Short.MAX_VALUE;
		int i = Integer.MAX_VALUE;
		long l = Long.MAX_VALUE;
		Double d = Double.MIN_VALUE;
		System.out.println(d);
	}
}
