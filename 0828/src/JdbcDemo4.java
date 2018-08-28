import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args)  throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String [] idArray = {"aaa","bbb","ccc","ddd"};
		String [] nameArray = {"한지민", "이효리", "나훈아", "조용필"};
		String sql = null;
		for(int i = 0 ; i < idArray.length ; i++) {
			sql = "INSERT INTO Member(id, name) ";
			sql += "VALUES ('"+idArray[i]+"', '"+nameArray[i]+"' )";
			stmt.addBatch(sql);//계속 누적누적누적 ~ (Batch)
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
