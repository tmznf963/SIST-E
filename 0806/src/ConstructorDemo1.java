
public class ConstructorDemo1 {
	public static void main(String[] args) {
		Car car = new Car(); car.display();
	}
}

class Car {
	private String name;
	private int price;
	private double weight;
	private boolean isNew;
	private char grade;
	public Car() {// default constructor' override(재정의)   =! overloading
		System.out.println("나는 기본 생성자");
		this.price = 0;
		this.grade ='\0';
		this.isNew = false;
		this.name = null;
		this.weight = 0.0;
	}
	public void display() {
		System.out.println(price +" "+name);
		System.out.println(weight + " "+isNew);
		System.out.println(grade);
	}
}