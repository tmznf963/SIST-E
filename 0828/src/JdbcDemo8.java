import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo8 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Scanner scan = new Scanner(System.in);
		conn.setAutoCommit(false);//�ڵ� Ŀ�� ����. == DB�� �ݿ� �ȵ�.
		
		String sql = "INSERT INTO Member VALUES(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("ID : "); String id = scan.nextLine();
		System.out.println("Name : "); String name = scan.nextLine();
		System.out.println("Age : "); int age = scan.nextInt();
		
		pstmt.setString(1,  id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		int row = pstmt.executeUpdate();
		if(row ==1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
		
		conn.commit();
		DBClose.close(conn);
	}
}

/*try {
			conn.setAutoCommit(false);//�ڵ� Ŀ�� ����.
			conn.commit();
		} catch (SQLException e) {
			System.out.println(e);
			try {
				conn.rollback();//�ѹ�
			} catch (SQLException e1) {
				System.out.println(e1);
			}
		}*/