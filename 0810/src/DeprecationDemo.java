import java.util.Date;

public class DeprecationDemo {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);

		int year = now.getYear();//Deprecation = 오래되어서 사용 안하는 메소드.
		System.out.println("year = "+year);//현재 2018 - 1900년
		System.out.println("Month = "+now.getMonth());
	}
}
