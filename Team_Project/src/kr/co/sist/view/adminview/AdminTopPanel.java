/*
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kr.co.sist.control.actioncontrol.LogoutAction;
import kr.co.sist.view.loginview.Timer;

public class AdminTopPanel extends JPanel{
	private Font font;
	private JButton btnLogOut;
	private JLabel labelName;
	private JFrame frm;
	public AdminTopPanel(JFrame frm, JTextField tfID) {
		Timer time = new Timer(); 
		this.setLayout(new BorderLayout());
		this.frm=frm;
		this.setLayout(new BorderLayout());
		this.font = new Font("Sans Serif",Font.BOLD,20);
		this.add(top(),"East");
		top().setSize((int)this.getSize().getWidth()/5,(int)this.getSize().getHeight());
		this.add(time,"West");
	}
	private JPanel top() { //관리자 화면의 상당부
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.add(this.labelName = new JLabel("관리자님 환영합니다"));
		this.labelName.setBackground(new Color(192, 207, 216));
		this.labelName.setOpaque(true);
		this.labelName.setForeground(new Color(255,255,255));
		this.labelName.setFont(font);
		p.add(this.btnLogOut = new JButton("Log Out"));
		this.btnLogOut.setFont(font);
		this.btnLogOut.setBackground(new Color(192, 207, 216));
		this.btnLogOut.setForeground(new Color(255,255,255));
		this.btnLogOut.addActionListener(new LogoutAction(frm));
		return p;
	}
}
