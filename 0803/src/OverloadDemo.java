
public class OverloadDemo {//중복되게 만드는 것
	public static void main(String[] args) {//static ---> 처음에 main()을 호출하기 위해
		print("HelloWorld");
	}
	static void print(int n) { //Method오버로딩 조건 : 이름 같고 , 파라미터(타입,갯수) 다르고 , 리턴타입 같아도 되고 달라도 되고.
		System.out.println("정수 n :"+n);
	}
	static void print(double n) {
		System.out.println("실수 n :"+n);
	}
	static void print(String n) {
		System.out.println("문자열 n :"+n);
	}
}
