import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class FlowLayoutDemo {
	private JFrame frm;
	private Container con;
	private JCheckBox chkEclipse, chkNotepad, chkViscode;
	//private ButtonGroup btnGroup;
	private Font font;
	private FlowLayoutDemo(String title) {
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.chkEclipse = new JCheckBox("Eclipse",true);//�⺻ üũ ��
		this.chkNotepad = new JCheckBox("Notepad");
		this.chkViscode = new JCheckBox("Visual Studio Code");
		
		this.font = new Font("Arial",Font.BOLD, 40);
		//this.btnGroup = new ButtonGroup();
	}
	private void display() {
		this.con.setLayout(new FlowLayout());
		this.con.add(chkEclipse); this.chkEclipse.setFont(font);
		this.con.add(chkNotepad); this.chkNotepad.setFont(font);
		this.con.add(chkViscode); this.chkViscode.setFont(font);
		
		this.frm.setSize(800,600);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//[x]��ư Ȱ��ȭ
		this.frm.setVisible(true);//�ݵ��
	}
	public static void main(String[] args) {
		new FlowLayoutDemo("FlowLayout Demo").display();
	}
}
