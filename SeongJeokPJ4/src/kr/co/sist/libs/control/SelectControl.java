package kr.co.sist.libs.control;

import java.sql.SQLException;
import java.util.Vector;

import kr.co.sist.libs.model.SeongJeokDAO;
import kr.co.sist.libs.model.StudentVO;

public class SelectControl {//컨트롤러는 DAO만 접근.
	public static Vector<StudentVO> selectAll(){
		Vector<StudentVO> vector = null;
		try {
			vector = SeongJeokDAO.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vector;
	}
}
