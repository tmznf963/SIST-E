import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo { // 한글을 못 읽음.
	public static void main(String[] args) throws IOException{
		//가나다라마바사아자차카타파하
		File file = new File("src/RandomAccessFileDemo.java");
		RandomAccessFile raf = new RandomAccessFile(file,"r");//"r" == read 모드
		while(raf.getFilePointer() < raf.length()) { //포인터가 파일의 크기까지.
			String line = Utility.entoko(raf.readLine());
			System.out.println(line);//한 줄 읽기
		}
		raf.close();
	}
}
