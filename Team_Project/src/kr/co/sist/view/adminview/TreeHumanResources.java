/*
 * sangmin
 * 2018-09-09
 * MS windows 10 pro,eclipse_photon , JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

import java.util.Vector;

import javax.swing.tree.DefaultMutableTreeNode;

import kr.co.sist.model.EmpVO;

public class TreeHumanResources extends DefaultMutableTreeNode {
	private Vector<EmpVO> v;
	public TreeHumanResources(Vector<EmpVO> v) {
this.v=v;
		this.setUserObject("인사부");
		createTree();
	}
	private void createTree() {
		if(v!=null) {
		for(int i =0; i<v.size(); i++) {
			if(v.get(i).getDname().equalsIgnoreCase("인사부")) {
		this.add(new DefaultMutableTreeNode(v.get(i).getName()));
			}
		}
	}
	}
}
