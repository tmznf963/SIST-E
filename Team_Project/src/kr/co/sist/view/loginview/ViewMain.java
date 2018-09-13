/*
 * @refer instructor'source code from project.사원관리프로그램
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.view.loginview;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class ViewMain extends WindowAdapter{
	private JFrame frm;
	private Container con;
	private BorderLayout border;
	private JPanel p, loginPanel;
	public ViewMain(String title) {
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.loginPanel = new LoginPanel(frm, con);
		

	}
	public void display() {//로그인창 보여주기
		this.frm.setSize(300,300);
		this.con.setLayout(new BorderLayout());
		this.con.add(this.loginPanel);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.frm.setLocation((int)dim.getWidth()/2 - 150, (int)dim.getHeight()/2 - 150);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frm.addWindowListener(this);
		this.frm.setResizable(false);
		this.frm.setVisible(true);
		
		
	}
	
	@Override
	public void windowClosing(WindowEvent e){ //login창 닫을때 이벤트
		int choice = JOptionPane.showConfirmDialog(frm, "정말 종료하시겠습니까?", "종료", 
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(choice == JOptionPane.OK_OPTION) { 
			System.exit(0);
		}else{
			frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		}
	}
}
