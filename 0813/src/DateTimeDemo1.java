import java.util.Calendar;
//2.Calendar 사용
public class DateTimeDemo1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();// 추상클래스라서 new 못 씀.
		Calendar now1 = Calendar.getInstance();
		
		System.out.println(now.hashCode());
		System.out.println(now1.hashCode());
		
		if (now == now1)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year +" "+month+" "+day+" ");
	}
}
