import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte [] buffer = new byte[20];
		int count = 0;
		try {
			//�����ٶ󸶹ٻ������īŸ����
			fis = new FileInputStream("src/OutputStreamDemo.java");
			fos = new FileOutputStream("./copy.txt");
			while((count = fis.read(buffer)) >= 0) {
				fos.write(buffer);//���ۿ��� �а� ���ۿ��� ��������.
				fos.flush();//�� �� ��������
			}
			System.out.println("File copy successfully");
		}catch(IOException e) {
			
		}finally {
			try {
				fis.close(); fos.close(); // �ݱ�
			}catch(IOException e) {
				
			}
		}
	}
}