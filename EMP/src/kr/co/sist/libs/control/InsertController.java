package kr.co.sist.libs.control;

import java.sql.SQLException;

import kr.co.sist.libs.model.EmployeeDAO;
import kr.co.sist.libs.model.EmployeeVO;

public class InsertController {
	public static int insert(EmployeeVO emp) {
		int row = 0;
		try {
			row = EmployeeDAO.insert(emp);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return row;
	}
}
