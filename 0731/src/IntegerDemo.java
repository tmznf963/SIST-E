
public class IntegerDemo {
	public static void main(String[] args) {
		byte a = 5;
		byte b = 9;
		byte sum = (byte)(a+b);//��Ģ������ int �̻� (byte, short�� Error)
		
		int su = 128;
		System.out.printf("������ su = %d\n",su);
		System.out.printf("������ su = %o\n",su);
		System.out.printf("�������� su = %x\n",su);
		System.out.print("������ su = " + Integer.toBinaryString(su));
	}
}
