import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class GuiDemo1 {
	private Button btnOk;
	private Frame frm;
	private Font font;
	public GuiDemo1(String title) {
		this.frm = new Frame(title);
		this.btnOk = new Button("Click Click !!!");
		this.font = new Font("±Ã¼­Ã¼",Font.BOLD + Font.ITALIC, 50);
	}
	
	public void display() {
		this.frm.setSize(800,600);
		this.btnOk.setFont(this.font);
		this.frm.add(this.btnOk,"North");
		this.btnOk.setBackground(Color.red);
		this.frm.setBackground(Color.DARK_GRAY);
		this.frm.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiDemo1("Frame Demo").display(); //title
		
	}
}
