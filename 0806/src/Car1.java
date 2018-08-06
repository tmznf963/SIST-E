
public class Car1 {
	private String maker;
	private String name;
	private int price;
	private String bgcolor;
	public Car1() {
		System.out.println("방금 객체가 생성되었습니다.");
	}
	protected void finalize() {
		System.out.println("방금 객체가 소멸되었습니다.");
	}
}
