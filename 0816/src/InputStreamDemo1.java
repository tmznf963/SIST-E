import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) {
		//System.out.println("Ű���� �Ѱ��� ���ڸ� �Է� : ");
		System.out.println("��� ������ �����Ͻó���?? : ");
		//InputStream is =	System.in;//ǥ���Է�Stream
		String season = "";
		int count = 0;//���� ����
		byte[] buffer = new byte[512];
		
		try {
			count = System.in.read(buffer);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("season = " + new String(buffer, 0, count));// �迭 , 0 , ����
		
	}
}
