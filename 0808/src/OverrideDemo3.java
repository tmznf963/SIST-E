
public class OverrideDemo3 {//������ ���� Override
	public static void main(String[] args) {
//		Human human = new Human();
//		Student chulsu = new Student();
//		human = chulsu; //�ڽ��� �θ��
		Human human = new Student();
		human.display();
	}
}
class Human {
	void display() {
		System.out.println("���� �θ��� �޼ҵ�");
	}
}
class Student extends Human{
	void display() {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}