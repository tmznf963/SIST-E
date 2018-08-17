import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException{
		System.out.println("어느 계절을 좋아하세요? : ");
		//InputStream is = System.in;//byte[]
		//InputStreamReader isr = new InputStreamReader(System.in);//byte[] 을 char[]로 바꿔주기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//감싸고 감싸고
		String season = br.readLine();//한 줄 읽음 == Enter 칠 때 까지
		System.out.println("seson = " + season);
	}
}
