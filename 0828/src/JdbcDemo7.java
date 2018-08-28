import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo7 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
		rs.first();
		rs.updateString(1, "1100");
		rs.updateRow();
		
		/*rs.moveToInsertRow();//insert할 곳으로 이동.
		rs.updateString(1, "eee"); //ID
		rs.updateString(2, "이상수"); // NAME
		rs.updateString(3, null); //AGE == rs.updateNull(3);
		rs.insertRow();*/
		
		/*rs.first();//첫 번째 행에 커서
		rs.deleteRow();// 그 행 지워.
		 */		
		DBClose.close(conn);
	}
}
