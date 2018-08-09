
public class AbstractMethodDemo {
	public static void main(String[] args) {
		Demo d = new JasikDemo();//다형성 강제화
		d.display();
		d.print();
	}
}
