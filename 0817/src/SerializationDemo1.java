import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class SerializationDemo1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("C:/temp/vector.ser"))));
		Object obj = ois.readObject();
		
		Vector<Student> vector = (Vector<Student>)obj;
		for (Student s : vector) System.out.println(s);
		ois.close();
	}
}
