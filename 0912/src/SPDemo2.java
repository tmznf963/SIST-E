import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import oracle.jdbc.OracleTypes;

public class SPDemo2 {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
				
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = conn.prepareCall("{call sp_test(?)}");
		
		cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
		cstmt.executeUpdate();  //�ſ� �߿���.
		String outStr = cstmt.getString(1);
		System.out.println("Out �Ű������� �� = " + outStr);
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}

/*
CREATE OR REPLACE PROCEDURE sp_test
(
        v_str          OUT       VARCHAR2
)
IS
BEGIN
        v_str := '�̰��� out �Ű������� ���Դϴ�';
END;
 */

