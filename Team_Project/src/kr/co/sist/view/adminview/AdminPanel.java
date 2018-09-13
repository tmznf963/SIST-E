/*
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import kr.co.sist.control.viewcontrol.RightClicked;

/*
 * Color List
 * title 	160, 183, 197
 *	main 255, 255, 255 
 *	line,title 	52, 72, 104
*/
public class AdminPanel  extends JPanel{ //관리자 화면 패널생성
	private JPopupMenu menu;
	private JMenuItem refresh;
	private JFrame frm;
	private JTextField tfID;
	public static  AdminCenterPanel cP;
	public static  AdminBottomPanel bP;
	public AdminPanel(JFrame afrm, JTextField tfID) {
		this.frm = afrm;
		this.menu = new JPopupMenu();
		this.refresh = new JMenuItem("Refresh");
		this.menu.add(refresh);
		this.tfID = tfID;
		refresh.addActionListener(new MousePopup(frm,tfID));
		this.add(menu);
		this.setLayout(new BorderLayout());
		this.addMouseListener(new RightClicked(this,menu));
		this.add(adminLeftPanel(),"West");
		this.add(adminTopPanel(),"North");
		this.add(setAdminCenterPanel(),"Center");
	}
public static  AdminCenterPanel getCenterPanel() { //사원정보 refresh
	return cP;
}
public static  AdminBottomPanel getBottomPanel() { //급여정보 refresh
	return bP;
}
	private JPanel setAdminCenterPanel() { //중앙 info출력 화면 생성
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(adminCenterPanel(),"Center");
		p.add(adminBottomPanel(),"South");
		p.setBackground(new Color(255,255,255));
		return p;
	}
	private AdminCenterPanel adminCenterPanel() { // 중앙 info패널 의 위치패널 ->이거위에 info패널
		cP = new AdminCenterPanel();
		cP.setBackground(new Color(192, 207, 216));
		return cP;
	}
	private AdminTopPanel adminTopPanel() { //상단 패널 생성
		AdminTopPanel p = new AdminTopPanel(frm,tfID);
		p.setSize(frm.getWidth()/6*5,frm.getHeight()/3);
		p.setBorder(new LineBorder(new Color(52, 72, 104),2));
		p.setBackground(new Color(192, 207, 216));
		return p;
	}
	private AdminBottomPanel adminBottomPanel() { //하단 급여정보 패널
		bP = new AdminBottomPanel();
		bP.setSize(frm.getWidth()/6*5,frm.getHeight()/3);
		bP.setBackground(new Color(45, 60, 70));
		return bP;
	}
	private AdminLeftPanel adminLeftPanel() { //트리 패널
		 AdminLeftPanel lP = new AdminLeftPanel(frm);
		lP.setSize(frm.getWidth()/6,frm.getHeight());
		return lP;
	}

}

