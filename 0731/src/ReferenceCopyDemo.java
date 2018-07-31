
public class ReferenceCopyDemo {

	public static void main(String[] args) {
		Car tico = new Car();
		tico.price = 100;
		
		Car matiz = new Car();
		matiz.price = 200;
		
		tico.price = matiz.price;
		matiz.price = 500;
		
		System.out.printf("matiz.price = %d\n",matiz.price);
		System.out.printf("tico.price =%d\n",tico.price);
	}
}

class Car{
	int price;
}
