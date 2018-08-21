import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoTcpClient {
	private Socket socket;
	private PrintWriter pw;
	private BufferedReader br;
	EchoTcpClient(){
		try {
			this.socket = new Socket(InetAddress.getByName("E-00"), 60000);//Socket(IP , port��ȣ);
			System.out.println(InetAddress.getByName("localhost")+" ��� ������ ����Ǿ����ϴ�.");
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())));
			this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		Scanner scan = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("������ ���� �޽��� : ");
				String line = scan.nextLine();
				if (line.equals("bye")) {
					this.pw.println(line);
					this.pw.flush();
					break;
				}
				this.pw.println(line);
				this.pw.flush();
				String msg = this.br.readLine();// ������ ���� �� �޽���
				System.out.println("Message From Server : " + msg);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	@Override
	protected void finalize() {//�Ҹ���
		try {
			this.socket.close();
			this.br.close();
			this.pw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new EchoTcpClient().service();
	}
}
