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
      String pattern = "������ yyyy�� MM�� dd�� aa hh�� mm�� ss�� �Դϴ�."; //->sdf�� �� ������ �������
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
            this.inPacket = new DatagramPacket(buffer, buffer.length); //�ϴ� �޾ƾ� Ŭ���̾�Ʈ �ּҸ� ����.
            this.socket.receive(inPacket); //Ŭ���̾�Ʈ�� �ּҸ� ����
            InetAddress client = this.inPacket.getAddress(); //Ŭ���̾�Ʈ ��Ʈ ���� ����
            int port = this.inPacket.getPort();
            String dateString = this.sdf.format(new Date()); //������ �׶����� ����Ʈ ����� �������� �ݺ�...
            this.outPacket = new DatagramPacket(dateString.getBytes(), 
                  dateString.getBytes().length, client, port); //������ ��Ʈ���� �⶧���� ��Ʈ������ �ް� �� �� ����Ʈ�� �ٲ㼭 ������
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
