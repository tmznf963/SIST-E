
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Derived d = new Derived("Ballpen",1000);
	}
}

class Base {
	String name;
	public Base(String name) {
		System.out.println("�θ� ������"+name);
	}
}

class Derived extends Base {
	int price;
	public Derived(String name , int price) {//�ڽ��� �θ��� �⺻������() �� ȣ���Ѵ�.
		//super();//����������
		super(name);
		//�Ϲ� �޼ҵ� �ȿ��� ��� �Ұ�. ������ �ȿ����� ��� ����. �׻� ù��° ��
		this.price = price;
		System.out.println("�ڽ� ������"+price);
	}
}
//this(), super()  ���� �Ұ��� == �� �� ù �ٿ� �־�� �ϴ� ����