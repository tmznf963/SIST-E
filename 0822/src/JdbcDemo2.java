//1. import วัดู.
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDemo2 {
	public static void main(String[] args) {
		dbConnection dbconn = new dbConnection();
		Statement stmt = null;  ResultSet rs = null;
		Connection conn = dbconn.getConnection();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM city WHERE countrycode = 'KOR' ";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString("name");
				int population = rs.getInt(5);
				System.out.printf("name = %s, population = %d\n", name, population);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		dbClose.close(conn, stmt, rs);
	}
}
