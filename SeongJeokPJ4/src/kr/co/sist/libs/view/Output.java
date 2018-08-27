package kr.co.sist.libs.view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kr.co.sist.libs.control.SelectControl;
import kr.co.sist.libs.model.MyModel;
import kr.co.sist.libs.model.StudentVO;

public class Output extends JPanel{
	private Vector<StudentVO> vector; 
	private JButton btnSort, btnSave;
	private JScrollPane scroll;
	private JTable table;
	
	public Output() {
		this.table = new JTable();
		this.scroll = new JScrollPane(this.table);
		this.output();//그리는 애 호출
	}
	public void refresh() {//새로 그리는 메소드 vector == 입력받은 학생의 데이터
		output();
	}
	private void output() {//그리는 애
		this.setLayout(new BorderLayout());
		this.table.setModel(new MyModel());//그림을 그릴 때.
		this.add("Center", this.scroll);
		this.add("North", getNorth());
	}
	private JPanel getNorth() {
		JPanel panel = new JPanel();
		panel.add(this.btnSave = new JButton("저장하기"));
		//this.btnSave.addActionListener(new MyAction(this.vector, this));
		return panel;
	}
}



