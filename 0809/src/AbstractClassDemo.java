
public class AbstractClassDemo {
	public static void main(String[] args) {
		//Test t = new Test("Michael");
		Test t = new JasikTest("Michael");
		//�θ� = new �ڽ�;  --> �ڽ��� ���ؼ� �θ� ȣ�� ������
		System.out.println("name = " +t.toString());
		System.out.println(t);
	}
}
