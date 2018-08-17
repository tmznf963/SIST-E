import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo { // �ѱ��� �� ����.
	public static void main(String[] args) throws IOException{
		//�����ٶ󸶹ٻ������īŸ����
		File file = new File("src/RandomAccessFileDemo.java");
		RandomAccessFile raf = new RandomAccessFile(file,"r");//"r" == read ���
		while(raf.getFilePointer() < raf.length()) { //�����Ͱ� ������ ũ�����.
			String line = Utility.entoko(raf.readLine());
			System.out.println(line);//�� �� �б�
		}
		raf.close();
	}
}
