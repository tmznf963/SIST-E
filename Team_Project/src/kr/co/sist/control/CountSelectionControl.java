package kr.co.sist.control;

import java.sql.SQLException;
import java.util.Vector;

import kr.co.sist.model.EmpDAO;
import kr.co.sist.model.EmpVO;

public class CountSelectionControl {
	public static Vector<EmpVO> getcountSales() {    //영업부
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.getcountSales();        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
	public static Vector<EmpVO> getcountHumanResources() {    //인사부
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.getcountHumanResources();        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
	public static Vector<EmpVO> getcountPublicRelations() {    //홍보부
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.getcountPublicRelations();        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
	public static Vector<EmpVO> getcountGeneralAffairs() {    //총무부
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.getcountGeneralAffairs();        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
	public static Vector<EmpVO> getcountResearch() {    //연구부
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.getcountResearch();        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
	public static Vector<EmpVO> getcountProduction() {    //생산부
		Vector<EmpVO> log = null;
		try {
			log = EmpDAO.getcountProduction();        
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return log;     
	}
}
