import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//ResultSetMetaData 객체

public class JdbcDemo5 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM countrylanguage";
		//String sql = "SELECT CountryCode AS '국가코드' FROM countrylanguage"; 
								// 컬럼라벨 가져오기
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd =rs.getMetaData();
		int colCount = rsmd.getColumnCount();
		//System.out.println(colCount); //4
		for(int i = 1 ; i <= colCount ; i++) { //DB -> index 1부터
			System.out.println(rsmd.getColumnName(i)+
					" -- " + rsmd.getColumnLabel(i)+" --> " +
					rsmd.getColumnType(i) +", "+rsmd.getColumnTypeName(i)+
					" -- "+rsmd.getColumnDisplaySize(i)+", "+ //컬럼사이즈
					rsmd.getPrecision(i)+", " + //전체자리
					rsmd.getScale(i)); //소수점 이하자리
		}
		
		DBClose.close(conn);
	}
}
