import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress[] array = InetAddress.getAllByName("E-04");//�̸��� ���ؼ� �޾ƿ´�.
		for(InetAddress ia : array) {
			System.out.println(ia.getHostAddress());//ȣ��Ʈ�ּ�			
		}
	}
}
