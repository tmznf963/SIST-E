/*
 * @refer instructor'source code from project.사원관리프로그램
 * sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.view.loginview;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import kr.co.sist.control.actioncontrol.LoginAction;

public class LoginPanel extends JPanel {
	private Canvas mc;
	private Container con;
	private JLabel lblID, lblPwd;
	private JTextField tfID;
	private JPasswordField tfPwd;
	private JButton btnLogin;
	private JPanel pCenter;
	private Font font;
	private JFrame frm;
	public LoginPanel(JFrame frm, Container con) {
		this.con = con;
		this.frm = frm;
		this.setLayout(new GridLayout(3,1,0,0));
		this.add(getImage());
		this.add(getCenter());
		this.add(getLoginButton());
	}
	
	private JPanel getCenter() { //로그인 ID, PW 위치잡기를 위한 panel
		this.font = new Font("Sans Serif",Font.BOLD,30);
		pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		pCenter.add(getLoginLabel());
		pCenter.setSize(frm.getSize().width,frm.getSize().height-200);
	
		return pCenter;
	}
	private JPanel getLoginButton() { // Login버튼 부분
		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		p.add(this.btnLogin = new JButton("Login"));
		this.btnLogin.setBackground(Color.WHITE);
		this.btnLogin.setForeground(new Color(255,94,0));
		btnLogin.addActionListener(new LoginAction(frm,con, tfID, tfPwd));
		this.btnLogin.setFont(font);
		p.setBorder(new LineBorder(Color.RED,1,true));
		return p;
	}

	private JPanel getLoginLabel() { // 로그인  ID, PW입력부분
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2,0,10));
		p.add(this.lblID = new JLabel("     ID"));
		this.lblID.setForeground(new Color(255,94,0));
		this.lblID.setSize(p.getWidth()/5,p.getHeight());
		this.lblID.setFont(this.font);
		p.add(this.tfID = new JTextField(5));
		this.tfID.setFont(this.font);
		p.add(this.lblPwd = new JLabel("    PW"));
		this.lblPwd.setSize(p.getWidth()/5,p.getHeight());
		this.lblPwd.setForeground(new Color(255,94,0));
		this.lblPwd.setFont(this.font);
		p.add(this.tfPwd = new JPasswordField(5));
		this.tfPwd.setFont(this.font);
		p.setBackground(Color.WHITE);
		return p;
	}
	private JPanel getImage() { //로그인 이미지넣기
		JPanel p = new JPanel();
		p.add(this.mc = new MyCanvas());
		this.mc.setSize(300,250);
		return p;
	} 

	private class MyCanvas extends Canvas{
		Image image;
		public MyCanvas() {
			this.image = Toolkit.getDefaultToolkit().getImage("images/emp/erm.png");
			
		}
		@Override
		public void paint(Graphics g) {
			g.drawImage(this.image, 0, 0, 	this.getWidth(),this.getHeight()/3, this);
		}
}

}
