
//1. import �Ѵ�
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
		Connection conn = null; //interface == new �� ��
		String url = "jdbc:mariadb://localhost:3306/world";
		try {
			conn = DriverManager.getConnection(url, "root", "javamaria");// url, user, password
			System.out.println("Connection Success.");
		} catch (SQLException e) {
			System.out.println("Not Connect.");
		}
		//4. Statement ��ü ����
		Statement stmt = null; //interface == new �� ��
		try {
			stmt = conn.createStatement();			
		}catch(SQLException e) {
			System.out.println(e);
		}
		//5. SQL ���� �����ϱ�
		String sql = "SELECT * FROM city WHERE countrycode = 'KOR'";
		ResultSet rs = null;
		try {			
			rs = stmt.executeQuery(sql);
			//6. ResultSet ��� ����
			while(rs.next()){//���� ���ڵ尡 �� �̻� ���� �� ����.
				String name = rs.getString("name");
				int population = rs.getInt(5);//index ��ȣ == 5��°
				System.out.printf("name = %s    population = %d \n",name,population);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}//
}//
