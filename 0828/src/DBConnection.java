
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn = null;
		Properties info = new Properties();
		try {
			info.load(new FileInputStream(new File("./dbinfo.properties")));
			//Driver Loading วัดู.
			Class.forName(info.getProperty("DBDRIVER"));
			conn = DriverManager.getConnection(info.getProperty("DBURL"), 
					info.getProperty("DBUSER"), info.getProperty("DBPWD"));
		}catch(ClassNotFoundException ex) {
			System.out.println("Driver Class Not Found");
		}catch(IOException ex) {
			System.out.println("File Not Found");  System.exit(-1);
		}catch(SQLException ex) {
			System.out.println("Connection Failure");
		}
		return  conn;
	}
}
