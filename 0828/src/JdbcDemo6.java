import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Scrollable Statement
public class JdbcDemo6 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement(
														ResultSet.TYPE_SCROLL_INSENSITIVE,
														ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
		/*rs.afterLast();//마지막 칸으로 간다음
		while(rs.previous()) {//거꿀로 올라감
			System.out.println(rs.getString("hakbun"));			
		}*/
		rs.first();//처음 칸으로 이동
		System.out.println(rs.getString("hakbun"));
		rs.last();//마지막 칸
		System.out.println(rs.getString("hakbun"));
		rs.absolute(3); //3번째 학 생
		System.out.println(rs.getString("hakbun"));
		rs.relative(-1);//현재 커서 -1번째
		System.out.println(rs.getString("hakbun"));
		
		DBClose.close(conn);
	}
}
