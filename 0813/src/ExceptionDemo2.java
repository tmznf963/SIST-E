
public class ExceptionDemo2 {
	public static void main(String[] args) {
		aaa();
	}

	static void aaa() {
		try {
			bbb();
		} catch (Exception e) {
			System.out.println("Catch Succes");
		}
	}
	static void bbb() {ccc();}
	static void ccc() {ddd();}
	static void ddd() {System.out.println(5/0);}
}
