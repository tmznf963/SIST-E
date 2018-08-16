import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class GuiDemo extends Frame{
	private Button btn;
	public GuiDemo(String title) {
		super(title);
		this.btn = new Button("Click Click !!!");
		
	}
	public void display() {
		this.setSize(800,600);
		this.setBackground(Color.CYAN);
		this.add(this.btn);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GuiDemo("Frame Demo").display(); //title
		
	}
}
