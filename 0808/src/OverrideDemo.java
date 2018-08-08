/*
 * �޼ҵ� �������̵� ���� (��ӵ��� ����)
 * 1. �޼ҵ��� Signature(�̸�,�Ķ����,����Ÿ��) ���ƾ� ��.
 * 2. �޼ҵ��� ����������(modifier)�� �ڽ��� ���ų� �� �о�� ��.     public�̸� �Ѵ� public
 * 3. �ڽ��� �޼ҵ�� �θ��� �޼ҵ��� Exception�� �� ���ų� ������ �۾ƾ� �Ѵ�.
 * */
public class OverrideDemo {// �θ�޼ҵ� = �ڽĸ޼ҵ� ���� �� override
	public static void main(String[] args) {
		Parent parent = new Parent();
		//parent.display();
		Child child = new Child();
		child.display();
	}
}

class Parent {
	protected void display() {//�������̵� �޼ҵ� = ��ӵ��� ����
		System.out.println("�θ� �޼ҵ�");
	}
}

class Child extends Parent {
	@Override
	public void display() {
		System.out.println("�ڽ� �޼ҵ�");
	}
}
