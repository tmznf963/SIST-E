import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("path : ");
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine() ;
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println("path = " + file.getPath());
			System.out.println("absolute path = " + file.getAbsolutePath());
			System.out.println("canonical path = " + file.getCanonicalPath());//Exception 처리 필요
		}else
			System.out.println("Not Found");
		System.exit(-1); //강제종료
	}
}
