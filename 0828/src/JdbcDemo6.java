import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Scrollable Statement
public class JdbcDemo6 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement(
														ResultSet.TYPE_SCROLL_INSENSITIVE,
														ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
		/*rs.afterLast();//������ ĭ���� ������
		while(rs.previous()) {//�Ųܷ� �ö�
			System.out.println(rs.getString("hakbun"));			
		}*/
		rs.first();//ó�� ĭ���� �̵�
		System.out.println(rs.getString("hakbun"));
		rs.last();//������ ĭ
		System.out.println(rs.getString("hakbun"));
		rs.absolute(3); //3��° �� ��
		System.out.println(rs.getString("hakbun"));
		rs.relative(-1);//���� Ŀ�� -1��°
		System.out.println(rs.getString("hakbun"));
		
		DBClose.close(conn);
	}
}
