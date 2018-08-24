package kr.co.sist.view;
import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kr.co.sist.control.MyAction;
import kr.co.sist.model.MyModel;
import kr.co.sist.model.Student;

public class Output extends JPanel{
	private Vector<Student> vector; 
	private JButton btnCalc, btnSort, btnSave;
	private JScrollPane scroll;
	private JTable table;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
		this.table = new JTable();
		this.scroll = new JScrollPane(this.table);
		this.output();//�׸��� ��
	}
	public void refresh(Vector<Student> vector) {//���� �׸��� �޼ҵ� vector == �Է¹��� �л��� ������
		this.vector = vector;
		output();
	}
	private void output() {//�׸��� ��
		this.setLayout(new BorderLayout());
		this.table.setModel(new MyModel(this.vector));//�׸��� �׸� ��.
		this.add("Center", this.scroll);
		this.add("North", getNorth());
	}
	private JPanel getNorth() {
		JPanel panel = new JPanel();
		panel.add(this.btnCalc = new JButton("����ϱ�"));
		this.btnCalc.addActionListener(new MyAction(this.vector, this));//��꺤��, �ƿ�ǲ�ּ�
		panel.add(this.btnSort = new JButton("�����ϱ�"));
		this.btnSort.addActionListener(new MyAction(this.vector, this));
		panel.add(this.btnSave = new JButton("�����ϱ�"));
		this.btnSave.addActionListener(new MyAction(this.vector, this));
		return panel;
	}
}



