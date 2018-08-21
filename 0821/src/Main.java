import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		ChannelBuffer.start();
		ChannelBuffer cb = new ChannelBuffer();
		try {
			cb.copy("C:/temp/KaKaoTalk.exe","C:/temp/ChannelBuffer.exe");
		}catch(IOException e) {}
		ChannelBuffer.end();
		System.out.println(ChannelBuffer.during() + "ms.");
	}
}
//Non 110058ms
//Small 3775ms
//Full
//ChannelBuffer 111ms.
//ChannelBuffer1 28ms.
//ChannelBuffer2 24ms.