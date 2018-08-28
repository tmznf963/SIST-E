import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo2 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
//		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO Student(hakbun,name,kor,eng,mat,edp) ";
		sql += "VALUES(?,?,?,?,?,?) ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "1107");   pstmt.setString(2, "한아름");
		pstmt.setInt(3, 68);  /*국어*/ pstmt.setInt(4, 67);   /*영어*/ 
		pstmt.setInt(5, 83); /*수학*/  pstmt.setInt(6, 89);   /*전산*/
		
		int row = pstmt.executeUpdate();
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
	}
}
