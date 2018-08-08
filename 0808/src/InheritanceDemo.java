/*
 * 상속이 안되는 4가지
 * 1. private 변수
 * 2. overshadow
 * 3. Constructor
 * 4. static 변수
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
	
	@Override //Object 꺼 사용
	public String toString() {
		return "My name is " + super.name;//부모 == super  접근제한자
	}
}
