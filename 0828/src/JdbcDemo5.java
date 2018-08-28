import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//ResultSetMetaData ��ü

public class JdbcDemo5 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM countrylanguage";
		//String sql = "SELECT CountryCode AS '�����ڵ�' FROM countrylanguage"; 
								// �÷��� ��������
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd =rs.getMetaData();
		int colCount = rsmd.getColumnCount();
		//System.out.println(colCount); //4
		for(int i = 1 ; i <= colCount ; i++) { //DB -> index 1����
			System.out.println(rsmd.getColumnName(i)+
					" -- " + rsmd.getColumnLabel(i)+" --> " +
					rsmd.getColumnType(i) +", "+rsmd.getColumnTypeName(i)+
					" -- "+rsmd.getColumnDisplaySize(i)+", "+ //�÷�������
					rsmd.getPrecision(i)+", " + //��ü�ڸ�
					rsmd.getScale(i)); //�Ҽ��� �����ڸ�
		}
		
		DBClose.close(conn);
	}
}
