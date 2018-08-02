//다른 집에있는 static 찾기
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println("str = " +Test.str);
		System.out.println("str = " +Test1.str);
	}
}

class Test{//주소
	static String str = "Hello, World";
}
class Test1{//주소
	static String str = "Good Afternoon";
}