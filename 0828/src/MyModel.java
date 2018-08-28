import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyModel extends DefaultTableModel {
	private String key;
	public MyModel(String key) {
		this.key = key;
		Vector<String> columnVector = new Vector<String>(1,1);//하나에 하나씩 증가
		String[] array = {"우편번호","시/도","구/군","읍/면/동","번지"};
		for(String str : array) {
			columnVector.addElement(str);
		}
		this.setDataVector(getZipcodeData(), columnVector);
		
	}
	
	private Vector<Object> getZipcodeData(){
		Vector<Object> dataVector = new Vector<Object>(1,1);
		Vector<ZipSearchVO> vector = null;
		
		if(this.key==null) vector = SelectController.selectAll();
		else vector = SelectController.select(this.key);
		
		for(int i = 0 ; i < vector.size() ; i++) {
			ZipSearchVO zip = vector.get(i);//get사용 == 얻어오기
			Vector<String> rowVector = new Vector<String>(5); //DB 컬럼이 5개라서.
			rowVector.addElement(zip.getZipcode());
			rowVector.addElement(zip.getSido());
			rowVector.addElement(zip.getGugun());
			rowVector.addElement(zip.getDong());
			rowVector.addElement(zip.getBunji());
			dataVector.addElement(rowVector);
		}
		//System.out.println(vector.size());
		return dataVector;
	}
}
