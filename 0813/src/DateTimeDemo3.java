import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeDemo3 {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT,Locale.KOREA);
		System.out.println(df.format(new Date()));
	}
}
