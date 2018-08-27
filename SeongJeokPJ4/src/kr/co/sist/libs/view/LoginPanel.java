package kr.co.sist.libs.view;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kr.co.sist.libs.control.ActionControl;

public class LoginPanel extends JPanel{
	private MyCanvas mc;
	private JLabel lblID, lblPWD;
	private JTextField tfID;
	private JPasswordField tfPWD;
	private JButton btnOk, btnCancel;
	private JPanel pCenter;
	private Font font;
	private Container con;
	private CardLayout card;
	
	public LoginPanel(Container con , CardLayout card) {//생성자
		this.con = con;
		this.card = card;
		this.add(getCenter());
	}
	private JPanel getCenter() {
		this.font = new Font("Arial", Font.PLAIN, 40);
		pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(2,1,10,10));//2행1열
		pCenter.add(getImagePanel());
		pCenter.add(getLoginPanel());
		return pCenter;
	}
	private JPanel getImagePanel() {
		JPanel p = new JPanel();
		p.add(this.mc = new MyCanvas());
		this.mc.setSize(400,200);
		return p;
	}
	private JPanel getLoginPanel() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		p.add(this.lblID = new JLabel("ID : "));
		this.lblID.setFont(font);
		p.add(this.tfID = new JTextField(10));//(int)칸 입력칸
		this.tfID.setFont(font);
		p.add(this.lblPWD = new JLabel("PWD : "));
		this.lblPWD.setFont(font);
		p.add(this.tfPWD = new JPasswordField(10));
		this.tfPWD.setFont(font);
		p.add(this.btnOk = new JButton("Login"));
		this.btnOk.setFont(this.font);
		this.btnOk.addActionListener(new ActionControl(this.tfID, this.tfPWD,this.con,this.card));
		p.add(this.btnCancel = new JButton("Cancel"));
		this.btnCancel.setFont(this.font);
		this.btnCancel.addActionListener(new ActionControl(this.tfID, this.tfPWD,this.con,this.card));
		
		return p;
	}
	private class MyCanvas extends Canvas{//내부 클래스
		Image image;
		public MyCanvas() {
			this.image = Toolkit.getDefaultToolkit().getImage("images/student.jpg");
		}
		@Override
		public void paint(Graphics g) {
			int x = pCenter.getWidth() / 2 - 300;
			int y = pCenter.getHeight()/2-200;
			g.drawImage(this.image, x, y, 300, 200, this);
		}
	}
}
