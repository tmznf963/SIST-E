
//1. import 한다
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		//2. JDBC MySQL Driver loading
		try {
			Class.forName("org.mariadb.jdbc.Driver");//Driver.class
			System.out.println("Success...");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found....");
		}
		//3. Database Connection
		Connection conn = null; //interface == new 못 씀
		String url = "jdbc:mariadb://localhost:3306/world";
		try {
			conn = DriverManager.getConnection(url, "root", "javamaria");// url, user, password
			System.out.println("Connection Success.");
		} catch (SQLException e) {
			System.out.println("Not Connect.");
		}
		//4. Statement 객체 생성
		Statement stmt = null; //interface == new 못 씀
		try {
			stmt = conn.createStatement();			
		}catch(SQLException e) {
			System.out.println(e);
		}
		//5. SQL 문장 실행하기
		String sql = "SELECT * FROM city WHERE countrycode = 'KOR'";
		ResultSet rs = null;
		try {			
			rs = stmt.executeQuery(sql);
			//6. ResultSet 결과 보기
			while(rs.next()){//다음 레코드가 더 이상 없을 때 까지.
				String name = rs.getString("name");
				int population = rs.getInt(5);//index 번호 == 5번째
				System.out.printf("name = %s    population = %d \n",name,population);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}//
}//
