import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;

public class ChannelBuffer {
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
		FileChannel inCh = fis.getChannel();
		FileChannel outCh = fos.getChannel();
		MappedByteBuffer map = inCh.map(MapMode.READ_ONLY, 0, inCh.size());
		outCh.write(map);
		//map.put(Charset.forName("utf-8").decode(outCh));
		
		System.out.println("Copy End...");
	}
}
