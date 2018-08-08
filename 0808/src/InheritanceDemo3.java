
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sub sub = new Sub();//상속은 항상 자식클래스로 접근.
		System.out.println(sub.name);
		System.out.println(sub.price);
		System.out.println(Super.price);//공유변수 는 클래스 이름 접근.
		//System.out.println(Super.name); // static 변수가 아니기에 접근 불가
	}
}

class Super {
	String name = "Michael";
	static int price = 150; //공유 변수
}

class Sub extends Super{
	
}
