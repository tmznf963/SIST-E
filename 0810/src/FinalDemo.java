//����� ALL �빮��

public class FinalDemo {
	int kor; //��� ����
	final int ENG = 100; //������
	static int price = 25_000_000; //��������, static, class
	static final String NAME = "Sally"; //static(class) ���
	public static void main(String[] args) {
		int su = 5; //���� ����
		final int NUM = 10; //���� ���
		//NUM = 11; //����� �ٲ��� ���Ѵ�.
		
		FinalDemo fd = new FinalDemo();
		//fd.ENG = 1001; //����� �ٲ��� ���Ѵ�.
		
		//NAME = "Michael";//����� �ٲ��� ���Ѵ�.
		price = 100;
		
		System.out.println(price);
	}
}
