import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo1 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.naver.com/index.html");
		InputStream is = url.openStream();
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:/temp/naver.html"))));
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line = null;
		while((line=br.readLine()) != null) { //한 줄 씩 읽기
			System.out.println(line);
			pw.println(line);
			pw.flush();//찌꺼기까지 내보내기
		}
		System.out.println("Save successfully !!!!!!!!!!");
		pw.close();//닫기
	}
}
