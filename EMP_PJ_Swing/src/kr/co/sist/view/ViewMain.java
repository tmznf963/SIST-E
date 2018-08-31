package kr.co.sist.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import kr.co.sist.libs.control.EmpVO;
import kr.co.sist.libs.control.Output;

public class ViewMain {
	private Vector<EmpVO> vector;
	private JFrame frm;
	private Container con;
	private BorderLayout border;
	private JTabbedPane tab;
	private JPanel inputPanel, outputPanel;
	private Output output;
	
	public ViewMain(String title) {
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.tab = new JTabbedPane();
		this.outputPanel = new Output();
		this.inputPanel = new Input(this.output);
		
	}
	public void display() {
		this.con.setLayout(this.border);
		this.con.add(this.tab);
		this.tab.add(this.inputPanel, "데이터 입력");
		this.tab.add(this.outputPanel, "데이터 출력");
		this.frm.setSize(800,600);
		this.frm.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.frm.setLocation((int)dim.getWidth()/2 - 400, (int)dim.getHeight()/2 - 300);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.frm.setVisible(true);
		
		
	}
}
