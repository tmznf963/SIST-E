
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Car car = new Car();
		//System.out.println(car.price);
		car = null;
		try {
			System.out.println(car.price);			
		}catch(Exception e) {
			System.out.println(e.getMessage());//�Һ��ڿ� e.getMessage()
			System.out.println(e);//�����ڿ� e.toString();
			e.printStackTrace(); //�����ڿ� ���� �ڼ��ϰ� ������
		}
	}
}
class Car{
	int price = 25_000_000;
}
