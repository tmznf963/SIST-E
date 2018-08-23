import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends WindowAdapter {//Class �ϱ� ������ �޼ҵ� ��������͸� ���.
	private JFrame frm;
	public MyWindow(JFrame frm) {
		this.frm = frm;
	}

	@Override
	public void windowClosing(WindowEvent e) {//WindowListener ������
		int choice = JOptionPane.showConfirmDialog(this.frm, "���� �����Ͻðڽ��ϱ�??");
		if(choice == JOptionPane.YES_OPTION) {
			this.frm.setVisible(false);//���߰�
			this.frm.dispose();//�ڿ� �ݳ�
			System.exit(0);//����
		}else {
			this.frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}
}
