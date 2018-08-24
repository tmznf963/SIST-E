import java.sql.SQLException;

import kr.co.sist.model.SeongjeokDAO;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			SeongjeokDAO.update();
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
