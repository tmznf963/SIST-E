/*
 * ����� �ȵǴ� 4����
 * 1. private ����
 * 2. overshadow
 * 3. Constructor
 * 4. static ����
 */

public class InheritanceDemo {
	public static void main(String[] args) {
		Jasik ja = new Jasik();
		System.out.println(ja);
	}
}

class Bumo {
	String name = "Sally"; //super
}

class Jasik extends Bumo {
	String name = "Michael"; //this
	
	@Override //Object �� ���
	public String toString() {
		return "My name is " + super.name;//�θ� == super  ����������
	}
}
