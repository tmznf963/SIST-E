package kr.co.sist.control;

import java.sql.SQLException;

import kr.co.sist.model.EmpDAO;
import kr.co.sist.model.EmpVO;

public class InsertControl {
	public static int insertinfo(EmpVO e) {//사원입력
		int log = 0;
		try {
			log = EmpDAO.insert(e);        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
}
