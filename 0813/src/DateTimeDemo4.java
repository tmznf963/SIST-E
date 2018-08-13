import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo4 {
	public static void main(String[] args) {
		String pattern = "오늘은 yyyy년 MM월 dd일입니다.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
	}
}
