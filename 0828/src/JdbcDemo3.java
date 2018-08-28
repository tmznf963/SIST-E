import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo3 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql = " { call insertStudent(?,?,?,?,?,?) }";
		
		CallableStatement cstmt = conn.prepareCall(sql);
		cstmt.setString(1, "1109");   cstmt.setString(2, "더노피");
		cstmt.setInt(3, 88);  /*국어*/ cstmt.setInt(4, 99);   /*영어*/ 
		cstmt.setInt(5, 53); /*수학*/  cstmt.setInt(6, 75);   /*전산*/
		
		int row = cstmt.executeUpdate();
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		if(cstmt != null) cstmt.close();
		DBClose.close(conn);
	}
}
