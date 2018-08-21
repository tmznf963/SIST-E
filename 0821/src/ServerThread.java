import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ServerThread(Socket socket) {//������
		this.socket = socket;
		InetAddress ia = this.socket.getInetAddress(); //Ŭ���̾�Ʈ�� �ּҸ� �̾Ƴ���
		System.out.println("["+ia.getHostAddress()+"] is just connected.");
		try {
			this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())));
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	@Override
	public void run() {//os�� ������ run()
		try{
			while(true) {
				String msg = this.br.readLine();
				if(msg.equals("bye")) break;
				System.out.println("Message From Client : " + msg);
				this.pw.println(msg);
				this.pw.flush();//PrintWriter == �ݵ�� flush();
			}
		}catch(IOException e) {
			System.out.println("Client is not connected...");
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
	
}
