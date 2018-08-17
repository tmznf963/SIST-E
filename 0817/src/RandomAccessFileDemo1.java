import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		File file = new File("C:/temp/data.txt");
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		raf.writeBoolean(false);
		raf.writeDouble(3.14);
		raf.writeInt(610);
		raf.writeChars("A");
		raf.writeChar(66);
		raf.writeUTF("Hello");
		raf.writeUTF("안녕하세요");
		
		raf.seek((long)0);//포인터 위치 변경
		System.out.println(raf.readBoolean());
		System.out.println(raf.readDouble());
		System.out.println(raf.readInt());
		System.out.println(raf.readChar());
		System.out.println(raf.readChar());
		System.out.println(raf.readUTF());
		System.out.println(raf.readUTF());
//		raf.getFilePointer();
//		raf.length();
		
		raf.close();//IOException 닫기
	}
}
