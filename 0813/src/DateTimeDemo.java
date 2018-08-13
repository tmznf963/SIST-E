import java.util.Date;

/*
 * 1.시간 = Date() 사용
 * */
public class DateTimeDemo {
	public static void main(String[] args) {
		//System.out.println(new Date());//날짜 시간 정보
		//System.out.println(System.currentTimeMillis());
		Date d = new Date(System.currentTimeMillis());
		System.out.println("Now = " +  d);
	}
}
