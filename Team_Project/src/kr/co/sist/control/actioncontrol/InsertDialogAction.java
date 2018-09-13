/*
 * @refer [https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html]
 * 
 * sangmin
 * 2018-09-09
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.control.actioncontrol;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import kr.co.sist.control.viewcontrol.ClosingDialog;
import kr.co.sist.view.adminview.InsertPanel;

public class InsertDialogAction implements ActionListener { //dialog 생성후 띄우기
	private JFrame frm;

	public InsertDialogAction(JFrame frm) {
		this.frm=frm;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Dialog insert = new Dialog(frm,"사원 입력",true);
		InsertPanel insertEmp = new InsertPanel(insert);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		insert.setLocation((int)dim.getWidth()/2-dim.width/4, (int)dim.getHeight()/2 - dim.height/3);
		insert.setSize(dim.width/8*3,dim.height/3*2);
		insert.setLayout(new BorderLayout());
		insert.add(insertEmp);
		insert.addWindowListener(new ClosingDialog(frm,insert));
		insert.setResizable(false);
		insert.setVisible(true);
		
		}
		
	
}
