
public class HelloWorld8 {
	public static void main(String[] args) {
		Product.display();	//class이름 접근
	}
}

class Product {
	static void display() { 	// static 이니깐 class이름 접근
		System.out.println("HelloWorld!!!!!!");
	}
}