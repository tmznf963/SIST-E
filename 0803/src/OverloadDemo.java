
public class OverloadDemo {//�ߺ��ǰ� ����� ��
	public static void main(String[] args) {//static ---> ó���� main()�� ȣ���ϱ� ����
		print("HelloWorld");
	}
	static void print(int n) { //Method�����ε� ���� : �̸� ���� , �Ķ����(Ÿ��,����) �ٸ��� , ����Ÿ�� ���Ƶ� �ǰ� �޶� �ǰ�.
		System.out.println("���� n :"+n);
	}
	static void print(double n) {
		System.out.println("�Ǽ� n :"+n);
	}
	static void print(String n) {
		System.out.println("���ڿ� n :"+n);
	}
}
