import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class EchoUdpServer {
	private DatagramSocket socket;
	private DatagramPacket outPacket,inPacket;
	
	EchoUdpServer(){
		try {
			this.socket = new DatagramSocket(7777);
			System.out.println("Server ready..........");
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try {
			byte[] buffer = new byte[512];//¦���� ����.
			while (true) {
				this.inPacket = new DatagramPacket(buffer, buffer.length);
				this.socket.receive(inPacket);
				InetAddress ia = this.inPacket.getAddress();
				System.out.println("["+ia.getHostAddress()+"] ���� �����ϼ̽��ϴ�.");
				String msg = new String(buffer, 0, this.inPacket.getLength());
				if(msg.equals("bye")) {
					break;
				}
				System.out.println("Message From Client : " + msg);
				this.outPacket = 
						new DatagramPacket(msg.getBytes(), msg.getBytes().length, this.inPacket.getAddress(), this.inPacket.getPort());
				//�迭, ������, ��������ּ�, ���������Ʈ��ȣ
				this.socket.send(outPacket);
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			if(this.socket != null) this.socket.close();
		}
	}
	
	public static void main(String[] args) {
		new EchoUdpServer().service();
	}
}
