import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

//�÷��������ӿ�ũ Vector == ��� �þ�� List
public class Main {
	private JFrame frm;
	private Container con;
	private JTabbedPane tab;
	private Vector<Student> vector;

	public Main(String title) {//������
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.tab = new JTabbedPane(JTabbedPane.TOP);
		this.vector = new Vector<Student>(1,1);
	}
	public void display() {
		this.frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {//��ϸӽ� Ŭ���� == InnerClass
				JOptionPane.showMessageDialog(Main.this.con,
						"�ȳ���������.", "�˸�â", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		this.con.add(this.tab);
		this.tab.add("�Է�", new Input(this.vector, this.tab)); //tab
		this.tab.add("���", new Output(this.vector)); //tab
		this.frm.setSize(800,600);
		this.frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		Main main = new Main("�������� ������Ʈ Ver.3.0");
		main.display();
		/*Vector<Student> vector = new Vector<Student>(1,1);//��ĭ ���� --> ��ĭ�� ����
		
		Input in = new Input(vector);//input �����ڿ��� vector �ѱ�
		in.input();
		
		Calc c = new Calc(vector);
		c.calc();
		
		Sort sort = new Sort(vector);
		sort.BubbleSort();
		
		Output op = new Output(vector);//������
		op.output();//�޼ҵ�
*/		
	}
}
