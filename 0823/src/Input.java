import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class Input {
	private Vector<Student> vector;
	private Scanner scan;
	private Connection conn;
	
	public Input(Vector<Student> vector, Connection conn) {  //Constructor
		this.vector = vector;
		this.conn = conn;
		File file = new File("./sungjuk.dat");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");   
			System.exit(-1);
		}	
	}
	public void input() throws SQLException {
		while(this.scan.hasNextLine()) {
			String line = this.scan.nextLine();   //1101     «—º€¿Ã     78     87     83    78
			StringTokenizer st = new StringTokenizer(line);
			String [] array = new String[st.countTokens()];
			int count = 0;
			while(st.hasMoreTokens()) {
				array[count++] = st.nextToken();
			}
			Student s = new Student(array[0], array[1], Integer.parseInt(array[2]),
					           Integer.parseInt(array[3]), Integer.parseInt(array[4]),
					           Integer.parseInt(array[5]));
			this.vector.addElement(s);
			
			Statement stmt = this.conn.createStatement();//4.
			String sql = "INSERT INTO Student(hakbun, irum, kor, eng, mat, edp)  ";
			sql += "VALUES('" + s.getHakbun() + "', '" + s.getIrum() + "', ";
			sql += s.getKor() + ", " + s.getEng() + ", " + s.getMat() + ",";
			sql += s.getEdp() + ")";
			//System.out.println(sql);
			stmt.executeUpdate(sql);
		}
	}
}





