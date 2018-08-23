import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;//���콺����̺�Ʈ
import java.awt.event.MouseMotionListener;//���콺��Ǹ�����
import java.awt.event.WindowEvent;//�˸�â
import java.awt.event.WindowListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//1.import �Ѵ�
//2.implements �Ѵ�
//3.Override �Ѵ�
//4.display()�� ����Ѵ�
//5.Listener �Ѵ�

public class EventModel3{//�̺�Ʈ�� ��� ���������� Override ����� ��.
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
		this.tf = new JTextField();//�ؽ�Ʈ
	}
	
	public void display() {
		this.frm.addMouseMotionListener(new MyMouseMotion(this.tf));//�� Ŭ����(�ؽ�Ʈ�ʵ� �ּ�)
		this.frm.addWindowListener(new MyWindow(this.frm));//�� Ŭ����(������ �ּ�)
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
