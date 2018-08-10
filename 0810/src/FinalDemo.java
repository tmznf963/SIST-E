//상수는 ALL 대문자

public class FinalDemo {
	int kor; //멤버 변수
	final int ENG = 100; //멤버상수
	static int price = 25_000_000; //공유변수, static, class
	static final String NAME = "Sally"; //static(class) 상수
	public static void main(String[] args) {
		int su = 5; //지역 변수
		final int NUM = 10; //지역 상수
		//NUM = 11; //상수는 바꾸지 못한다.
		
		FinalDemo fd = new FinalDemo();
		//fd.ENG = 1001; //상수는 바꾸지 못한다.
		
		//NAME = "Michael";//상수는 바꾸지 못한다.
		price = 100;
		
		System.out.println(price);
	}
}
