package kr.co.sist.libs.model;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import kr.co.sist.libs.control.EmpVO;
import kr.co.sist.libs.control.SelectControl;


public class MyModel extends DefaultTableModel {
	public MyModel() {
		Vector<String> columnVector = new Vector<String>(1,1);
		String [] array = {"�����ȣ", "����̸�", "�μ���", "�⺻��", "ȣ�޼���", "��������", "�߰�����", "�ѱݾ�", "�Ǽ��ɾ�"};
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
			rowVector.addElement(e.getE_code()); //�����ȣ
			rowVector.addElement(e.getE_name()); //����̸�
			rowVector.addElement(e.getD_name()); //�μ���
			rowVector.addElement(String.valueOf(e.getB_sal())); //�⺻��
			rowVector.addElement(String.valueOf(e.getG_s())); //ȣ�޼���
			rowVector.addElement(String.valueOf(e.getF_s())); //��������
			rowVector.addElement(String.valueOf(e.getN_s())); //�߰�����
			rowVector.addElement(String.valueOf(e.getSum())); //�ѱݾ�
			rowVector.addElement(String.valueOf(e.getR_m())); //�Ǽ��ɾ�
			dataVector.addElement(rowVector);
		}
		
		return dataVector;
	}
}
