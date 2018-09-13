/*
 * 
 * sangmin
 * 2018-09-09
 * MS windows 10 pro,eclipse_photon , JDK1.8.0_181
*/
package kr.co.sist.view.empview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class EmpView extends WindowAdapter{
	private JFrame efrm;
	private Container con;
	private JPanel p, empPanel, input;
	private String name;
	private String empno;   
	public EmpView(String title, String name, String empno) {
		this.empno=empno;
		this.name = name;
		this.efrm = new JFrame(title);
		this.con = this.efrm.getContentPane();
		this.empPanel = new EmpPanel(efrm,name,empno);		
		this.efrm.setBackground(new Color(52, 72, 84));

	}
	public void display() { //사원 화면 띄우기
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();	
		this.efrm.setSize(dim.width/2,dim.height/3*2);
		this.con.setLayout(new BorderLayout());
		this.con.add(this.empPanel);
		this.efrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.efrm.setLocation((int)dim.getWidth()/2-dim.width/4, (int)dim.getHeight()/2 - dim.height/3);
		this.efrm.addWindowListener(this);
		this.efrm.setResizable(false);
		this.efrm.setVisible(true);
		
		
	}
	
	@Override
	public void windowClosing(WindowEvent e){ //사원 창 닫기 옵션
		int choice = JOptionPane.showConfirmDialog(efrm, "정말 종료하시겠습니까?", "종료", 
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(choice == JOptionPane.OK_OPTION) { 
			System.exit(0);
		}else{
			efrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		}
	}
}
