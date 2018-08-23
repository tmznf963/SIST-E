import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

//컬렉션프레임워크 Vector == 계속 늘어가는 List
public class Main {
	private JFrame frm;
	private Container con;
	private JTabbedPane tab;
	private Vector<Student> vector;

	public Main(String title) {//생성자
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.tab = new JTabbedPane(JTabbedPane.TOP);
		this.vector = new Vector<Student>(1,1);
	}
	public void display() {
		this.frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {//어나니머스 클래스 == InnerClass
				JOptionPane.showMessageDialog(Main.this.con,
						"안녕히가세요.", "알림창", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		this.con.add(this.tab);
		this.tab.add("입력", new Input(this.vector, this.tab)); //tab
		this.tab.add("출력", new Output(this.vector)); //tab
		this.frm.setSize(800,600);
		this.frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		Main main = new Main("성적관리 프로젝트 Ver.3.0");
		main.display();
		/*Vector<Student> vector = new Vector<Student>(1,1);//한칸 시작 --> 한칸씩 증가
		
		Input in = new Input(vector);//input 생성자에게 vector 넘김
		in.input();
		
		Calc c = new Calc(vector);
		c.calc();
		
		Sort sort = new Sort(vector);
		sort.BubbleSort();
		
		Output op = new Output(vector);//생성자
		op.output();//메소드
*/		
	}
}
