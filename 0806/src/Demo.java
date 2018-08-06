
public class Demo {
	private String name;
	private int price;
	public void display() {
		System.out.println("name = " + name);
		System.out.println("price = " + price);
	}
	public Demo() {//default Constructor
		//new Demo("unknown",10_000);//�ּҰ� �ٸ����� �����.
		this("unknown",10000); 
		//this() == �� �ּҸ� �ȸ���� ������ ȣ��
		//������ �ȿ����� ��밡�� , ������ ù��° ��
	}
	public Demo(String name) {//�����ε��� ������ �ɼ��� ��������.
		this.name = name;
	}
	public Demo(int price) {
		this.price = price;
	}
	public Demo(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
