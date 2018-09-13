/*
 * sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.control.actioncontrol;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import kr.co.sist.view.loginview.ViewMain;

public class LogoutAction implements ActionListener { //로그아웃하면 화면닫히고 로그인 화면 생성
private JFrame frm;
private Container con;
	public LogoutAction(JFrame frm) {
		this.frm=frm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int choice = JOptionPane.showConfirmDialog(frm, "로그아웃 하시겠습니까?", "Log out", 
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(choice == JOptionPane.OK_OPTION) { 
			this.frm.setVisible(false);
			this.frm.dispose();
			ViewMain view = new ViewMain("Log in");
			view.display();
			JOptionPane.showMessageDialog(this.con,"로그아웃 되었습니다.");
		}else{
			frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		}
	}

}
