/*
 * @ sangmin
 * @ 2018-09-11
 * @ MS Windows 8.1 K, Eclipse Photon, JDK1.8.0_181 
*/
package kr.co.sist.view.empview;

import java.awt.Color;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import kr.co.sist.control.GetTreeControl;
import kr.co.sist.control.actioncontrol.SelectTreeActionEmp;
import kr.co.sist.model.EmpVO;
import kr.co.sist.view.adminview.TreeGeneralAffairs;
import kr.co.sist.view.adminview.TreeHumanResources;
import kr.co.sist.view.adminview.TreeProduction;
import kr.co.sist.view.adminview.TreePublicRelations;
import kr.co.sist.view.adminview.TreeResearch;
import kr.co.sist.view.adminview.TreeSales;

public class EmpLeftPanel extends JPanel { //트리패널 

    private JLabel blankLabel;
    private JScrollPane jScrollPane1;
    private JTree jTree1;
    private JFrame frm;

    public EmpLeftPanel(JFrame frm) {
    	this.frm=frm;
    	this.setBackground(new Color(255,255,255));
        initComponents();
    }
                       
    private void initComponents() {
    	Vector<EmpVO> v =GetTreeControl.getTree();
        jScrollPane1 = new JScrollPane();
        jTree1 = new JTree();
        blankLabel = new JLabel();
        blankLabel.setBackground(Color.WHITE);
        blankLabel.setForeground(Color.WHITE);
        blankLabel.setText("나랏말싸미듕국에닳아");//동적위치 고정을 위한 빈칸채우기용 
        
        DefaultMutableTreeNode rootTree = new DefaultMutableTreeNode("부서");
        rootTree.add(new TreeSales(v));//영업부
        rootTree.add(new TreeHumanResources(v)); //인사부
        rootTree.add(new TreePublicRelations(v));//홍보부
        rootTree.add(new TreeGeneralAffairs(v));//총무부  
        rootTree.add(new TreeResearch(v));//연구부
        rootTree.add(new TreeProduction(v));//생산부
        jTree1.setModel(new DefaultTreeModel(rootTree));
        jTree1.addTreeSelectionListener(new SelectTreeActionEmp(jTree1,v));
        jScrollPane1.setViewportView(jTree1);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(blankLabel))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blankLabel))
        );
    }                       

                 
}
