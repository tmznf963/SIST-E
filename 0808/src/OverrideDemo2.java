/*
 * ��ü��
 * 1. ���� : Primitive type, '==' ������ �̿�
 * 2. �ּҺ�
 * 	1)String type
 *       == : ���� or �ּҺ�
 *       equals() : ����
 * 	2)Reference type (������)
 *       ==, equals() : ��� �ּҺ�
 * 3. ��ü�� equals() ������
 * 
 * */
public class OverrideDemo2 {
	public static void main(String[] args) {
		/*1.
		 * String str = "Hello";
		String str1 = "Hello";
		if(str.equals(str1)) {
			System.out.println("����");
		}else
			System.out.println("�ٸ���");*/
		
/*		2.
		Test t = new Test();
		Test t1 = new Test();
		t.su = 100;
		t1.su = 100;
		if (t.equals(t1)) {
			System.out.println("����");
		}else
			System.out.println("�ٸ���");
		*/
		
		//3.
		Point original = new Point(100,200);
		Point target = new Point(100,200);
		if(original.equals(target)) {
			System.out.println("����");
		}else
			System.out.println("�ٸ���");
	}
}

class Test{
	int su;
}
