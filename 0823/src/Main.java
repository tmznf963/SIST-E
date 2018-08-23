import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Student> vector = new Vector<Student>(1,1);
		Connection conn = DBConnection.getInstance();
		Input input = new Input(vector, conn);
		
		try {
			input.input();//input클래스에 input메소드
			System.out.println("DB연결 성공");
		}catch(SQLException e) {
			System.out.println(e);
		}
		DBClose.close(conn);
	}
}
