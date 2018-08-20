import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	private ServerSocket server;
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;
	MyServer(){
		try {
			this.server = new ServerSocket(80);// 0~65535			
			System.out.println("I'm ready.....");
		}catch(IOException e) {
			
		}
	}
	private void service() {
		try {
		//while(true) {
			this.client = this.server.accept();
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream())));
			File file = new File("./index.html");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine())!=null) {
				this.pw.println(line); this.pw.flush();
			}
			/*this.br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}*/
		//}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				this.client.close();
			}catch(IOException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		new MyServer().service();
	}
}
