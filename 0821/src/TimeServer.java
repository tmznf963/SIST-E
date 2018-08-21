import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeServer {
   private DatagramSocket socket;
   private DatagramPacket inPacket, outPacket;
   private SimpleDateFormat sdf;
   TimeServer(){
      String pattern = "지금은 yyyy년 MM월 dd일 aa hh시 mm분 ss초 입니다."; //->sdf에 이 정보가 들어있음
      this.sdf = new SimpleDateFormat(pattern);
      try {
         this.socket = new DatagramSocket(8888);
      } catch (SocketException e) {
         System.out.println(e);
      }
   }
   private void service() {
      try {
         while(true) {
            byte [] buffer = new byte[4];
            this.inPacket = new DatagramPacket(buffer, buffer.length); //일단 받아야 클라이언트 주소를 알지.
            this.socket.receive(inPacket); //클라이언트의 주소를 받음
            InetAddress client = this.inPacket.getAddress(); //클라이언트 포트 넘을 받음
            int port = this.inPacket.getPort();
            String dateString = this.sdf.format(new Date()); //들어오면 그때서야 데이트 만들고 내보내고 반복...
            this.outPacket = new DatagramPacket(dateString.getBytes(), 
                  dateString.getBytes().length, client, port); //포맷이 스트링이 기때문에 스트링으로 받고 쓸 때 바이트로 바꿔서 써주자
            this.socket.send(outPacket);
         }
      }catch(IOException ex) {
         System.out.println("Time Server Stopping.");
      }finally {
         if(this.socket != null) this.socket.close();
      }
   }
   public static void main(String[] args) {
      new TimeServer().service();
   }
}
