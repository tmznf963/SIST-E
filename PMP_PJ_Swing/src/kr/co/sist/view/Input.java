/*
 * 누가 : 김민호
 * 언제 : 2018 08 24
 * 왜 : 입력을 받기 위한 클래스
 * 개발환경 : 윈도우8.1 , 이클립스포톤, JDK1.8.0_192
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
	
	public Input(Vector<Pmp> vector, JTabbedPane tab, Output output) {//생성자 //Main에서 보낸 vector 받기
		this.vector = vector;
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
	
	private JPanel getCenter() {  //환자데이터 입력 화면
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(6,2,10,10));//6행2열 10 씩 위아래 공백
		
		pCenter.add(this.lblNum = new JLabel("번호 : "));
		this.lblNum.setFont(this.font);
		pCenter.add(this.tfNum = new JTextField());
		this.tfNum.setFont(this.font);
		
		pCenter.add(this.lblCode = new JLabel("진료코드 : "));
		this.lblCode.setFont(this.font);
		pCenter.add(this.tfCode = new JTextField());
		this.tfCode.setFont(this.font);
		
		pCenter.add(this.lblDays = new JLabel("입원일수 : "));
		this.lblDays.setFont(this.font);
		pCenter.add(this.tfDays = new JTextField());
		this.tfDays.setFont(this.font);
		
		pCenter.add(this.lblAge = new JLabel("나이 : "));
		this.lblAge.setFont(this.font);
		pCenter.add(this.tfAge = new JTextField());
		this.tfAge.setFont(this.font);
	
		return pCenter;
	}
	
	private JPanel getSouth() {		//추가버튼
		JPanel pSouth = new JPanel();
		pSouth.add(this.btnAdd = new JButton("추가"));
		this.btnAdd.setFont(this.font);
		this.btnAdd.addActionListener(this);
		return pSouth;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(this.tfNum.getText().trim());
		String code = this.tfCode.getText();
		int days = Integer.parseInt(this.tfDays.getText().trim());//빈 공간 짤라버리기 == trim()
		int age = Integer.parseInt(this.tfAge.getText().trim());//String --> int 변환
		Pmp p = new Pmp(num,code,days,age);
		this.vector.addElement(p);//벡터에 환자 추가
		this.tfNum.setText("");   this.tfCode.setText("");
	    this.tfDays.setText("");   this.tfAge.setText("");
		
		JOptionPane.showMessageDialog(this.p,
				""+this.count+"번째 환자가 성공적으로 추가됐습니다.", "메시지", JOptionPane.INFORMATION_MESSAGE);
		
		this.count++;
		//JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
		
		
		 }
	
	}//Class