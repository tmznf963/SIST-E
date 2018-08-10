/*
 * Nested(Static) Inner class
 *1. 생성방법 : Outer.Inner inn = new Outer.Inner();
 *2. 제한사항 : Outer class의 멤버변수, 멤버메소드 접근 불가 == 메모리에 안올라 와서.
 *3. 쓰는 이유 : class를 packaging 하기 위해.
 * 
 * */
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer.b = 10;
		Outer.Inner inn = new Outer.Inner();//static의 접근 방법은 동일.[클래스이름.변수]
		System.out.println(inn.c);//멤버변수
		System.out.println(Outer.Inner.d);//스태틱변수
		inn.display(); //Inner의 멤버 메소드
	}
}
class Outer{
	int a = 5;		//바깥 클래스의 멤버변수
	static int b = 10; //바깥 클래스의 스태틱변수 
	//static 접근방법은 동일.
	static class Inner{ //protected private static 가능
		int c = 500;	//안쪽 클래스의 멤버변수
		static int d = 1000; //안쪽 클래스의 스태틱변수
		public void display() { //Inner의 멤버 메소드
			System.out.println("display = "+d);
		}
	}//static은 Outer의 멤버 접근 불가 = 이유 : static이 멤버변수보다 메모리에 먼저 올라가서.
}