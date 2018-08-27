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
		this.con = this.frm.getContentPane();//헤비웨이트컴퍼넌트
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
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//[x]버튼 활성화
		this.frm.setResizable(false);//크기 조작 비활성화
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//내 컴퓨터 해상도
		this.frm.setLocation((int)(dim.getWidth()/ 2 - 400),
											 (int)(dim.getHeight()/2 - 300));//가운데 위치 시키기// 800, 600크기
		this.frm.setVisible(true);
	}
}
