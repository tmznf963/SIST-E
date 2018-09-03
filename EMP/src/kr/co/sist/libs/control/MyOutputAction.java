package kr.co.sist.libs.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import kr.co.sist.libs.model.MyTableModel;

public class MyOutputAction implements ActionListener {
	private JTable table;
	public MyOutputAction(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Display")){
			TableModel tm = new MyTableModel();
			this.table.setModel(tm);
		}
	}
}








