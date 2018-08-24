/*
 * 누가 : 김상민
 * 언제 : 2018 08 24
 * 왜 : 메인 클래스
 * 개발환경 : 윈도우8.1 , 이클립스포톤, JDK1.8.0_192
 */
package kr.co.sist.view;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import kr.co.sist.model.Pmp;

public class Main {
	private JFrame frm;
	private Container con;
	private JTabbedPane tab;
	private Font font;
	private Vector<Pmp> vector;
	public Main(String title) { 
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane(); //frame이 무거운녀석이라 가벼운녀석들을 대려다 쓰기위해 container를 사용 
		this.tab = new JTabbedPane(JTabbedPane.NORTH);
		this.vector = new Vector<Pmp>(1,1);
		this.font = new Font("Aria",Font.BOLD,30);
	}
	public void display() {
		this.frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(Main.this.con, "잘~~~~~~~~~~~~가", "종료종료종료종료종료종료", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		this.con.add(this.tab);
		this.tab.setFont(font);
		this.tab.setBackground(Color.cyan);
		Output output = new Output(this.vector);
		this.tab.add("Input tab", new Input(this.vector, this.tab, output));
		this.tab.add("Output tab", output);
		this.frm.setSize(800,600);
		this.frm.setVisible(true);
	}
	public static void main(String[] args) {
		Main main = new Main("병원 관리 프로그램 ver2 (feat. Swing)");
		main.display();

	}

}
