import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FullBuffer {
	private static long start;
	private static long end;
	public static void start() {
		start = System.currentTimeMillis();
	}
	public static void end() {
		end = System.currentTimeMillis();
	}
	public static long during() {
		return end - start;
	}
	public void copy(String source, String target) throws IOException{
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		int count =0 ; byte[] buffer = new byte[fis.available()];//바이트배열 사이즈 == source 의 size 만큼
			fos.write(buffer,0,count);
		System.out.println("Copy End...");
	}
}
