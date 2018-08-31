package kr.co.sist.libs.control;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kr.co.sist.libs.model.MyModel;


public class Output extends JPanel{
	private Vector<EmpVO> vector; 
	private JButton btnSave;
	private JScrollPane scroll;
	private JTable table;
	
	public Output() {
		this.table = new JTable();
		this.scroll = new JScrollPane(this.table);
		this.output();
	}
	public void refresh() {
		output();
	}
	private void output() {
		this.setLayout(new BorderLayout());
		this.table.setModel(new MyModel());
		this.add("Center", this.scroll);
		this.add("North", getNorth());
	}
	private JPanel getNorth() {
		JPanel panel = new JPanel();
		panel.add(this.btnSave = new JButton("Refresh"));
		return panel;
	}
}



