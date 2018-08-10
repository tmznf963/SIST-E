/*
 * Local Inner Class
 * 1. ������� : �ڱⰡ �����ִ� �޼ҵ尡 ȣ�� �Ǿ���Ѵ�. �׸��� �޼ҵ�ȿ����� �������̱� ������
 * 						Ŭ���� ���� ���Ŀ� ���� �Ǿ���Ѵ�.
 * 2. ���ѻ��� : ��� access modifer(����������) ��� �Ұ�, static,abstract ���Ұ�. ���� final ��밡��
 * 						JDK1.7���Ͽ����� ����Ŭ������ ��������� ���� ����.
 * 3. ������� : ��������ó�� ����ϰ�, �Ҹ��Ű�� ���ؼ� ( �޼ҵ� �ȿ��� )
 * 
 * */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer2 o2 = new Outer2();
		o2.display();
	}
}
class Outer2{
	int a = 5;
	static int b =10;
	public void display() {
		int c = 500;//��������
		class Inner2{
			public void print() {
				System.out.println(c);//JDK1.8���� ���� Ŭ������ ���������� ���� ����.
			}
		}
		Inner2 inn = new Inner2();
	}//display
}


//	void display() {
//		int su =5; 	//��������
//		class Inner{	//����Ŭ���� == �����Ѱ� ���� final
//			int a = 10;
//			public void print() {
//				
//			}
//		}	
//		Inner inn = new Inner();//�޼ҵ� �ȿ����� ������. ���� �Ŀ� ����
//		inn.print();
//	}//display