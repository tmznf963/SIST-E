package kr.co.sist.control;

import java.sql.SQLException;
import java.util.Vector;

import kr.co.sist.model.EmpDAO;
import kr.co.sist.model.EmpVO;

public class GetTreeControl {
	public static Vector<EmpVO> getTree() {   
		Vector<EmpVO> tree = null;
		try {
			tree = EmpDAO.getTree();;        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return tree;     
	}
	public static Vector<EmpVO> getinfo(String no) {   
		Vector<EmpVO> info = null;
		try {
			info = EmpDAO.getinfo(no);;        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return info;     
	}
	public static Vector<EmpVO> getsalinfo(String no) {   
		Vector<EmpVO> info = null;
		try {
			info = EmpDAO.getsalinfo(no);;        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return info;     
	}
	public static Vector<EmpVO> getnightinfo(String no) {    
		Vector<EmpVO> info = null;
		try {
			info = EmpDAO.getnightinfo(no);;        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return info;     
	}
}
