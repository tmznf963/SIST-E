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
			 sb.append("where name='"+country+"'  ");//Ȭ�ֽ�Ȭ '"++"'  "
			 //select --> ResultSet --> executeQuery(); �ʿ�
			 rs = stmt.executeQuery(sb.toString());
			 if(!rs.next()) {//���� ���ڵ尡 ���ٸ�
				 System.out.println("���ǿ� �´� ����� ã�� �� �����ϴ�.");
			 }else {//���� ���ڵ尡 �ִٸ�
				 do {
					 String code = rs.getString(1);	//index ��ȣ //DB type = CHAR
					 String name = rs.getString("name");	//�÷� �� 
					 int population = rs.getInt("population");//DB type = INT
					 double gnp = rs.getDouble(4);//DB type = FLOAT
					 System.out.printf("%s , %s , %,d , %.1f",code,name,population,gnp);
				 }while(rs.next()); //�����ݷ� �ʼ�
			 }
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		
		
		DBClose.close(conn); // DB �ݱ�
	}
}
