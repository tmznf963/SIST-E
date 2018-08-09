
public abstract class Demo {//추상메소드 하나라도 있으면 추상클래스
	private String name = "Michael";
	public void display() {
		System.out.println("부모 name = " + this.name);
	}
	public abstract void print();//추상메소드 {body}가 없음
}

