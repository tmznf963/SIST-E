/*
 * ���� : ���ȣ
 * ���� : 2018 08 24
 * �� : �Է��� �ޱ� ���� Ŭ����
 * ����ȯ�� : ������8.1 , ��Ŭ��������, JDK1.8.0_192
 */

package kr.co.sist.view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import kr.co.sist.model.Pmp;

public class Input extends JPanel implements ActionListener{
	private Vector<Pmp> vector;
	private JPanel p;
	private JLabel lblNum , lblCode, lblDays, lblAge;
	private JTextField tfNum, tfCode, tfDays, tfAge;
	private JButton btnAdd;
	private Font font;
	private JTabbedPane tab;
	private Output output;
	private int count = 1;
	
	public Input(Vector<Pmp> vector, JTabbedPane tab, Output output) {//������ //Main���� ���� vector �ޱ�
		this.vector = vector;
		this.tab = tab;
		this.output = output;//output�г��� �ּ�
		this.p = new JPanel();
		this.font = new Font("Sans Serif",Font.PLAIN,35);
		this.display();
	}
	
	public void display() {//�׸��� �޼ҵ�
		this.setLayout(new FlowLayout());
		this.p.setLayout(new BorderLayout());//���� �г�
		this.p.add("Center", getCenter()); //���� �г�
		this.p.add("South", getSouth()); //���� �г�
		this.add(this.p);
	}
	
	private JPanel getCenter() {  //ȯ�ڵ����� �Է� ȭ��
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(6,2,10,10));//6��2�� 10 �� ���Ʒ� ����
		
		pCenter.add(this.lblNum = new JLabel("��ȣ : "));
		this.lblNum.setFont(this.font);
		pCenter.add(this.tfNum = new JTextField());
		this.tfNum.setFont(this.font);
		
		pCenter.add(this.lblCode = new JLabel("�����ڵ� : "));
		this.lblCode.setFont(this.font);
		pCenter.add(this.tfCode = new JTextField());
		this.tfCode.setFont(this.font);
		
		pCenter.add(this.lblDays = new JLabel("�Կ��ϼ� : "));
		this.lblDays.setFont(this.font);
		pCenter.add(this.tfDays = new JTextField());
		this.tfDays.setFont(this.font);
		
		pCenter.add(this.lblAge = new JLabel("���� : "));
		this.lblAge.setFont(this.font);
		pCenter.add(this.tfAge = new JTextField());
		this.tfAge.setFont(this.font);
	
		return pCenter;
	}
	
	private JPanel getSouth() {		//�߰���ư
		JPanel pSouth = new JPanel();
		pSouth.add(this.btnAdd = new JButton("�߰�"));
		this.btnAdd.setFont(this.font);
		this.btnAdd.addActionListener(this);
		return pSouth;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(this.tfNum.getText().trim());
		String code = this.tfCode.getText();
		int days = Integer.parseInt(this.tfDays.getText().trim());//�� ���� ©������� == trim()
		int age = Integer.parseInt(this.tfAge.getText().trim());//String --> int ��ȯ
		Pmp p = new Pmp(num,code,days,age);
		this.vector.addElement(p);//���Ϳ� ȯ�� �߰�
		this.tfNum.setText("");   this.tfCode.setText("");
	    this.tfDays.setText("");   this.tfAge.setText("");
		
		JOptionPane.showMessageDialog(this.p,
				""+this.count+"��° ȯ�ڰ� ���������� �߰��ƽ��ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
		
		this.count++;
		//JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
		
		
		 }
	
	}//Class