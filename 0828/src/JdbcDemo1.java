import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.mariadb.jdbc.Driver;

public class JdbcDemo1 {
	private static final String DBURL = 
			"jdbc:mariadb://localhost:3306/world";
	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new Driver());
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "javamariadb");
		Connection conn = DriverManager.getConnection(DBURL, info);
	}
}
