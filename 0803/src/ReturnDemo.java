
public class ReturnDemo {
	public static void main(String[] args) {
		ReturnDemo rd = new ReturnDemo();
		String result = rd.demo(6);
		System.out.println("result = " + result);
		
		//rd.demo();//call by name
	}
	
	String demo(int num) {//멤버변수 ( instance ) == 주소 접근
	if(num %2 ==0) return "World";
		else return "Hello";//조건적 return
	}
	
}
