// this    : 나 자체 self
// this.   : 나의
// this() : ㅇ
public class ThisDemo {
	public static void main(String[] args) {
		Product mouse = new Product();//기본 생성자
		mouse.setName("Logitech mouse");
		mouse.setPrice(35_000);
		Product other = mouse.refCopy();
		System.out.println("Name = " + other.getName());
		System.out.println("Price = " + other.getPrice());
		
		mouse.setPrice(50_000);//주소복사 = 값이바뀌면 같이 바뀐다.
		System.out.println("Price = " + other.getPrice());
	}
}
