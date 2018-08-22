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

public class EventModel1 implements ActionListener , MouseMotionListener, WindowListener{//이벤트를 상속 받을때마다 Override 해줘야 함.
	private JFrame frm;
	private JButton btnYellow, btnRed;
	private JPanel pSouth;
	private JTextField tf;
	private Container con;
	private Font font;
	EventModel1(String title){
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.font = new Font("Serif",Font.PLAIN, 40);
		this.pSouth = new JPanel();
		this.tf = new JTextField();//텍스트
	}
	public void display() {
		this.frm.addMouseMotionListener(this);//마우스모션리스너의 자식을 파라미터 == this
		this.frm.addWindowListener(this);
		this.pSouth.add(this.btnRed = new JButton("빨강"));
		this.btnRed.setFont(this.font);
		this.btnRed.addActionListener(this);
		this.pSouth.add(this.btnYellow = new JButton("노랑"));
		this.btnYellow.setFont(this.font);
		this.btnYellow.addActionListener(this);
		
		this.con.add("South",this.pSouth);
		this.con.add("North",this.tf);
		this.tf.setFont(this.font);
		this.frm.setSize(800,600);
		this.frm.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getActionCommand().equals("빨강")) //값비교
		
		if(e.getSource() == this.btnRed) { //주소비교
			this.con.setBackground(Color.RED);
		}else {
			this.con.setBackground(Color.YELLOW);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {}//단점 :: 사용하지 않는 메소드도 재정의 해줘야함 == interface 이니까
	public void mouseMoved(MouseEvent e) {
		this.tf.setText("(x , y) = ("+e.getX()+","+e.getY()+")");//좌표 x,y 얻어오기
		//System.out.println("마우스를 움직입니다.");
	}
	@Override
	public void windowClosing(WindowEvent e) {//WindowListener 재정의
		int choice = JOptionPane.showConfirmDialog(this.con, "정말 종료하시겠습니까??");
		if(choice == JOptionPane.YES_OPTION) {
			this.frm.setVisible(false);//감추고
			this.frm.dispose();//자원 반납
			System.exit(0);
			//this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}else {
			this.frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}
	public void windowClosed(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new EventModel1("Event Model1").display();
	}
	
}
