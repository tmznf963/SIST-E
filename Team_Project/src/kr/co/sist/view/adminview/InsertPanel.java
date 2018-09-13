/*
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import kr.co.sist.control.actioncontrol.CancelButtonAction;
import kr.co.sist.control.actioncontrol.InsertButtonAction;


public class InsertPanel extends JPanel{
	private JButton btnInsert,btnCancel;
	private Font font;
	private Dialog insert;
	public static InsertEmployee in;
	public InsertPanel(Dialog insert) {
		this.insert = insert;

		this.font = new Font("Sans Serif",Font.BOLD,25);
		this.setLayout(new BorderLayout());
		this.add(insertEmp(),"South");
		this.add(insertEmployee(),"Center");
	}
public static InsertEmployee getpassinsert() {
	return in;
}
	private JPanel insertEmp() { //dialog의 버튼
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.setBorder(new LineBorder(Color.WHITE, 2, true));
		p.add(btnInsert = new JButton("입력"));
		this.btnInsert.setFont(font);
		btnInsert.addActionListener(new InsertButtonAction(insert));
		p.add(btnCancel = new JButton("취소"));
		this.btnCancel.setFont(font);
		btnCancel.addActionListener(new CancelButtonAction(insert));
		return p;
	}
	private InsertEmployee insertEmployee() { //dialog 입력부분
		in = new InsertEmployee();
		in.setBackground(Color.WHITE);
		return in;
	}
}
