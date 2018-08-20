import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;



public class SwingDemo {
	private JFrame frm;
	private JButton btn;
	private Container con;
	private SwingDemo(String title) {
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();//컨테이너 위에 추가.
		this.btn = new JButton("Click!! Click!!");
	}
	private void display() {
		this.con.add(this.btn,"North");
		this.frm.setSize(800,600);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//[X] 버튼 활성화
		this.frm.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingDemo("Swing Window").display();
		
	}
}
