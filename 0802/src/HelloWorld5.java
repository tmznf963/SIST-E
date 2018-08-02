
public class HelloWorld5 {
	public static void main(String[] args) {
		HelloWorld5 hw = new HelloWorld5();// 주소 접근
		hw.display();
	}
	void display() { //멤버변수=instance=주소 필요
		System.out.println("Hello, World");
	}
}
