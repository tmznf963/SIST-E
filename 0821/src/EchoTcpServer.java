import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoTcpServer {
	private ServerSocket server;
	private Socket client;
	EchoTcpServer(){
		try {
			this.server = new ServerSocket(60000);			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	private void service() {
		try {
			while(true) {
				this.client = this.server.accept();
				ServerThread st = new ServerThread(this.client);
				st.start();
			}
		}catch(IOException e) {
			System.out.println("Not Connect.... "+ e);
		}
	}
	public static void main(String[] args) {
		new EchoTcpServer().service();//생성자 호출한 뒤에 서비스 하자.
	}
}
