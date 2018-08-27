package kr.co.sist.libs.view;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewMain {
	private JFrame frm;
	private CardLayout card;
	private JPanel loginPanel, SeongjeokPanel;
	private Container con;
	
	
	public ViewMain(String title) {
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();//������Ʈ���۳�Ʈ
		this.card = new CardLayout();
		this.loginPanel = new LoginPanel(this.con, this.card);
		this.SeongjeokPanel = new SeongJeokPanel();
	}
	public void display() {
		this.con.setLayout(this.card);
		this.con.add(this.loginPanel, "login");
		this.con.add(this.SeongjeokPanel, "seongjeok");
		this.card.show(this.con, "Login");
		
		this.frm.setSize(800,600);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//[x]��ư Ȱ��ȭ
		this.frm.setResizable(false);//ũ�� ���� ��Ȱ��ȭ
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//�� ��ǻ�� �ػ�
		this.frm.setLocation((int)(dim.getWidth()/ 2 - 400),
											 (int)(dim.getHeight()/2 - 300));//��� ��ġ ��Ű��// 800, 600ũ��
		this.frm.setVisible(true);
	}
}
