
public class FinalDemo2 {
	public static void main(String[] args) {
		Bumo b = new Jasik();//������ �θ� = �ڽ�(); Override
		b.display();
	}
}
class Bumo{
	final void display() {//Final�޼ҵ�
		System.out.println("���� �θ��� �޼ҵ�");
	}
}

class Jasik extends Bumo {
	//@Override
	void display(int su) {//Overloading
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}
