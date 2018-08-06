
public class ConstructorDemo4 {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		//car1 = null; <-- 이게 아님
		System.gc(); //가비지컬렉터 호출
	}
}
