
public class FinalDemo3 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
	}
}
final class Parent{ //final class == ��� ���Ѵ�. = ������, ������, ����ȯ �� ����.
	void display() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
	final void print() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
}
class Child extends Parent{
	void display() {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}