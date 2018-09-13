/*
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.control.viewcontrol;

import java.util.Vector;

import kr.co.sist.control.GetTreeControl;
import kr.co.sist.model.EmpVO;
import kr.co.sist.view.adminview.AdminPanel;

public class ShowEmpInfoForAdmin {

private String no;
	public ShowEmpInfoForAdmin(String no) {
		this.no = no;
		showinfo();
	}

	public void showinfo() {
		Vector<EmpVO> vSalary = GetTreeControl.getsalinfo(no);
		Vector<EmpVO> vNight = GetTreeControl.getnightinfo(no);
		Vector<EmpVO> vInfo = GetTreeControl.getinfo(no);
		AdminPanel.getCenterPanel().setinfo(vInfo,vSalary,no);//가져가주렴
		AdminPanel.getBottomPanel().setsalinfo(vSalary, vNight);
//	System.out.println("ShowEmpInfo의 확인 사번="+no); 
	}
}

