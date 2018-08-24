import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyModel extends DefaultTableModel {
	private Vector<Student> vector;
	
	public MyModel(Vector<Student> vector) {//������ == �ʱ�ȭ
		this.vector = vector;
		Vector<String> columVector = new Vector<String>(1,1);//1ĭ�� ����ġ
		String [] array = {"�й�","�̸�","����","����","����","����","����","���","����"};
		for(String str : array) columVector.addElement(str);
		this.setDataVector(getMyDataVector(), columVector);
	}
	
	private Vector<Object> getMyDataVector(){
		Vector<Object> dataVector = new Vector<Object>(1,1);
		for(int i = 0 ; i < this.vector.size() ; i++) {
			Student s = this.vector.get(i);
			Vector<String> rowVector = new Vector<String>(1,1); //1�� ���� ����
			rowVector.addElement(s.getHakbun());
			rowVector.addElement(s.getName());
			rowVector.addElement(""+s.getKor());//int�� String����
			rowVector.addElement(String.valueOf(s.getEng()));//int�� String����
			rowVector.addElement(String.valueOf(s.getMat()));
			rowVector.addElement(String.valueOf(s.getEdp()));
			rowVector.addElement(String.valueOf(s.getSum()));
			rowVector.addElement(String.valueOf(s.getAvg()));
			rowVector.addElement(String.valueOf(s.getGrade()));//(�� ����)
			dataVector.addElement(rowVector);//�ϼ��� 1���� Vector�� �ִ´�.(�� ����)
		}
		return dataVector;
	}
}
