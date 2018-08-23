import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//1.import �Ѵ�
//2.implements �Ѵ�
//3.Override �Ѵ�
//4.display()�� ����Ѵ�
//5.Listener �Ѵ�

public class EventModel4{//�̺�Ʈ�� ��� ���������� Override ����� ��.
	private JFrame frm;
	private JButton btnYellow, btnRed;
	private JPanel pSouth;
	private JTextField tf;
	private Container con;
	private Font font;
	
	EventModel4(String title){
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.font = new Font("Serif",Font.PLAIN, 40);
		this.pSouth = new JPanel();
		this.tf = new JTextField();//�ؽ�Ʈ
	}
	
	public void display() {
		this.frm.addMouseMotionListener(new MouseMotionAdapter() { //��ϸӽ� Ŭ����
			@Override
			public void mouseMoved(MouseEvent e) {
				EventModel4.this.tf.setText("(x,y) = ("+e.getX()+","+e.getY()+")");
			}
		});
		this.frm.addWindowListener(new WindowAdapter() { //��ϸӽ� Ŭ����
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.pSouth.add(this.btnRed = new JButton("����"));
		this.btnRed.setFont(this.font);
		this.btnRed.addActionListener(new MyInnerAction());//�̺�Ʈ ��� , InnerClass == �ڿ��Ҵ� �ʿ����.
		this.pSouth.add(this.btnYellow = new JButton("���"));
		this.btnYellow.setFont(this.font);
		this.btnYellow.addActionListener(new MyInnerAction());
		
		this.con.add("South",this.pSouth);
		this.con.add("North",this.tf);
		this.tf.setFont(this.font);
		this.frm.setSize(800,600);
		this.frm.setVisible(true);
	}
	
	private class MyInnerAction implements ActionListener{//outClass ��� ���� ���� ���� == ���߻�� == static �Ұ�
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("����")) {
				EventModel4.this.con.setBackground(Color.RED);
			}else {
				EventModel4.this.con.setBackground(Color.YELLOW);
			}
		}
	}
	
	public static void main(String[] args) {
		new EventModel4("Event Model1").display();
	}
}
