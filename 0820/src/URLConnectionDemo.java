import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {// == 추상클래스 public abstract class URLConnection
	public static void main(String[] args) throws MalformedURLException, IOException{
		URL url = new URL("https://www.naver.com");
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
	}
}
