import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException{
		System.out.println("��� ������ �����ϼ���? : ");
		//InputStream is = System.in;//byte[]
		//InputStreamReader isr = new InputStreamReader(System.in);//byte[] �� char[]�� �ٲ��ֱ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//���ΰ� ���ΰ�
		String season = br.readLine();//�� �� ���� == Enter ĥ �� ����
		System.out.println("seson = " + season);
	}
}
