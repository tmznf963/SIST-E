import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SPDemo {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Name : ");
		String irum = scan.nextLine();
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = conn.prepareCall("{call sp_test(?)}");
		cstmt.setString(1, irum);
		cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
		
		cstmt.executeUpdate();   //이유여하를 불문하고 executeUpdate()다.
		
		String greeting = cstmt.getString(1);
		System.out.println(greeting);
		
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}
/*
CREATE OR REPLACE PROCEDURE sp_test
(
    t_str      IN OUT      VARCHAR2
)
IS
BEGIN
    t_str := 'Hello, ' || t_str || '님! 좋은 아침입니다';
END;
*/