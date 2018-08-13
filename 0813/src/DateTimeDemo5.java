import java.util.Date;

public class DateTimeDemo5 {
	public static void main(String[] args) {
		//System.out.printf("Now is %1$tY년 %1$tm월 %1$td일 입니다.", new Date());//첫번쨰 변수를 같이 '1$'
		
		System.out.printf("NOW is %1$tF %1$tR 입니다.",new Date());
	}
}
