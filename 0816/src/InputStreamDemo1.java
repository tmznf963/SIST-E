import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) {
		//System.out.println("키보드 한개의 문자를 입력 : ");
		System.out.println("어느 계절을 좋아하시나요?? : ");
		//InputStream is =	System.in;//표준입력Stream
		String season = "";
		int count = 0;//읽은 갯수
		byte[] buffer = new byte[512];
		
		try {
			count = System.in.read(buffer);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("season = " + new String(buffer, 0, count));// 배열 , 0 , 갯수
		
	}
}
