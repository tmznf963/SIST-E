package kr.co.sist.libs.control;

import java.sql.SQLException;
import java.util.Vector;

import kr.co.sist.libs.model.EmpDAO;

public class SelectControl {
	public static Vector<EmpVO>selectAll(){
		Vector <EmpVO> vector = null;
		try {
		vector =EmpDAO.selectAll();
		}catch(SQLException e) {
			System.out.println(e);
		}
		return vector;
	}

}
