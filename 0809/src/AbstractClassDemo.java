
public class AbstractClassDemo {
	public static void main(String[] args) {
		//Test t = new Test("Michael");
		Test t = new JasikTest("Michael");
		//부모 = new 자식;  --> 자식을 통해서 부모를 호출 다형성
		System.out.println("name = " +t.toString());
		System.out.println(t);
	}
}
