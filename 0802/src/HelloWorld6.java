
public class HelloWorld6 {
	public static void main(String[] args) {//static ������ �ּ����� �ʿ� ����
		HelloWorld6 hw = new HelloWorld6();
		hw.display();
		HelloWorld6.display();
		display();
		}
	static void display() { //class , static �޼ҵ� = Ŭ���� �̸����� ����
		System.out.println("Hello, World");
	}
}
