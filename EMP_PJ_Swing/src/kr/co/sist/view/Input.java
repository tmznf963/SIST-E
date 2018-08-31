package kr.co.sist.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kr.co.sist.libs.control.Calc;
import kr.co.sist.libs.control.EmpVO;
import kr.co.sist.libs.control.InputControl;
import kr.co.sist.libs.control.Output;

public class Input extends JPanel implements ActionListener{
	private EmpVO emp;
	private JPanel p;
	private JTextField tf_no, tf_name, tf_price, tf_night, tf_family;
	private JLabel lbl_no, lbl_name, lbl_price, lbl_night, lbl_family;
	private JButton btn_input, btn_output;
	private Output output;
	
	public Input(Output output) {
		this.p = new JPanel();
		this.output = output;
		this.display();
	}
	private void display() {
		this.setLayout(new FlowLayout());
		this.p.setLayout(new BorderLayout());		
		this.p.setBackground(Color.WHITE);
		this.p.add("Center", getCenter());
		this.p.add("South", getSouth());
		this.add(this.p);
		
		}//display
	private JPanel getSouth() {
		JPanel pSouth = new JPanel();
		pSouth.add(this.btn_input = new JButton("INPUT"));
		this.btn_input.addActionListener(this);
		pSouth.add(this.btn_output = new JButton("CLEAR"));
		this.btn_output.addActionListener(this);
		return pSouth;
	}
	private JPanel getCenter() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(5,2,100,45));
		pCenter.add(this.lbl_no = new JLabel("사번: "));
		pCenter.add(this.tf_no = new JTextField(7));
		pCenter.add(this.lbl_name = new JLabel("이름: "));
		pCenter.add(this.tf_name = new JTextField(7));
		pCenter.add(this.lbl_price = new JLabel("기본급: "));
		pCenter.add(this.tf_price = new JTextField(7));
		pCenter.add(this.lbl_night = new JLabel("야근시간:  "));
		pCenter.add(this.tf_night = new JTextField(7));
		pCenter.add(this.lbl_family = new JLabel("가족수: "));
		pCenter.add(this.tf_family = new JTextField(7));
		
		return pCenter;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "INPUT" : insert(); break;
		case "CLEAR" : tf_no.setText(""); 
										tf_name.setText("");
										tf_price.setText("");
										tf_night.setText("");
										tf_family.setText("");
										break;
		}
	}
	private  void insert() {
		String no = this.tf_no.getText().trim();
		String name = this.tf_name.getText().trim();
		int price = Integer.parseInt(this.tf_price.getText().trim());
		int night = Integer.parseInt(this.tf_night.getText().trim());
		int family = Integer.parseInt(this.tf_family.getText().trim());
		EmpVO e = new EmpVO(no, name, price, night, family);
		Calc calc = new Calc(e);
		calc.calc();
		int row = InputControl.insert(e);
		if(row == 1) {
			JOptionPane.showMessageDialog(this, "Data Insert Success!!!");
			this.tf_no.setText("");
			this.tf_name.setText("");
			this.tf_price.setText("");
			this.tf_night.setText("");
			this.tf_family.setText("");
		}

	}
}
