import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getInstance();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
		while(rs.next()) {
			System.out.printf("%s  %s  %d  %d  %d  %d  %d  %.1f  %c  \n",
					rs.getString("hakbun"),rs.getString("irum"),rs.getInt("kor"),
					rs.getInt("eng"),rs.getInt("mat"),rs.getInt("edp"),
					rs.getInt("sum"),rs.getDouble("avg"),rs.getString("grade"));
		}
		DBClose.close(conn);
	}
}
