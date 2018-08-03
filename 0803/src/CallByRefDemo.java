
public class CallByRefDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		input(ballpen);
		output(ballpen);
	}
	static void input(Product p) {//Call By Reference == 볼펜의 주소 (Product)
		p.name = "모나미 볼펜";
		p.price = 100;
	}
	static void output(Product p) {//주소에 의한 변경은 값이 변경이 된다.
		System.out.printf("이름 : %s  \n가격 : %d",p.name,p.price);
	}
}
