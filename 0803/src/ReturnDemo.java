
public class ReturnDemo {
	public static void main(String[] args) {
		ReturnDemo rd = new ReturnDemo();
		String result = rd.demo(6);
		System.out.println("result = " + result);
		
		//rd.demo();//call by name
	}
	
	String demo(int num) {//������� ( instance ) == �ּ� ����
	if(num %2 ==0) return "World";
		else return "Hello";//������ return
	}
	
}
