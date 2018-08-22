import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {
	private Properties dbinfo;
	public dbConnection() {  //Constructor
		this.dbinfo = new Properties();
		File file = new File("./dbinfo.properties");
		try {
			this.dbinfo.load(new FileInputStream(file));
		}catch(IOException ex) {
			System.out.println("File Not Found");   System.exit(-1);
		}
	}
	public Connection getConnection() {
		Connection conn = null;  
		try {
			Class.forName(dbinfo.getProperty("DBDRIVER"));
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		try {
			conn = DriverManager.getConnection(dbinfo.getProperty("DBURL"),
					                                               dbinfo.getProperty("DBUSER"),
					                                               dbinfo.getProperty("DBPWD"));
		} catch (SQLException e) {
			System.out.println("Not Connect.");
		}
		return conn;
	}
}
