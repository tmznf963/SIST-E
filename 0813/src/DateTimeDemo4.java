import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo4 {
	public static void main(String[] args) {
		String pattern = "������ yyyy�� MM�� dd���Դϴ�.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
	}
}
