import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection conn = DBConnection.getInstance();
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Country : ");
		String country = scan.nextLine();
		try {
			 stmt = conn.createStatement();
			 StringBuffer sb = new StringBuffer("");
			 sb.append("select code, name, population , gnp   "); 
			 sb.append("from country   ");
			 sb.append("where name='"+country+"'  ");//홑쌍쌍홑 '"++"'  "
			 //select --> ResultSet --> executeQuery(); 필요
			 rs = stmt.executeQuery(sb.toString());
			 if(!rs.next()) {//다음 레코드가 없다면
				 System.out.println("조건에 맞는 결과를 찾을 수 없습니다.");
			 }else {//다음 레코드가 있다면
				 do {
					 String code = rs.getString(1);	//index 번호 //DB type = CHAR
					 String name = rs.getString("name");	//컬럼 명 
					 int population = rs.getInt("population");//DB type = INT
					 double gnp = rs.getDouble(4);//DB type = FLOAT
					 System.out.printf("%s , %s , %,d , %.1f",code,name,population,gnp);
				 }while(rs.next()); //세미콜론 필수
			 }
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		
		
		DBClose.close(conn); // DB 닫기
	}
}
