package kr.co.sist.control;
//package kr.co.sist.libs.model;
import java.sql.Connection;
import java.sql.SQLException;
public class DBClose {
	public static void close(Connection conn) {
		try {                                   //예외처리
			if(conn != null) conn.close();  //커넥션 null아니면 닫음
		} catch (SQLException e) {
			e.printStackTrace();            //stack에 에러가 발생한 메소드의 호출 기록 출력
		}
	}
}