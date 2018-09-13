/*
 * @ refer [ http://bamssong.tistory.com/168 ]
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
*/
package kr.co.sist.view.adminview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MousePopup implements ActionListener {
	JTextField tfID;
	private JFrame frm;
	public MousePopup(JFrame frm, JTextField tfID) {
		this.frm=frm;
		this.tfID=tfID;
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
		frm.getContentPane().removeAll(); // 등록된 모든 컨테이너 삭제
		frm.getContentPane().add(new AdminPanel(frm, tfID)); // 다시 등록
		frm.setContentPane(frm.getContentPane()); // 프레임에 설정
	}
}

