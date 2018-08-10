/*
 * Member Inner class
 * 1.생성방법 : Outer's 참조변수를 통해서 == Outer.Inner inn = new Outer.Inner();
 * 2.제한사항 : 자신은 static 변수와 static메소드 가질 수 없다.
 * 3.사용이유 : 자기, 자기부모, 바깥, 바깥부모 까지 모두 접근 가능.
 * 
 */
public class InnerClassDemo1 {
	public static void main(String[] args) {
		Outer1 outter = new Outer1();
		Outer1.Inner1 inn = outter.new Inner1();//Inner class 생성자 생성
		System.out.println(outter.a);
		System.out.println(outter.b);
		inn.display();
	}
}

//멤버들의 접근방법 동일
//스태틱들의 접근방법 동일
class Outer1 extends DeprecationDemo{
	int a = 5; //outer's 멤버 변수
	static int b =10;//outer's 스태틱 변수
	class Inner1 extends JarDemo{//멤버 Inner class == 다중상속 가능
		int c = 500;
		//static int d = 100;  멤버클래스는 static변수 , static메소드 소장 불가.
		public void display() {
			System.out.println("display() = " + b);
			System.out.println("display() = "+ e);
			System.out.println("display() = " + f);
		}
	}
}