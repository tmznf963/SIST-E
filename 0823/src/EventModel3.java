import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;//마우스모션이벤트
import java.awt.event.MouseMotionListener;//마우스모션리스너
import java.awt.event.WindowEvent;//알림창
import java.awt.event.WindowListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//1.import 한다
//2.implements 한다
//3.Override 한다
//4.display()에 등록한다
//5.Listener 한다

public class EventModel3{//이벤트를 상속 받을때마다 Override 해줘야 함.
	private JFrame frm;
	private JButton btnYellow, btnRed;
	private JPanel pSouth;
	private JTextField tf;
	private Container con;
	private Font font;
	
	EventModel3(String title){
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.font = new Font("Serif",Font.PLAIN, 40);
		this.pSouth = new JPanel();
		this.tf = new JTextField();//텍스트
	}
	
	public void display() {
		this.frm.addMouseMotionListener(new MyMouseMotion(this.tf));//옆 클래스(텍스트필드 주소)
		this.frm.addWindowListener(new MyWindow(this.frm));//옆 클래스(프레임 주소)
		this.pSouth.add(this.btnRed = new JButton("빨강"));
		this.btnRed.setFont(this.font);
		this.btnRed.addActionListener(new MyInnerAction());//이벤트 등록 , InnerClass == 자원할당 필요없음.
		this.pSouth.add(this.btnYellow = new JButton("노랑"));
		this.btnYellow.setFont(this.font);
		this.btnYellow.addActionListener(new MyInnerAction());
		
		this.con.add("South",this.pSouth);
		this.con.add("North",this.tf);
		this.tf.setFont(this.font);
		this.frm.setSize(800,600);
		this.frm.setVisible(true);
	}
	
	private class MyInnerAction implements ActionListener{//outClass 멤버 변수 접근 가능 == 다중상속 == static 불가
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("빨강")) {
				EventModel3.this.con.setBackground(Color.RED);
			}else {
				EventModel3.this.con.setBackground(Color.YELLOW);
			}
		}
	}
	
	public static void main(String[] args) {
		new EventModel3("Event Model1").display();
	}
}
