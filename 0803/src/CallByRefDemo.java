
public class CallByRefDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		input(ballpen);
		output(ballpen);
	}
	static void input(Product p) {//Call By Reference == ������ �ּ� (Product)
		p.name = "�𳪹� ����";
		p.price = 100;
	}
	static void output(Product p) {//�ּҿ� ���� ������ ���� ������ �ȴ�.
		System.out.printf("�̸� : %s  \n���� : %d",p.name,p.price);
	}
}
