package kr.co.sist.control;
//package kr.co.sist.libs.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBConnection {
	private Properties info;
	public DBConnection() {   //데이터베이스 커넥션을 오픈한다
		this.info = new Properties();
		try {
			InputStream is = new FileInputStream(new File("./dbinfo.properties"));
			info.load(is);
		}catch(IOException ex) { ex.printStackTrace(); }
	}
	public Connection getConnection() {
		Connection conn = null;//커넥션클래스는 자바코드내에서 데이터베이스를담당하는클래스
		try {//forname 메서드를쓰는순간 try 문안에 넣어줘야한다
			Class.forName(this.info.getProperty("DBDRIVER"));  //드라이버 로딩,외부에서작성된 클래스를 사용할때
			conn = DriverManager.getConnection(this.info.getProperty("DBURL"),// 드라이버 연결,데이터베이스 접속 커넥션을 얻음
					this.info.getProperty("DBUSER"),	 this.info.getProperty("DBPWD"));  //DB접속 패스워드
		}catch(ClassNotFoundException ex) {  //클래스 이름 잘못됐을때 예외처리
			ex.printStackTrace();
		}catch(SQLException ex) {            //sql문 잘못 됐을 때 예외처리
			ex.printStackTrace();//예외의 스택 트레이스를 System.err 에 출력
		}
		return conn;                     //커넥션 리턴
	}}

//211.238.142.147


