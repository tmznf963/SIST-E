import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("C:/");
		File[] array = file.listFiles();
		
		for(File f : array) {
			Date d = new Date(f.lastModified());
			String pattern = "yyyy-MM-dd aa hh:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			System.out.print(sdf.format(d)+" ");
			if(f.isDirectory()) 
				System.out.print("<DIR>");
			else System.out.printf("%,d ",f.length());
			System.out.println("\t"+f.getName());
		}
	}
}
