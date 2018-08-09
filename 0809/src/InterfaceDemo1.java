
public class InterfaceDemo1 {
	public static void main(String[] args) {
		// 5. interface는 추상클래스와 같이 인스턴스가 되지 못한다.
		// 반드시 다형성으로 구현
		Dateable date = new Date(); //자식 사용(추상화, 인터페이스)
		
		date.set(Dateable.THU);//자식의 set
		System.out.println("오늘은 " +date.get()+"번 째 요일입니다.");//자식의 get
	}
}
