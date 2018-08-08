
public class OverrideDemo1 { // Override = 메소드만 가능 , 부모 자식 관계에서만 가능
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
		System.out.println(d.toString());
	}

}

class Demo extends Object{
	private String name = "Michael";
//	@Override
//	public String toString() {//Object 의 메소드를 Override(재정의)
//		return "My name is " +this.name;
//	}

	@Override
	public String toString() {
		return "Demo [name=" + name + "]";
	}
	
}