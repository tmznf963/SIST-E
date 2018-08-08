/*
 * 메소드 오버라이드 조건 (상속되지 않음)
 * 1. 메소드의 Signature(이름,파라미터,리턴타입) 같아야 함.
 * 2. 메소드의 접근제한자(modifier)는 자식이 같거나 더 넓어야 함.     public이면 둘다 public
 * 3. 자식의 메소드는 부모의 메소드의 Exception이 더 적거나 범위가 작아야 한다.
 * */
public class OverrideDemo {// 부모메소드 = 자식메소드 같을 때 override
	public static void main(String[] args) {
		Parent parent = new Parent();
		//parent.display();
		Child child = new Child();
		child.display();
	}
}

class Parent {
	protected void display() {//오버라이드 메소드 = 상속되지 않음
		System.out.println("부모 메소드");
	}
}

class Child extends Parent {
	@Override
	public void display() {
		System.out.println("자식 메소드");
	}
}
