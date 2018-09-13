/*
 * sangmin
 * 2018-09-09
 * MS windows 10 pro,eclipse_photon , JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

import java.util.Vector;

import javax.swing.tree.DefaultMutableTreeNode;

import kr.co.sist.model.EmpVO;

public class TreeSales extends DefaultMutableTreeNode {
	private Vector<EmpVO> v;
	public TreeSales(Vector<EmpVO> v) {
		this.v=v;
		this.setUserObject("영업부");
		createTree();
	}
	private void createTree() {
		if(v!=null) {
		for(int i =0; i<v.size(); i++) {
			if(v.elementAt(i).getDname().equals(this.getUserObject())) {
		this.add(new DefaultMutableTreeNode(v.elementAt(i).getName()));
				}
			}
		}
	}

}
