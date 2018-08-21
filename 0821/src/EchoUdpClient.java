import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class EchoUdpClient {
	private DatagramPacket inPacket, outPacket;
	private DatagramSocket socket;
	
	EchoUdpClient(){//생성자 == 초기화
		try {
			this.socket = new DatagramSocket();//모든 포트번호를 가능 == 특정포트번호 쓰지 않음.
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
	private void service() {
		Scanner scan = new Scanner(System.in);
		this.outPacket = null;
		this.inPacket = null;
		try {
			
		while(true) {
			
			System.out.println("Enter a string to send server : ");
			String line = scan.nextLine();
			if(line.equals("bye")) {
				this.outPacket = new DatagramPacket(line.getBytes(),
						line.getBytes().length, InetAddress.getByName("localhost"),7777);
				this.socket.send(outPacket);
				break;
			}
			this.outPacket = 
					new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("localhost"),7777);
			this.socket.send(outPacket);
			byte[] buffer = new byte[512];
			this.inPacket = new DatagramPacket(buffer,buffer.length);
			this.socket.receive(inPacket);
			System.out.println("Message From Server : "+ new String(buffer,0, this.inPacket.getLength()));
			//byte배열을 String으로 변환    0~사이즈 만큼
		}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			if(this.socket != null) this.socket.close();
		}
	}
	public static void main(String[] args) {
		new EchoUdpClient().service();
	}
}
