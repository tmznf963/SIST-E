/*
 * @Origin NetBeans IDE 8.2<editor-fold defaultstate="collapsed" desc="Generated Code">
 * @rafer  <editor-fold defaultstate="collapsed" desc="Generated Code">
 * Modify by Sangmin from NetBeans IDE 8.2 
 * 2018-09-08
 * MS windows 10 pro,eclipse_photon ,NetBeans IDE 8.2, JDK1.8.0_181
*/
package kr.co.sist.view.adminview;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import kr.co.sist.control.GetTreeControl;
import kr.co.sist.control.actioncontrol.InsertDialogAction;
import kr.co.sist.control.actioncontrol.SelectTreeActionAdmin;
import kr.co.sist.model.EmpVO;

public class AdminLeftPanel extends JPanel { //트리패널 

    private JButton jButton1;
    private JScrollPane jScrollPane1;
    private JTree jTree1;
    private JFrame frm;

    public AdminLeftPanel(JFrame frm) {
    	this.frm=frm;
    	this.setBackground(new Color(255,255,255));
        initComponents();
    }
                       
    private void initComponents() {

    	Vector<EmpVO> v =GetTreeControl.getTree();	

        jScrollPane1 = new JScrollPane();
        jTree1 = new JTree();
        jButton1 = new JButton();

        DefaultMutableTreeNode rootTree = new DefaultMutableTreeNode("부서");
        rootTree.add(new TreeSales(v));//영업부
        rootTree.add(new TreeHumanResources(v)); //인사부
        rootTree.add(new TreePublicRelations(v));//홍보부
        rootTree.add(new TreeGeneralAffairs(v));//총무부  
        rootTree.add(new TreeResearch(v));//연구부
        rootTree.add(new TreeProduction(v));//생산부
        jTree1.setModel(new DefaultTreeModel(rootTree));
        jScrollPane1.setViewportView(jTree1);
        jTree1.addTreeSelectionListener(new SelectTreeActionAdmin(jTree1,v));
        jButton1.setBackground(new Color(0, 153, 153));
        jButton1.setFont(new Font("굴림", 1, 18)); // NOI18N
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("사원 입력");
        jButton1.addActionListener(new InsertDialogAction(frm));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
    }                       

                 
}
