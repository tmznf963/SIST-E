
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sub sub = new Sub();//����� �׻� �ڽ�Ŭ������ ����.
		System.out.println(sub.name);
		System.out.println(sub.price);
		System.out.println(Super.price);//�������� �� Ŭ���� �̸� ����.
		//System.out.println(Super.name); // static ������ �ƴϱ⿡ ���� �Ұ�
	}
}

class Super {
	String name = "Michael";
	static int price = 150; //���� ����
}

class Sub extends Super{
	
}
