
public class HelloWorld3 {
	public static void main(String[] args) {
		Demo d = new Demo();//林家立辟
		System.out.println("str = " +d.str);
		System.out.println("str = " +new Demo().str);
	}
}

class Demo{//林家
	String str = "Hello, World";
}