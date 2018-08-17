import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		System.out.println(File.separator);
		System.out.println(System.getProperty("file.separator"));
		System.out.println(File.pathSeparator);
		System.out.println(System.getProperty("path.separator"));
	}
}
