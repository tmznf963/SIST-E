import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		
		String myurl = scan.nextLine();
		
		try {
			URL url = new URL(myurl);
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port Number : " + url.getPort());
			System.out.println("Default Port : " + url.getDefaultPort());
			System.out.println("File Name : " + url.getFile());
			System.out.println("Query String : " + url.getQuery());
			System.out.println("Reference : " + url.getRef());
		} catch (MalformedURLException e) {
			System.out.println(e);//프로토콜을 썼는지 체크하는 Exception
		}
	}
}
