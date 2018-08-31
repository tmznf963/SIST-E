package kr.co.sist.libs.model;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import kr.co.sist.libs.control.EmpVO;
import kr.co.sist.libs.control.SelectControl;


public class MyModel extends DefaultTableModel {
	public MyModel() {
		Vector<String> columnVector = new Vector<String>(1,1);
		String [] array = {"사원번호", "사원이름", "부서명", "기본급", "호급수당", "가족수당", "야간수당", "총금액", "실수령액"};
		for(String str : array) columnVector.addElement(str);
		this.setDataVector(getMyDataVector(), columnVector); 
	}
	private Vector <Object>getMyDataVector(){
		Vector <EmpVO> vector = SelectControl.selectAll();
		Vector<Object>dataVector = new Vector<Object>(1,1);
		if(vector == null) dataVector = null; 
		for(int i = 0 ; i <vector.size(); i++) {
			EmpVO e = vector.get(i);
			Vector<String>rowVector = new Vector<String>(1,1); 
			rowVector.addElement(e.getE_code()); //사원번호
			rowVector.addElement(e.getE_name()); //사원이름
			rowVector.addElement(e.getD_name()); //부서명
			rowVector.addElement(String.valueOf(e.getB_sal())); //기본급
			rowVector.addElement(String.valueOf(e.getG_s())); //호급수당
			rowVector.addElement(String.valueOf(e.getF_s())); //가족수당
			rowVector.addElement(String.valueOf(e.getN_s())); //야간수당
			rowVector.addElement(String.valueOf(e.getSum())); //총금액
			rowVector.addElement(String.valueOf(e.getR_m())); //실수령액
			dataVector.addElement(rowVector);
		}
		
		return dataVector;
	}
}
