/*
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
*/
package kr.co.sist.control.actioncontrol;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import kr.co.sist.control.Calc;
import kr.co.sist.control.InsertControl;
import kr.co.sist.model.EmpVO;
import kr.co.sist.view.adminview.InsertPanel;

public class InsertButtonAction implements ActionListener { //dialog의 추가 버튼 누를시 이벤트 //미구현
	private Dialog insert;
	public InsertButtonAction(Dialog insert) {
		this.insert=insert;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		EmpVO emp =InsertPanel.getpassinsert().passinfo();
		if(emp.getAddress().equals("")||emp.getSaveage().equals("")||emp.getName().equals("")|| //하나라도 빈칸이면 수행
				emp.getBirthdate().equals("")||emp.getDcode().equals("none")||emp.getPwd().equals("")||
				emp.getEmail().equals("")||emp.getHiredate().equals("")||
				emp.getPosition().equals("none")||emp.getSex().equals("none")||emp.getP_num().equals("")) {
			JOptionPane.showMessageDialog(null, "빈칸이 있는지 확인해주세요", "경고창", JOptionPane.WARNING_MESSAGE);
			System.out.println(emp.getP_num().length());
		}else if(emp.getHiredate().length()!=10){//입사날짜 검사
			JOptionPane.showMessageDialog(null, "입사 날짜를 확인해주세요\n ex) 1993-04-15", "경고창", JOptionPane.WARNING_MESSAGE);
		}else if(emp.getP_num().length()!=11) { //전화번호 검사
			JOptionPane.showMessageDialog(null, "전화 번호를 확인해주세요\n ex) 010-1234-5678", "경고창", JOptionPane.WARNING_MESSAGE);
		}
			else {
		
			Calc calc = new Calc(emp);
			calc.calc();
			int row = InsertControl.insertinfo(emp);
			if(row==1) {
				JOptionPane.showMessageDialog(null, "사원 ["+emp.getName()+"]이(가) 추가 되었습니다. "+"\n사원번호는 ["+
			emp.getEmpno()+"] 입니다.",
			"입력 성공", JOptionPane.INFORMATION_MESSAGE);
				this.insert.setVisible(false);
				this.insert.dispose();
			}
		}

	}
}
