
public class Demo {
	private String name;
	private int price;
	public void display() {
		System.out.println("name = " + name);
		System.out.println("price = " + price);
	}
	public Demo() {//default Constructor
		//new Demo("unknown",10_000);//주소가 다른방을 만든다.
		this("unknown",10000); 
		//this() == 새 주소를 안만들고 생성자 호출
		//생성자 안에서만 사용가능 , 무조건 첫번째 줄
	}
	public Demo(String name) {//오버로딩이 많으면 옵션이 많아진다.
		this.name = name;
	}
	public Demo(int price) {
		this.price = price;
	}
	public Demo(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
