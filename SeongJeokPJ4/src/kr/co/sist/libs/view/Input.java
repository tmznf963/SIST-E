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
	
	public Input(JTabbedPane tab, Output output) {//생성자 //Main에서 보낸 vector 받기
		this.tab = tab;
		this.output = output;//output패널의 주소
		this.p = new JPanel();
		this.font = new Font("Sans Serif",Font.PLAIN,35);
		this.display();
	}
	
	public void display() {//그리는 메소드
		this.setLayout(new FlowLayout());
		this.p.setLayout(new BorderLayout());//바탕 패널
		this.p.add("Center", getCenter()); //센터 패널
		this.p.add("South", getSouth()); //남쪽 패널
		this.add(this.p);
	}
	
	private JPanel getCenter() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(6,2,10,10));//6행2열 10 씩 위아래 공백
		pCenter.add(this.lblHakbun = new JLabel("학번 : "));
		this.lblHakbun.setFont(this.font);
		pCenter.add(this.tfHakbun = new JTextField());
		this.tfHakbun.setFont(this.font);
		
		
		pCenter.add(this.lblName = new JLabel("이름 : "));
		this.lblName.setFont(this.font);
		pCenter.add(this.tfName = new JTextField());
		this.tfName.setFont(this.font);
		
		pCenter.add(this.lblKor = new JLabel("국어 : "));
		this.lblKor.setFont(this.font);
		pCenter.add(this.tfKor = new JTextField());
		this.tfKor.setFont(this.font);
		
		pCenter.add(this.lblEng = new JLabel("영어 : "));
		this.lblEng.setFont(this.font);
		pCenter.add(this.tfEng = new JTextField());
		this.tfEng.setFont(this.font);
		
		pCenter.add(this.lblMat = new JLabel("수학 : "));
		this.lblMat.setFont(this.font);
		pCenter.add(this.tfMat = new JTextField());
		this.tfMat.setFont(this.font);
		
		pCenter.add(this.lblEdp = new JLabel("전산 : "));
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
		int kor = Integer.parseInt(this.tfKor.getText().trim());//빈 공간 짤라버리기 == trim()
		int eng = Integer.parseInt(this.tfEng.getText().trim());//String --> int 변환
		int mat = Integer.parseInt(this.tfMat.getText().trim());
		int edp = Integer.parseInt(this.tfEdp.getText().trim());
		
		StudentVO s = new StudentVO(hakbun,name,kor,eng,mat,edp);
		Calc calc = new Calc(s); calc.calc(); //Calc 에서 계산
		
		int row = InputControl.insert(s);
		if(row ==1){
			JOptionPane.showMessageDialog(this, "Insert Success!!");
		}
		
		int choice = JOptionPane.showConfirmDialog(this, "계속 입력 ?");//int
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
