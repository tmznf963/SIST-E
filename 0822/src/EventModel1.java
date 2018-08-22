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

public class EventModel1 implements ActionListener , MouseMotionListener, WindowListener{//�̺�Ʈ�� ��� ���������� Override ����� ��.
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
		this.tf = new JTextField();//�ؽ�Ʈ
	}
	public void display() {
		this.frm.addMouseMotionListener(this);//���콺��Ǹ������� �ڽ��� �Ķ���� == this
		this.frm.addWindowListener(this);
		this.pSouth.add(this.btnRed = new JButton("����"));
		this.btnRed.setFont(this.font);
		this.btnRed.addActionListener(this);
		this.pSouth.add(this.btnYellow = new JButton("���"));
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
		//if(e.getActionCommand().equals("����")) //����
		
		if(e.getSource() == this.btnRed) { //�ּҺ�
			this.con.setBackground(Color.RED);
		}else {
			this.con.setBackground(Color.YELLOW);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {}//���� :: ������� �ʴ� �޼ҵ嵵 ������ ������� == interface �̴ϱ�
	public void mouseMoved(MouseEvent e) {
		this.tf.setText("(x , y) = ("+e.getX()+","+e.getY()+")");//��ǥ x,y ������
		//System.out.println("���콺�� �����Դϴ�.");
	}
	@Override
	public void windowClosing(WindowEvent e) {//WindowListener ������
		int choice = JOptionPane.showConfirmDialog(this.con, "���� �����Ͻðڽ��ϱ�??");
		if(choice == JOptionPane.YES_OPTION) {
			this.frm.setVisible(false);//���߰�
			this.frm.dispose();//�ڿ� �ݳ�
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
