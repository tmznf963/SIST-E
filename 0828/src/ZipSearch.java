import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
//1. import
//2. implements
//3. Override
public class ZipSearch implements ActionListener{ //Main
	private JFrame frm;
	private JPanel pNorth;
	private JScrollPane scroll;
	private JTable table;
	private JLabel myLabel;
	private JTextField tf;
	private Container con;
	private Font font;
	
	public ZipSearch(String title) {//생성자
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.font = new Font("Sans serif", Font.PLAIN, 35);
		init();
	}
	public void init() {
		this.table = new JTable(new MyModel(null));
		this.scroll = new JScrollPane(this.table);
	}
	public void refresh(MyModel m) {
		this.table.setModel(m);
	}
	public void display() {
		this.con.add("North", getNorth());
		this.con.add("Center", this.scroll);
		this.frm.setSize(1024, 768);
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frm.setVisible(true);
	}
	private JPanel getNorth() {
		this.pNorth = new JPanel();
		LineBorder lb = new LineBorder(Color.GRAY, 3 ,true);
		this.pNorth.setBorder(new TitledBorder(lb, "찾고자 하시는 읍/면/동 을 넣고 엔터치세요."));
		this.pNorth.add(this.myLabel = new JLabel("찾고자 하시는 읍/면/동 : "));
		this.myLabel.setFont(this.font);
		this.pNorth.add(this.tf = new JTextField(15));
		this.tf.setFont(this.font);
		this.tf.addActionListener(this);//4. 액션리스너 등록한다.
		return this.pNorth;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.refresh(new MyModel(this.tf.getText()));//입력창 값을 Key로 넘긴다.
	}
	
	public static void main(String[] args) {
		new ZipSearch("우편번호 검색").display();
	}
}
