/*
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181
*/
package kr.co.sist.control.actioncontrol;

import java.util.Vector;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import kr.co.sist.control.viewcontrol.ShowEmpInfoForEmp;
import kr.co.sist.model.EmpVO;

public class SelectTreeActionEmp implements TreeSelectionListener {

	private Vector<EmpVO> v;
	private JTree tree;
	public SelectTreeActionEmp(JTree jTree1, Vector<EmpVO> v) {
		this.v=v;
		this.tree=jTree1;
	}
	@Override
	public void valueChanged(TreeSelectionEvent evt) {
	
		DefaultMutableTreeNode dept = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		Object name = dept.getUserObject(); //선택된 노드의 이름 가져오기
		for(int i =0 ; i <v.size() ; i++) {
		String str = v.elementAt(i).getName();
		if(str.equals(name)) {
			String no = v.elementAt(i).getEmpno();

			if(name.equals(v.elementAt(i).getName())) { // 선택된 노드의 이름이 마지막 노드이면
				new ShowEmpInfoForEmp(no).showinfo(); //사번 넘겨줌
			}
			break;
		}
		}
		
		
		
		
	}

}
