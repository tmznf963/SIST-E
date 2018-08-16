import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		//System.out.println("키보드 한개의 문자를 입력 : ");
		System.out.println("어느 계절을 좋아하시나요?? : ");
		//InputStream is =	System.in;//표준입력Stream
		String season = "";
		
		int su = 0;
		try {
			while(true) {
				su = System.in.read();//0~255   1byte 만 읽는다.
				if (su < 0 || (char) su =='\n') break; //음수 or 엔터
				season += (char)su;				
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("season = " + season);
	}
}
