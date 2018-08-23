import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static Connection instance;
	private Connection conn;
	private static Connection create() {
		return new DBConnection().getConnection();
	}
	public static Connection getInstance() {
		if(instance == null ) instance = create();
		return instance;
	}
	private Connection getConnection() {
		return this.conn;
	}
	private DBConnection() { //생성자
		Properties info = new Properties();
		Connection conn = null;
		try {
			info.load(new FileInputStream(new File("./dbinfo.properties")));
			//Driver Loading 한다.
			Class.forName(info.getProperty("DBDRIVER"));
			this.conn = DriverManager.getConnection(
					info.getProperty("DBURL"), 
					info.getProperty("DBUSER"), 
					info.getProperty("DBPWD"));
		}catch(ClassNotFoundException ex) {
			System.out.println("Driver Class Not Found");
		}catch(IOException ex) {
			System.out.println("File Not Found");  System.exit(-1);
		}catch(SQLException ex) {
			System.out.println("Connection Failure");
		}
	}
}
