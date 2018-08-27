package kr.co.sist.libs.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class SeongJeokDAO {
	
	public static int insert(StudentVO s) throws SQLException{
		Connection conn = DBConnection.getConnection();//열어
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO Student "
				+ " VALUES ('"+s.getHakbun()+"','"+s.getName()+"',"+s.getKor()+","+s.getEng()+","+s.getMat()+","+s.getEdp()+","+s.getSum()+","+s.getAvg()+
				",'"+s.getGrade()+"') ";
		
		System.out.println(sql);
		//int row = stmt.executeUpdate(sql);//insert == Update //DB삽입
		if(stmt != null) stmt.close();
		DBClose.close(conn);//닫아
		return 1;
	}
	
	//selectOne(){}
	
	public static Vector <StudentVO> selectAll() throws SQLException{//모든 학생
		Connection conn = DBConnection.getConnection();//열어
		Statement stmt = conn.createStatement();
		String sql = " SELECT * FROM Student";
		ResultSet rs = stmt.executeQuery(sql);
		Vector<StudentVO> vector = new Vector<StudentVO>(1,1);
		if(!rs.next()) {//학생이 없다면.
			vector = null;
		}else {//학생이 있다면.	
			do {
				StudentVO s = new StudentVO(rs.getString("hakbun"),rs.getString("name"),rs.getInt("kor"),rs.getInt("eng"),rs.getInt("mat"),rs.getInt("edp"));
				s.setSum(rs.getInt("sum"));
				s.setAvg(rs.getDouble("avg"));
				s.setGrade(rs.getString("grade").charAt(0));//0번째 인덱스 String --> char
				vector.addElement(s);
			}while(rs.next());
		}
		
		if( rs != null) rs.close();
		if(stmt != null) stmt.close();
		DBClose.close(conn);//닫아
		
		return vector;//벡터형 리턴
	}
}
