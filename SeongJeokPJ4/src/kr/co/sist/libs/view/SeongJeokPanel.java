package kr.co.sist.libs.view;
import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import kr.co.sist.libs.model.StudentVO;

public class SeongJeokPanel extends JPanel{
	private JTabbedPane tab;
	private Vector<StudentVO> vector;
	
	public SeongJeokPanel() {   //Constructor
		this.tab = new JTabbedPane(JTabbedPane.TOP);
		this.vector = new Vector<StudentVO>(1,1);
		this.display();
	}
	private void display() {
		Output output = new Output();
		this.tab.add("입력", new Input(this.tab, output));
		this.tab.add("출력", output);
		this.setLayout(new BorderLayout());
		this.add(this.tab);
	}
}
