import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTimeDemo2 {
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar(2018,7,1);//2018.08.01
		//System.out.println(g.isLeapYear(2018));//윤년 체크 함수
		//System.out.println(g.getActualMaximum(Calendar.DAY_OF_MONTH));
		int days = g.get(Calendar.DAY_OF_WEEK);
		//1 : SUNDAY
		int last = g.getActualMaximum(Calendar.DATE);
		System.out.println(days);
		System.out.println(last);
		
	}
}
