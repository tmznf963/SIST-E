/*
 * 객체비교
 * 1. 값비교 : Primitive type, '==' 연산자 이용
 * 2. 주소비교
 * 	1)String type
 *       == : 값비교 or 주소비교
 *       equals() : 값비교
 * 	2)Reference type (참조형)
 *       ==, equals() : 모두 주소비교
 * 3. 객체의 equals() 재정의
 * 
 * */
public class OverrideDemo2 {
	public static void main(String[] args) {
		/*1.
		 * String str = "Hello";
		String str1 = "Hello";
		if(str.equals(str1)) {
			System.out.println("같다");
		}else
			System.out.println("다르다");*/
		
/*		2.
		Test t = new Test();
		Test t1 = new Test();
		t.su = 100;
		t1.su = 100;
		if (t.equals(t1)) {
			System.out.println("같다");
		}else
			System.out.println("다르다");
		*/
		
		//3.
		Point original = new Point(100,200);
		Point target = new Point(100,200);
		if(original.equals(target)) {
			System.out.println("같다");
		}else
			System.out.println("다르다");
	}
}

class Test{
	int su;
}
