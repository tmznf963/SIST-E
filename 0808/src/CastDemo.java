/*
 *����ȯ(Casting, Conversion)
 *1. �ڵ�����ȯ(�Ͻ��� ����ȯ, implicit casting)
 *		1)�� -> ��
 *		2)3 + 3.14 = 6.14
 *		3)"Hello" + 123 = "Hello123"
 *2. ��������ȯ(����� ����ȯ, explicit casting)
 * 	1)�� -> ��
 * 	2)int su = (int)34L;
 */
public class CastDemo {
	public static void main(String[] args) {
		Test1 test = new Test1();//�θ�
		Temp temp = new Temp();//�ڽ�
		
		//�ڽ� --> �θ� : �ڵ�,���� �׻� ����
		test = (Test1)temp;//�ڽ��� �θ�� ����ȯ ����
		
		//�θ� --> �ڽ� : �ڵ�����ȯ ����, ��������ȯ ���� == ������ || ��Ÿ�� ����or����
		if(test instanceof Temp) {
			System.out.println("�ȴ�.");
			temp = (Temp)test;//�θ� �ڽ�����
		}else {
			System.out.println("�ȵȴ�.");
		}
		
	}
}
class Test1{
	
}
class Temp extends Test1{
	
}