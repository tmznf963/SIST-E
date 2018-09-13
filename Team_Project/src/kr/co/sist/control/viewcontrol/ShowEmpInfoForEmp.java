/*
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
*/
package kr.co.sist.control.viewcontrol;

import java.util.Vector;

import kr.co.sist.control.GetTreeControl;
import kr.co.sist.model.EmpVO;
import kr.co.sist.view.empview.EmpPanel;

public class ShowEmpInfoForEmp {
	String no;
	public ShowEmpInfoForEmp(String no) {
		this.no = no;
		showinfo();
	}

	public void showinfo() {
		Vector<EmpVO> vSalary = GetTreeControl.getsalinfo(no);
		Vector<EmpVO> vNight = GetTreeControl.getnightinfo(no);
		Vector<EmpVO> vInfo = GetTreeControl.getinfo(no);
		EmpPanel.getEmpCenterPanel().setinfo(vInfo,vSalary,no);
		EmpPanel.getEmpBottomPanel().setsalinfo(vSalary, vNight,no);

	}

}
