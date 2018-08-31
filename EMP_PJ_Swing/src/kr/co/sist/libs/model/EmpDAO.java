package kr.co.sist.libs.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import kr.co.sist.libs.control.EmpVO;

public class EmpDAO {
	public static int insert(EmpVO e) throws SQLException{
		Connection conn = DBConnection.getConnection();
		if(conn.isClosed()) System.out.println("Connection is closed");
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO emp VALUES('" + e.getE_code();
					sql += "','" + e.getE_name() + "'," + e.getD_name() + "," + e.getB_sal();
					sql += "," + e.getG_s() + "," + e.getF_s() + "," + e.getN_s();
					sql += "," + e.getSum() + ",'" + e.getR_m() + "') ";
		int row = stmt.executeUpdate(sql);
		if(stmt != null) stmt.close();
		DBClose.close(conn);
		return 1;
	}
	public static Vector<EmpVO> selectAll() throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT * FROM emp ORDER BY e_code ASC";
									
		ResultSet rs = stmt.executeQuery(sql);
		Vector<EmpVO> vector = new Vector<EmpVO>(1,1);
		if(!rs.next()) { 
			vector = null; 
		}else {
			do {
				EmpVO e = new EmpVO(rs.getString("e_code"),
						rs.getString("e_name"), rs.getInt("b_sal"), 
						rs.getInt("n_t"), rs.getInt("fam"));
				e.setD_name(rs.getString("d_name"));  e.setG_s(rs.getInt("g_s"));
				e.setF_s(rs.getInt("f_s"));  e.setN_s(rs.getInt("n_s"));
				e.setSum(rs.getInt("sum"));  e.setR_m(rs.getInt("r_m"));
				vector.addElement(e);
			}while(rs.next());
		}
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		DBClose.close(conn);
		return vector;
	}
}

