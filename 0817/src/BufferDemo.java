import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line = null;
		try {
			//�����ٶ󸶹ٻ������īŸ����
			br = new BufferedReader(new FileReader("src/BufferDemo.java"));
			bw = new BufferedWriter(new FileWriter("./buffercopy.txt")); //���ΰ� ���ΰ�
			while((line = br.readLine()) != null) {//read�� �� �� �� ������ null�� �ƴ� ����.
				bw.write(line+"\n");//�� �� ���
				
			}
			System.out.println("File copy successfully");
		}catch(IOException e) {
			
		}finally {
			try {
				br.close(); bw.close(); // �ݱ�
			}catch(IOException e) {
				
			}
		}
	}
}
