package kr.co.sist.libs.control;

import java.sql.SQLException;

import kr.co.sist.libs.model.EmpDAO;

public class InputControl {
	public static int insert(EmpVO e) {
		int row = 0;	
		try {
			row =EmpDAO.insert(e);
			}catch(SQLException ex) {
				System.out.println(ex);
			}
		return row;
	}

}
