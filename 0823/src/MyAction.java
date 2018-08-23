import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction implements ActionListener {
	private Container con;
	public MyAction(Container con) {
		this.con = con;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("»¡°­")) {
			this.con.setBackground(Color.RED);
		}else {
			this.con.setBackground(Color.YELLOW);
		}
	}

}
