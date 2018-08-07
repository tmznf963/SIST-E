/*
 * 상속 안되는 4가지
 * private 멤버 변수
 * 생성자()
 * 동일한 변수 부모 String name; , 자식 String name; = Overshadow
 * Override method = 메소드 동일 = 재정의
 * */
public class InheritanceDemo1{
	public static void main(String[] args) {
		Child child = new Child();//자식 생성자 호출
		child.display();
		//Parent parent = new Parent();
	}
}

class Parent{
	void display() {
		System.out.println("부모 메소드");
	}
}

class Child extends Parent{//자식은 부모의 기본 생성자를 호출.
	void display() {
		System.out.println("자식 메소드");
	}
}