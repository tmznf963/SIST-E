import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
	private JFrame frm;
	private JButton [] array;
	private Container con;
	private BorderLayoutDemo(String title) {
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.array = new JButton[] {
				new JButton("North"), new JButton("South"), 
				new JButton("East"), new JButton("West"), 
				new JButton("Center"),
		};
	}
	private void display() {
		this.con.add("North",this.array[0]);
		this.con.add(this.array[1],"South");//only 첫글자는 대문자
		this.con.add(BorderLayout.EAST,this.array[2]);//위치를 상수
		this.con.add(this.array[3],BorderLayout.WEST);
		this.con.add("Center",this.array[4]);
		this.frm.setSize(800,600);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//[x]버튼 활성화
		this.frm.setVisible(true);//반드시
	}
	public static void main(String[] args) {
		new BorderLayoutDemo("BorderLayout Demo").display();
	}
}
