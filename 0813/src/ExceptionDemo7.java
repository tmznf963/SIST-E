import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo7 {
	public static void main(String[] args) throws FileNotFoundException{//ctrl + shift +o
		File file = new File("./ExceptionDemo7.java");
		Scanner scan = new Scanner(file);
	}
}
