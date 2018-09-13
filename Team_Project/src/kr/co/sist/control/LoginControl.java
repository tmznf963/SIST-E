package kr.co.sist.control;

import java.sql.SQLException;
import java.util.Vector;

import kr.co.sist.model.EmpDAO;
import kr.co.sist.model.EmpVO;

public class LoginControl {
	public static Vector<EmpVO> emplogin() {   
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.emplogin();;        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
}
