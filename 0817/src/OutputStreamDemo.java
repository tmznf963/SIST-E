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
			//가나다라마바사아자차카타파하
			fis = new FileInputStream("src/OutputStreamDemo.java");
			fos = new FileOutputStream("./copy.txt");
			while((count = fis.read(buffer)) >= 0) {
				fos.write(buffer);//버퍼에서 읽고 버퍼에서 내보내기.
				fos.flush();//싹 다 내보내기
			}
			System.out.println("File copy successfully");
		}catch(IOException e) {
			
		}finally {
			try {
				fis.close(); fos.close(); // 닫기
			}catch(IOException e) {
				
			}
		}
	}
}
