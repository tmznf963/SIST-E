
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo(); //생성
		md.calcSum();
	}
	
	void calcSum(){//메소드(function)//멤버변수처럼 불러야한다. 생성자
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			sum +=i;
		}
		System.out.println("1~100 sum = "+sum);
	}
	
}
