
public class FinalDemo2 {
	public static void main(String[] args) {
		Bumo b = new Jasik();//다형성 부모 = 자식(); Override
		b.display();
	}
}
class Bumo{
	final void display() {//Final메소드
		System.out.println("나는 부모의 메소드");
	}
}

class Jasik extends Bumo {
	//@Override
	void display(int su) {//Overloading
		System.out.println("나는 자식의 메소드");
	}
}
