import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyModel extends DefaultTableModel {
	private Vector<Student> vector;
	
	public MyModel(Vector<Student> vector) {//생성자 == 초기화
		this.vector = vector;
		Vector<String> columVector = new Vector<String>(1,1);//1칸씩 증가치
		String [] array = {"학번","이름","국어","영어","수학","전산","총점","평균","평점"};
		for(String str : array) columVector.addElement(str);
		this.setDataVector(getMyDataVector(), columVector);
	}
	
	private Vector<Object> getMyDataVector(){
		Vector<Object> dataVector = new Vector<Object>(1,1);
		for(int i = 0 ; i < this.vector.size() ; i++) {
			Student s = this.vector.get(i);
			Vector<String> rowVector = new Vector<String>(1,1); //1층 쌓을 벡터
			rowVector.addElement(s.getHakbun());
			rowVector.addElement(s.getName());
			rowVector.addElement(""+s.getKor());//int를 String으로
			rowVector.addElement(String.valueOf(s.getEng()));//int를 String으로
			rowVector.addElement(String.valueOf(s.getMat()));
			rowVector.addElement(String.valueOf(s.getEdp()));
			rowVector.addElement(String.valueOf(s.getSum()));
			rowVector.addElement(String.valueOf(s.getAvg()));
			rowVector.addElement(String.valueOf(s.getGrade()));//(열 벡터)
			dataVector.addElement(rowVector);//완성된 1줄을 Vector에 넣는다.(행 벡터)
		}
		return dataVector;
	}
}
