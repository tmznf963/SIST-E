package kr.co.sist.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeongjeokDAO {//MVC패턴
	public static void insert(StudentDTO std) throws SQLException{
		Connection conn = DBConnection.getInstance();
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO Student "
						  + "VALUES ('"+std.getHakbun()+"', '"+std.getName()+"',"
						  		+ ""+std.getKor()+","+std.getEng()+","+std.getMat()+","+std.getEdp()+","+std.getSum()+","+std.getAvg()+", '"+std.getGrade()+"')";
		//System.out.println(sql);
		stmt.executeUpdate(sql);
		System.out.println("Insert Success");
		if(stmt != null) stmt.close();
		DBClose.close(conn);
	}
	public static void delete() throws SQLException{
		Connection conn = DBConnection.getInstance();
		Statement stmt = conn.createStatement();
		String sql = "DELETE FROM Student    ";
						  //+ "WHERE  hakbun = '1101'";
		stmt.executeUpdate(sql);
		System.out.println("Delete Success");
		
		if(stmt != null) stmt.close();
		DBClose.close(conn);
	}
	public static void update() throws SQLException{
		Connection conn = DBConnection.getInstance();
		Statement stmt = conn.createStatement();
		String [] array = {"1103","1104","1105","1106"};
		String sql = null;
		ResultSet rs = null;
			for(int i = 0 ; i < array.length ; i ++) {
				sql = "SELECT kor, eng, mat , edp  "
								  + "FROM Student  "
								  + "WHERE hakbun = '"+array[i]+"'  ";
				rs = stmt.executeQuery(sql);
				rs.next();//DB 한 줄 읽기
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt(3);//index는 1부터 시작
				int edp = rs.getInt(4);
				int sum = getSum(kor, eng, mat, edp);//static은 static 끼리
				double avg = getAvg(sum);
				sql = "UPDATE Student  "
					  + "SET sum ="+sum+", avg ="+avg+"  "
					  + "WHERE hakbun = '"+array[i]+"' ";
				stmt.executeUpdate(sql);
				System.out.println("Update Success");
			}
			
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		
		DBClose.close(conn);
	}
	private static double getAvg(int sum) {
		return sum / 4. ;
	}
	private static int getSum(int kor, int eng , int mat, int edp) {
		return kor + eng + mat + edp;
	}
}
