/*
 * ��� �ȵǴ� 4����
 * private ��� ����
 * ������()
 * 
 * 
 * */
public class InheritanceDemo1{
	public static void main(String[] args) {
		Child child = new Child();//�ڽ� ������ ȣ��
		//Parent parent = new Parent();
	}
}

class Parent{
	private String name;
	public Parent() {//������
		System.out.println("�θ� ������");
	}
}

class Child extends Parent{//�ڽ��� �θ��� �⺻ �����ڸ� ȣ��.
	private int price;
	public Child() {
		System.out.println("�ڽ� ������");
	}
}