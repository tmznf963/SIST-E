
public class FinalDemo3 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
	}
}
final class Parent{ //final class == 상속 못한다. = 재정의, 다형성, 형변환 다 못함.
	void display() {
		System.out.println("나는 부모의 메소드");
	}
	final void print() {
		System.out.println("나는 부모의 메소드");
	}
}
class Child extends Parent{
	void display() {
		System.out.println("나는 자식의 메소드");
	}
}