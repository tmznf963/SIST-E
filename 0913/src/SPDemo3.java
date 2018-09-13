import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SPDemo3 {
	private static final String URL="jdbc:oracle:thin:@192.168.56.3:1521:orcl";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER="scott";
	private static final String PASSWD = "tiger";
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾고자 하시는 읍/면/동 : ");
		String keyword = scan.nextLine();
		
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
		CallableStatement cstmt = 
				conn.prepareCall("{call sp_zipcode_select(?, ?)}");
		
		cstmt.setString(1, keyword);
		cstmt.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
		
		cstmt.executeUpdate();    //이유여하를 불문하고 무조건 executeUpdate() 사용할 것.
		
		ResultSet rs = (ResultSet)cstmt.getObject(2);
		
		while(rs.next()) {
			System.out.println("(" + rs.getString(1) + ") " + rs.getString(2) + " " +
		                                rs.getString(3) + " " + rs.getString(4) + " " + 
					                    rs.getString(5));
		}
		
		if(rs != null)  rs.close();
		if(cstmt != null) cstmt.close();
		if(conn != null) conn.close();
	}
}
/*
CREATE OR REPLACE PROCEDURE sp_zipcode_select
(
    v_keyword         IN        VARCHAR2,
    v_resultset         OUT     SYS_REFCURSOR
)
AS
BEGIN
    OPEN v_resultset  FOR
        SELECT zipcode, sido, gugun, dong, bunji
        FROM zipcode
        WHERE dong LIKE CONCAT(CONCAT('%', v_keyword), '%');
END;
*/