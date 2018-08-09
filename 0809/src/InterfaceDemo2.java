
public class InterfaceDemo2 implements Father , Mother {//인터페이스는 다중 상속 가능
	@Override
	public void grandFather() {System.out.println("할아버지 접근");}
	public void grandMather() {System.out.println("할머니 접근");}
	public void father() {System.out.println("아버지 접근");}
	public void mother() {System.out.println("어머니 접근");}
	//다중 상속 == 모두 재정의(Override) 해야함.
	public void display() {System.out.println("Call by display()");}
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();//다형성 접근 부모 = 자식();
		gf.grandFather();
		// 7. 각 interface 참조변수는 본인의 interface에서 선언된 메소드만 접근 가능.
		
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMather gm = id;//다형성
		gm.grandMather();
		
		Father f = new InterfaceDemo2();
		f.father(); f.grandFather(); f.grandMather();
		// 8. 자식 interface는 상속받은 부모 interface의 메소드 접근 가능
		//f.display();
		// 9. 부모형 참조변수는 자식의 모든 메소드 접근이 아니라 재정의된 메소드만 접근 가능
		
		Mother [] array = new Mother[3];
		array[0] = new InterfaceDemo2();//다형성 접근
		array[0].mother();//mother 주소이기에 mother 만 접근
		// 10. interface형 배열 생성 가능
		
		System.out.println("Father name = " + Father.NAME);
		System.out.println("Mother name = " + Mother.NAME);//interface 이름.상수 --> 접근
	}
}
