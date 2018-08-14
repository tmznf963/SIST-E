import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
		Properties info = new Properties();
		File file = new File("./info.properties"); // ./현재경로
		info.load(new FileInputStream(file));
		System.out.println(info.getProperty("date"));
		System.out.println(info.getProperty("time"));
		System.out.println(info.getProperty("name"));
		System.out.println(info.getProperty("language"));
		System.out.println(info.getProperty("USERID"));
		System.out.println(info.getProperty("PASSWORD"));
	}
}
