
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Car car = new Car();
		//System.out.println(car.price);
		car = null;
		try {
			System.out.println(car.price);			
		}catch(Exception e) {
			System.out.println(e.getMessage());//소비자용 e.getMessage()
			System.out.println(e);//개발자용 e.toString();
			e.printStackTrace(); //개발자용 가장 자세하게 보여줌
		}
	}
}
class Car{
	int price = 25_000_000;
}
