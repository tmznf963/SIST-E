
public class OverrideDemo3 {//다형성 관점 Override
	public static void main(String[] args) {
//		Human human = new Human();
//		Student chulsu = new Student();
//		human = chulsu; //자식이 부모로
		Human human = new Student();
		human.display();
	}
}
class Human {
	void display() {
		System.out.println("나는 부모의 메소드");
	}
}
class Student extends Human{
	void display() {
		System.out.println("나는 자식의 메소드");
	}
}