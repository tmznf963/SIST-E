/*
 * Member Inner class
 * 1.������� : Outer's ���������� ���ؼ� == Outer.Inner inn = new Outer.Inner();
 * 2.���ѻ��� : �ڽ��� static ������ static�޼ҵ� ���� �� ����.
 * 3.������� : �ڱ�, �ڱ�θ�, �ٱ�, �ٱ��θ� ���� ��� ���� ����.
 * 
 */
public class InnerClassDemo1 {
	public static void main(String[] args) {
		Outer1 outter = new Outer1();
		Outer1.Inner1 inn = outter.new Inner1();//Inner class ������ ����
		System.out.println(outter.a);
		System.out.println(outter.b);
		inn.display();
	}
}

//������� ���ٹ�� ����
//����ƽ���� ���ٹ�� ����
class Outer1 extends DeprecationDemo{
	int a = 5; //outer's ��� ����
	static int b =10;//outer's ����ƽ ����
	class Inner1 extends JarDemo{//��� Inner class == ���߻�� ����
		int c = 500;
		//static int d = 100;  ���Ŭ������ static���� , static�޼ҵ� ���� �Ұ�.
		public void display() {
			System.out.println("display() = " + b);
			System.out.println("display() = "+ e);
			System.out.println("display() = " + f);
		}
	}
}