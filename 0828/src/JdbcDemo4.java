import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args)  throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String [] idArray = {"aaa","bbb","ccc","ddd"};
		String [] nameArray = {"������", "��ȿ��", "���ƾ�", "������"};
		String sql = null;
		for(int i = 0 ; i < idArray.length ; i++) {
			sql = "INSERT INTO Member(id, name) ";
			sql += "VALUES ('"+idArray[i]+"', '"+nameArray[i]+"' )";
			stmt.addBatch(sql);//��� ������������ ~ (Batch)
		}
		int [] array = stmt.executeBatch();
		if(array.length == idArray.length) {
			System.out.println("Insert Success");
		}else {
			System.out.println("Insert Failure");
		}
		DBClose.close(conn);
	}
}
