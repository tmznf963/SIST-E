package kr.co.sist.libs.view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import kr.co.sist.libs.control.Calc;
import kr.co.sist.libs.control.InputControl;
import kr.co.sist.libs.model.StudentVO;


public class Input extends JPanel implements ActionListener{
	private JPanel p;
	private JLabel lblHakbun , lblName, lblKor, lblEng, lblMat, lblEdp;
	private JTextField tfHakbun, tfName, tfKor, tfEng, tfMat, tfEdp;
	private JButton btnAdd;
	private Font font;
	private JTabbedPane tab;
	private Output output;
	
	public Input(JTabbedPane tab, Output output) {//������ //Main���� ���� vector �ޱ�
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
	
	private JPanel getCenter() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(6,2,10,10));//6��2�� 10 �� ���Ʒ� ����
		pCenter.add(this.lblHakbun = new JLabel("�й� : "));
		this.lblHakbun.setFont(this.font);
		pCenter.add(this.tfHakbun = new JTextField());
		this.tfHakbun.setFont(this.font);
		
		
		pCenter.add(this.lblName = new JLabel("�̸� : "));
		this.lblName.setFont(this.font);
		pCenter.add(this.tfName = new JTextField());
		this.tfName.setFont(this.font);
		
		pCenter.add(this.lblKor = new JLabel("���� : "));
		this.lblKor.setFont(this.font);
		pCenter.add(this.tfKor = new JTextField());
		this.tfKor.setFont(this.font);
		
		pCenter.add(this.lblEng = new JLabel("���� : "));
		this.lblEng.setFont(this.font);
		pCenter.add(this.tfEng = new JTextField());
		this.tfEng.setFont(this.font);
		
		pCenter.add(this.lblMat = new JLabel("���� : "));
		this.lblMat.setFont(this.font);
		pCenter.add(this.tfMat = new JTextField());
		this.tfMat.setFont(this.font);
		
		pCenter.add(this.lblEdp = new JLabel("���� : "));
		this.lblEdp.setFont(this.font);
		pCenter.add(this.tfEdp = new JTextField());
		this.tfEdp.setFont(this.font);
		
		
		return pCenter;
	}
	
	private JPanel getSouth() {
		JPanel pSouth = new JPanel();
		pSouth.add(this.btnAdd = new JButton("Add"));
		this.btnAdd.setFont(this.font);
		this.btnAdd.addActionListener(this);
		return pSouth;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String hakbun = this.tfHakbun.getText();
		String name = this.tfName.getText();
		int kor = Integer.parseInt(this.tfKor.getText().trim());//�� ���� ©������� == trim()
		int eng = Integer.parseInt(this.tfEng.getText().trim());//String --> int ��ȯ
		int mat = Integer.parseInt(this.tfMat.getText().trim());
		int edp = Integer.parseInt(this.tfEdp.getText().trim());
		
		StudentVO s = new StudentVO(hakbun,name,kor,eng,mat,edp);
		Calc calc = new Calc(s); calc.calc(); //Calc ���� ���
		
		int row = InputControl.insert(s);
		if(row ==1){
			JOptionPane.showMessageDialog(this, "Insert Success!!");
		}
		
		int choice = JOptionPane.showConfirmDialog(this, "��� �Է� ?");//int
		if(choice == JOptionPane.YES_OPTION) {
		    this.tfHakbun.setText("");   this.tfName.setText("");
		    this.tfKor.setText("");   this.tfEng.setText("");
		    this.tfMat.setText("");   this.tfEdp.setText("");
		    this.output.refresh();
		 }else {        //if(choice == JOptionPane.NO_OPTION)
		    this.tab.setSelectedIndex(1);
		    this.output.refresh();
		 }
	}
	
	
}//Class
