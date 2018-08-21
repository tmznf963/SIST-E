import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TimeClient {
	public static void main(String[] args) throws InterruptedException, UnknownHostException, IOException {
		DatagramSocket socket = new DatagramSocket();
		for(int i = 0 ; i <20 ; i++){
			Thread.sleep(1000);
			socket.send(new DatagramPacket("".getBytes(),"".getBytes().length,InetAddress.getByName("localhost"),8888));
			byte[] buffer = new byte[100];
			DatagramPacket inPacket = new DatagramPacket(buffer, buffer.length);
			socket.receive(inPacket);
			System.out.println(new String(buffer, 0, inPacket.getLength()));
		}
		
	}
}
