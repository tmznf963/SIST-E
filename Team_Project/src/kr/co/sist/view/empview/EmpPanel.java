/*
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
*/
package kr.co.sist.view.empview;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
/*
 * Color List
 * title 	160, 183, 197
 *	main 255, 255, 255 
 *	line,title 	52, 72, 104
*/
public class EmpPanel  extends JPanel{ //사원 화면 패널생성
	public static EmpLeftPanel elP;
	public static EmpCenterPanel ecP;
	public static EmpBottomPanel ebP;
	private JFrame frm;
	private String name;
	private String empno;
	public EmpPanel(JFrame afrm, String name, String empno) {
		this.name=name;
		this.empno=empno;
		this.frm = afrm;
		this.setLayout(new BorderLayout());
		this.add(empLeftPanel(),"West");
		this.add(empTopPanel(),"North");
		this.add(setEmpCenterPanel(),"Center");
	}

	public static EmpLeftPanel getEmpLeftPanel() {
		return elP;
	}
	public static EmpCenterPanel getEmpCenterPanel() {
		return ecP;
	}
	public static EmpBottomPanel getEmpBottomPanel() {
		return ebP;
	}
	private JPanel setEmpCenterPanel() { //중앙 info출력 화면 생성
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(empCenterPanel(),"Center");
		p.add(empBottomPanel(),"South");
		p.setBackground(new Color(255,255,255));
		return p;
	}
	private EmpCenterPanel empCenterPanel() { // 중앙 info패널 의 위치패널 ->이거위에 info패널
		ecP = new EmpCenterPanel();
		ecP.setBackground(new Color(192, 207, 216));
		return ecP;
	}
	private EmpTopPanel empTopPanel() { //상단 패널 생성
		EmpTopPanel p = new EmpTopPanel(frm,name);
		p.setSize(frm.getWidth()/6*5,frm.getHeight()/3);
		p.setBorder(new LineBorder(new Color(52, 72, 104),2));
		p.setBackground(new Color(192, 207, 216));
		return p;
	}
	private EmpBottomPanel empBottomPanel() { //하단 급여정보 패널
		ebP = new EmpBottomPanel(empno);
		ebP.setSize(frm.getWidth()/6*5,frm.getHeight()/3);
		ebP.setBackground(new Color(45, 60, 70));
		return ebP;
	}
	private EmpLeftPanel empLeftPanel() { //트리 패널
		elP = new EmpLeftPanel(frm);
		elP.setSize(frm.getWidth()/6,frm.getHeight());
		return elP;
	}

}
