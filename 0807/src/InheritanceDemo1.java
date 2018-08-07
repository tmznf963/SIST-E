/*
 * 상속 안되는 4가지
 * private 멤버 변수
 * 생성자()
 * 
 * 
 * */
public class InheritanceDemo1{
	public static void main(String[] args) {
		Child child = new Child();//자식 생성자 호출
		//Parent parent = new Parent();
	}
}

class Parent{
	private String name;
	public Parent() {//생성자
		System.out.println("부모 생성자");
	}
}

class Child extends Parent{//자식은 부모의 기본 생성자를 호출.
	private int price;
	public Child() {
		System.out.println("자식 생성자");
	}
}