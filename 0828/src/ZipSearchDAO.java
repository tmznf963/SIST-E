import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ZipSearchDAO {
	public static Vector<ZipSearchVO> selectAll() throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM zipcode");
		
		Vector<ZipSearchVO> vector = new Vector<ZipSearchVO>(1,1);
		while(rs.next()) {
			ZipSearchVO zip = new ZipSearchVO(rs.getString("zipcode"),rs.getString("sido"),
					rs.getString("gugun"),rs.getString("dong"),rs.getString("bunji"));
			vector.addElement(zip);
		}
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
	
	public static Vector<ZipSearchVO> select(String key) throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM zipcode WHERE "
				+ "dong LIKE '%"+key+"%'";
		ResultSet rs = stmt.executeQuery(sql);
		
		Vector<ZipSearchVO> vector = new Vector<ZipSearchVO>(1,1);
		while(rs.next()) {
			ZipSearchVO zip = new ZipSearchVO(rs.getString("zipcode"),rs.getString("sido"),
					rs.getString("gugun"),rs.getString("dong"),rs.getString("bunji"));
			vector.addElement(zip);
		}
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
}
