/*
 * 
 * @refer [http://blog.naver.com/PostView.nhn?blogId=rich3691&logNo=120093055773]
 * 
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
 */
package kr.co.sist.control.viewcontrol;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPopupMenu;

import kr.co.sist.view.adminview.AdminPanel;

public class RightClicked implements MouseListener {
	AdminPanel adminPanel;
	JPopupMenu menu;
	public RightClicked(AdminPanel adminPanel, JPopupMenu menu) {

		  this.adminPanel=adminPanel;
		   this.menu=menu;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		 if(e.isMetaDown()) menu.show ( adminPanel,e.getX() , e.getY() );

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
