/*
 * @refer [kaiaphas.tistory.com/35]
 * Sangmin
 * 2018-09-09
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.control.actioncontrol;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kr.co.sist.control.LoginControl;
import kr.co.sist.model.EmpVO;
import kr.co.sist.view.adminview.AdminView;
import kr.co.sist.view.empview.EmpView;

public class LoginAction implements ActionListener { //로그인 성공시 로그인 화면 닫고 관리자화면,사원화면 생성
	private Container con;
	private JTextField tfID;
	private JFrame frm;
	private JPasswordField tfPwd;
	public LoginAction(JFrame frm, Container con, JTextField tfID, JPasswordField tfPwd) {
		this.con = con;
		this.frm = frm;
		this.tfID = tfID;
		this.tfPwd = tfPwd;
		
	}


	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) { //2018-09-11 update
		HashMap<String,String> map = new HashMap<String,String>();
		HashMap<String,String> mapname = new HashMap<String,String>();
		Vector<EmpVO> v = LoginControl.emplogin();
		//name,empno,pwd->name, dname,empno 순서로 부르기 (파라미터 순서) 
		do {
		for(int i=0; i<v.size();i++) {
			map.put(v.elementAt(i).getDname(), v.elementAt(i).getEmpno());
			mapname.put(v.elementAt(i).getDname(), v.elementAt(i).getName());	
		}
			if(!map.containsKey(this.tfID.getText())) {
				System.out.println(map.get(this.tfID.getText()));
				JOptionPane.showMessageDialog(this.con, "아이디를 확인해 주세요.");
				this.tfID.setText("");
				this.tfPwd.setText("");
				this.tfID.transferFocus();
				break;
			}else {
				if(!(map.get(this.tfID.getText())).equals(this.tfPwd.getText())) {
					JOptionPane.showMessageDialog(this.con, "비밀번호를 확인해 주세요.");
					this.tfID.setText("");
					this.tfPwd.setText("");
					this.tfID.transferFocus();
					break;
				}else if(map.get(this.tfID.getText()).equalsIgnoreCase("CCC111")) {
					JOptionPane.showMessageDialog(this.con, "관리자님 환영합니다.");
					this.frm.setVisible(false);
					this.frm.dispose();
					new AdminView("인적 자원 관리 프로그램",this.tfID).display();
					break;
				}else{
					String name = mapname.get(this.tfID.getText());
					String empno = this.tfID.getText();
					JOptionPane.showMessageDialog(this.con,name+" 님 환영합니다."); 
					this.frm.setVisible(false);
					this.frm.dispose();
					new EmpView("인적 자원 관리 프로그램",name,empno).display();
					break;
				}
			}
		}while(true);
	}//login action
	}
