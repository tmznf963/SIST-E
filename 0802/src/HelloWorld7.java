
public class HelloWorld7 {
	public static void main(String[] args) {
		Car car = new Car();//주소접근
		car.display();
	}
}

class Car {//주소
	void display() {
		System.out.println("Hello World!!!");
	}
}

//static이면 class이름 접근
//멤버변수면 주소 접근
