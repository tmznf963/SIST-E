/*
 *형변환(Casting, Conversion)
 *1. 자동형변환(암시적 형변환, implicit casting)
 *		1)소 -> 대
 *		2)3 + 3.14 = 6.14
 *		3)"Hello" + 123 = "Hello123"
 *2. 강제형변환(명시적 형변환, explicit casting)
 * 	1)대 -> 소
 * 	2)int su = (int)34L;
 */
public class CastDemo {
	public static void main(String[] args) {
		Test1 test = new Test1();//부모
		Temp temp = new Temp();//자식
		
		//자식 --> 부모 : 자동,강제 항상 성공
		test = (Test1)temp;//자식이 부모로 형변환 가능
		
		//부모 --> 자식 : 자동형변환 실패, 강제형변환 성공 == 컴파일 || 런타임 성공or실패
		if(test instanceof Temp) {
			System.out.println("된다.");
			temp = (Temp)test;//부모를 자식으로
		}else {
			System.out.println("안된다.");
		}
		
	}
}
class Test1{
	
}
class Temp extends Test1{
	
}