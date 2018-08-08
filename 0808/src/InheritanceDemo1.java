
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Derived d = new Derived("Ballpen",1000);
	}
}

class Base {
	String name;
	public Base(String name) {
		System.out.println("부모 생성자"+name);
	}
}

class Derived extends Base {
	int price;
	public Derived(String name , int price) {//자식은 부모의 기본생성자() 만 호출한다.
		//super();//숨겨져있음
		super(name);
		//일반 메소드 안에서 사용 불가. 생성자 안에서만 사용 가능. 항상 첫번째 줄
		this.price = price;
		System.out.println("자식 생성자"+price);
	}
}
//this(), super()  공존 불가능 == 둘 다 첫 줄에 있어야 하는 성격