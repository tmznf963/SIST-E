/*
 * Local Inner Class
 * 1. 생성방법 : 자기가 속해있는 메소드가 호출 되어야한다. 그리고 메소드안에서는 절차적이기 때문에
 * 						클래스 선언 이후에 생성 되어야한다.
 * 2. 제한사항 : 모든 access modifer(접근제한자) 사용 불가, static,abstract 사용불가. 오직 final 사용가능
 * 						JDK1.7이하에서는 지역클래스는 지역상수만 접근 가능.
 * 3. 사용이유 : 지역변수처럼 사용하고, 소멸시키기 위해서 ( 메소드 안에서 )
 * 
 * */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer2 o2 = new Outer2();
		o2.display();
	}
}
class Outer2{
	int a = 5;
	static int b =10;
	public void display() {
		int c = 500;//지역변수
		class Inner2{
			public void print() {
				System.out.println(c);//JDK1.8부터 지역 클래스가 지역변수에 접근 가능.
			}
		}
		Inner2 inn = new Inner2();
	}//display
}


//	void display() {
//		int su =5; 	//지역변수
//		class Inner{	//지역클래스 == 가능한건 오직 final
//			int a = 10;
//			public void print() {
//				
//			}
//		}	
//		Inner inn = new Inner();//메소드 안에서는 절차적. 선언 후에 생성
//		inn.print();
//	}//display