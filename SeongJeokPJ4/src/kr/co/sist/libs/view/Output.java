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
		this.output();//�׸��� �� ȣ��
	}
	public void refresh() {//���� �׸��� �޼ҵ� vector == �Է¹��� �л��� ������
		output();
	}
	private void output() {//�׸��� ��
		this.setLayout(new BorderLayout());
		this.table.setModel(new MyModel());//�׸��� �׸� ��.
		this.add("Center", this.scroll);
		this.add("North", getNorth());
	}
	private JPanel getNorth() {
		JPanel panel = new JPanel();
		panel.add(this.btnSave = new JButton("�����ϱ�"));
		//this.btnSave.addActionListener(new MyAction(this.vector, this));
		return panel;
	}
}



