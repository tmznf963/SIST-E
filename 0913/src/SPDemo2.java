import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SPDemo2 {
	private static final String URL="jdbc:oracle:thin:@211.238.142.147:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = 
				conn.prepareCall("{call sp_emp_dept_select(?)}");
		
		cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		
		cstmt.executeUpdate();    //이유여하를 불문하고 무조건 executeUpdate() 사용할 것.
		Object obj = cstmt.getObject(1);
		ResultSet rs = (ResultSet)obj;
		System.out.println("사번     이름     부서명     부서위치");
		System.out.println("-----------------------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " +
		                                rs.getString(3) + ", " + rs.getString(4));
		}
		
		if(rs != null)  rs.close();
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}
/*
CREATE OR REPLACE PROCEDURE sp_emp_dept_select
(
    p_resultset       OUT       SYS_REFCURSOR
)
IS
BEGIN
     OPEN p_resultset FOR
        SELECT  empno, ename, dname, loc
        FROM   emp NATURAL JOIN dept;  
END;
*/