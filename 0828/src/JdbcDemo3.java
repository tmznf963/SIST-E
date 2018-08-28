import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo3 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql = " { call insertStudent(?,?,?,?,?,?) }";
		
		CallableStatement cstmt = conn.prepareCall(sql);
		cstmt.setString(1, "1109");   cstmt.setString(2, "������");
		cstmt.setInt(3, 88);  /*����*/ cstmt.setInt(4, 99);   /*����*/ 
		cstmt.setInt(5, 53); /*����*/  cstmt.setInt(6, 75);   /*����*/
		
		int row = cstmt.executeUpdate();
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		if(cstmt != null) cstmt.close();
		DBClose.close(conn);
	}
}
