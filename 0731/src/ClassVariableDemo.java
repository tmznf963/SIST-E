
public class ClassVariableDemo {
	public static void main(String[] args) {
		int kor =90;//��������(�ݵ�� �ʱ�ȭ ��)
		System.out.println("E_num ="+Employee.E_num);//�ּҸ� �˷���� ��.
	}
}

class Employee{
	static String E_num = "2018-07";
	//��� static = ��������(����ƽ����,Ŭ��������) = class�� ��� ������
	int salary = 200;//�������
}

class Person{
	static String E_num = "2016-01";
}