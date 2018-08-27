package kr.co.sist.libs.control;

import java.sql.SQLException;

import kr.co.sist.libs.model.SeongJeokDAO;
import kr.co.sist.libs.model.StudentVO;

public class InputControl {
	public static int insert(StudentVO s) {
		int row = 0 ;
		try {
			row = SeongJeokDAO.insert(s);
		}catch(SQLException e) {
			System.out.println(e);
		}
		return row;
	}
}
