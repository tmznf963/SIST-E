
public class InnerClassDemo3 {
	public static void main(String[] args) {
		Test t = new Test() {//¿Á¡§¿« Override
			@Override
			public void display() {
				System.out.println("Hello. Anonymous Class");
			}
		};
		t.display();
	}
}
class Test{
	public void display() {
		System.out.println("Hello , World!!!");
	}
}
