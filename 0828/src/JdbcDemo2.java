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
		pstmt.setString(1, "1107");   pstmt.setString(2, "�ѾƸ�");
		pstmt.setInt(3, 68);  /*����*/ pstmt.setInt(4, 67);   /*����*/ 
		pstmt.setInt(5, 83); /*����*/  pstmt.setInt(6, 89);   /*����*/
		
		int row = pstmt.executeUpdate();
		if(row == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		if(pstmt != null) pstmt.close();
		DBClose.close(conn);
	}
}
