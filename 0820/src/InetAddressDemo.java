import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress[] array = InetAddress.getAllByName("E-04");//이름에 의해서 받아온다.
		for(InetAddress ia : array) {
			System.out.println(ia.getHostAddress());//호스트주소			
		}
	}
}
