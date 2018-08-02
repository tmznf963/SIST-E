
public class HelloWorld6 {
	public static void main(String[] args) {//static 끼리는 주소접근 필요 제거
		HelloWorld6 hw = new HelloWorld6();
		hw.display();
		HelloWorld6.display();
		display();
		}
	static void display() { //class , static 메소드 = 클래스 이름으로 접근
		System.out.println("Hello, World");
	}
}
