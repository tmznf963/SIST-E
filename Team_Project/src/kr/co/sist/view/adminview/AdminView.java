/*
 * @refer instructor'source code from project.사원관리프로그램
 * modified by sangmin
 * MS windows 10 pro,eclipse_photon , JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

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
import javax.swing.JTextField;



public class AdminView extends WindowAdapter{
	private JFrame afrm;
	private Container con;
	private JPanel adminPanel;
	private JTextField tfID;
	public AdminView(String title, JTextField tfID) {
		this.tfID = tfID;
		this.afrm = new JFrame(title);
		this.con = this.afrm.getContentPane();
		this.adminPanel = new AdminPanel(afrm,this.tfID);		
		this.afrm.setBackground(new Color(52, 72, 84));

	}
	public void display() { //관리자 화면 띄우기
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();	
		this.afrm.setSize(dim.width/2,dim.height/3*2);
		this.con.setLayout(new BorderLayout());
		this.con.add(this.adminPanel);
		this.afrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.afrm.setLocation((int)dim.getWidth()/2-dim.width/4, (int)dim.getHeight()/2 - dim.height/3);
		this.afrm.addWindowListener(this);
		this.afrm.setResizable(false);
		this.afrm.setVisible(true);
		
		
	}
	
	@Override
	public void windowClosing(WindowEvent e){ //관리자 창 닫기 옵션
		int choice = JOptionPane.showConfirmDialog(afrm, "정말 종료하시겠습니까?", "종료", 
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(choice == JOptionPane.OK_OPTION) { 
			System.exit(0);
		}else{
			afrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		}
	}
}
