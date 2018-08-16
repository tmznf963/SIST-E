import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileInputStreamDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("File path : ");
		String path = scan.nextLine();
		FileInputStream fis = null;
		byte [] buffer = new byte[100];// --> �ѱ� ��������. Byte �迭
		try {
			fis = new FileInputStream(path);
			//fis.read();//1byte �� �о��. //�ѱ� �� �д´�. �ѱ� == 2byte
			while(true) {
				int count = fis.read(buffer);
				if(count <0) break;
				else System.out.print(new String(buffer, 0 , count));
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();				
			}catch(IOException e) {
				System.out.println("Finally = "+e);
			}
		}
		
		
	}
}
