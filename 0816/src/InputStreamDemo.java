import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		//System.out.println("Ű���� �Ѱ��� ���ڸ� �Է� : ");
		System.out.println("��� ������ �����Ͻó���?? : ");
		//InputStream is =	System.in;//ǥ���Է�Stream
		String season = "";
		
		int su = 0;
		try {
			while(true) {
				su = System.in.read();//0~255   1byte �� �д´�.
				if (su < 0 || (char) su =='\n') break; //���� or ����
				season += (char)su;				
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("season = " + season);
	}
}
