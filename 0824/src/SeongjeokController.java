import java.sql.SQLException;

import kr.co.sist.model.SeongjeokDAO;
import kr.co.sist.model.StudentDTO;

public class SeongjeokController {
	public static void insert(StudentDTO s) {
		try {
			SeongjeokDAO.insert(s);			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
