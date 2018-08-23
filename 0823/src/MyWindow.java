import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends WindowAdapter {//Class 니깐 재정의 메소드 쓰고싶은것만 사용.
	private JFrame frm;
	public MyWindow(JFrame frm) {
		this.frm = frm;
	}

	@Override
	public void windowClosing(WindowEvent e) {//WindowListener 재정의
		int choice = JOptionPane.showConfirmDialog(this.frm, "정말 종료하시겠습니까??");
		if(choice == JOptionPane.YES_OPTION) {
			this.frm.setVisible(false);//감추고
			this.frm.dispose();//자원 반납
			System.exit(0);//종료
		}else {
			this.frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}
}
