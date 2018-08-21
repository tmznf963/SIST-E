import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		ChannelBuffer1.start();
		ChannelBuffer1 cb1 = new ChannelBuffer1();
		try {
			cb1.copy("C:/temp/KaKaoTalk.exe","C:/temp/nonbuffer.exe");
		}catch(IOException e) {}
		ChannelBuffer1.end();
		System.out.println(ChannelBuffer1.during() + "ms.");
	}
}
//Non 110058ms
//Small 3775ms
//Full
//ChannelBuffer 111ms.
//ChannelBuffer1 28ms.
//ChannelBuffer2 24ms.