/*
 * Nested(Static) Inner class
 *1. ������� : Outer.Inner inn = new Outer.Inner();
 *2. ���ѻ��� : Outer class�� �������, ����޼ҵ� ���� �Ұ� == �޸𸮿� �ȿö� �ͼ�.
 *3. ���� ���� : class�� packaging �ϱ� ����.
 * 
 * */
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer.b = 10;
		Outer.Inner inn = new Outer.Inner();//static�� ���� ����� ����.[Ŭ�����̸�.����]
		System.out.println(inn.c);//�������
		System.out.println(Outer.Inner.d);//����ƽ����
		inn.display(); //Inner�� ��� �޼ҵ�
	}
}
class Outer{
	int a = 5;		//�ٱ� Ŭ������ �������
	static int b = 10; //�ٱ� Ŭ������ ����ƽ���� 
	//static ���ٹ���� ����.
	static class Inner{ //protected private static ����
		int c = 500;	//���� Ŭ������ �������
		static int d = 1000; //���� Ŭ������ ����ƽ����
		public void display() { //Inner�� ��� �޼ҵ�
			System.out.println("display = "+d);
		}
	}//static�� Outer�� ��� ���� �Ұ� = ���� : static�� ����������� �޸𸮿� ���� �ö󰡼�.
}