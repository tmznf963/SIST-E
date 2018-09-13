/*
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.control.viewcontrol;

import java.awt.Dialog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ClosingDialog extends WindowAdapter { //dialog 닫을때 이벤트
	private JFrame frm;
	private Dialog insert;
	public ClosingDialog(JFrame frm, Dialog insert) {
		this.insert = insert;
		this.frm = frm;
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
			insert.setVisible(false);
			insert.dispose();

	}

}
