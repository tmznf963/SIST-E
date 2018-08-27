package kr.co.sist.libs.control;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//1. import
//2. implements
//3. Override
public class ActionControl implements ActionListener{
	private JTextField tfID;
	private JPasswordField tfPWD;
	private Container con;
	private CardLayout card;
	
	public ActionControl(JTextField tfID, JPasswordField tfPWD, Container con, CardLayout card) {
		this.tfID = tfID;
		this.tfPWD = tfPWD;
		this.con = con;
		this.card = card;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {//버튼의 라벨 비교
		case "Login" : loginCheck(); break;
		case "Cancel" : clear(); break;
		}
	}
	private void loginCheck() {
		if(this.tfID.getText().equals("javasoft") && this.tfPWD.getText().equals("1234")) {
			JOptionPane.showMessageDialog(this.con, this.tfID.getText() + " 님 환영합니다^^");
			this.card.next(this.con);
		}else {
			JOptionPane.showMessageDialog(this.con, "ID 혹은 PWD가 일치하지 않습니다.", "Login Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void clear() {
		this.tfID.setText("");//공백
		this.tfPWD.setText("");
	}

}
