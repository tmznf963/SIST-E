
public class HelloWorld2 {
	static String str = "Hello, World"; 
	//static = 공유변수 (class변수, static변수)
	public static void main(String[] args) {
		//지역변수 (local)
		HelloWorld2 hw = new HelloWorld2();
		
		System.out.println(hw.str);//주소접근
		System.out.println(HelloWorld2.str);//클래스
		System.out.println(str); //동일클래스
		
	}
}

