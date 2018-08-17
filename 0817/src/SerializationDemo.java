import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class SerializationDemo {// 직렬화
	public static void main(String[] args) throws IOException{
		//Date date = new Date();//객체
		Student std = new Student("1101","Michael",67,45,89,100);//학생Class
		Student std1 = new Student("1102","Sally",77,66,81,100);//학생Class
		Student std2 = new Student("1103","Jaden",27,44,55,100);//학생Class
		Student std3 = new Student("1104","MINO",100,100,100,100);//학생Class
		Vector<Student> vector = new Vector<Student>(1,1);
		vector.addElement(std);
		vector.addElement(std1);
		vector.addElement(std2);
		vector.addElement(std3);
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("C:/temp/vector.ser"))));
		oos.writeObject(vector);
		oos.flush();
		System.out.println("Vector Object save success!!!");//20180807 PM 14:29
		oos.close();
	}
}
