/*
 * ��� �ȵǴ� 4����
 * private ��� ����
 * ������()
 * ������ ���� �θ� String name; , �ڽ� String name; = Overshadow
 * Override method = �޼ҵ� ���� = ������
 * */
public class InheritanceDemo1{
	public static void main(String[] args) {
		Child child = new Child();//�ڽ� ������ ȣ��
		child.display();
		//Parent parent = new Parent();
	}
}

class Parent{
	void display() {
		System.out.println("�θ� �޼ҵ�");
	}
}

class Child extends Parent{//�ڽ��� �θ��� �⺻ �����ڸ� ȣ��.
	void display() {
		System.out.println("�ڽ� �޼ҵ�");
	}
}