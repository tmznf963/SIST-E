/*
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
*/
package kr.co.sist.control.actioncontrol;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelButtonAction implements ActionListener { //취소 버튼 누를시 이벤트
	private Dialog insert;
	public CancelButtonAction(Dialog insert) {
		this.insert = insert;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
			insert.setVisible(false);
			insert.dispose();
	}

}
