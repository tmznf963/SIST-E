/*
 * ���� : �����
 * ���� : 2018 08 24
 * �� : ���ȭ���� ����� ���� Ŭ����
 * ����ȯ�� : ������8.1 , ��Ŭ��������, JDK1.8.0_192
 */
package kr.co.sist.view;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kr.co.sist.control.MyAction;
import kr.co.sist.model.MyModel;
import kr.co.sist.model.Pmp;

public class Output extends JPanel{
   private Vector<Pmp> vector;
   private JButton btnDis,btnSort,btnSave;
   private JScrollPane scroll;
   private JTable table;
   
   public Output(Vector<Pmp> vector) {
      this.vector = vector;
      this.table = new JTable();    //���̺� ���� �����
      this.scroll = new JScrollPane(this.table);   //�װ� �ֱ�
      this.output(); //������
      
   }
   public void refresh(Vector<Pmp> vector) {
      this.vector =vector;  //�Է¹��� pmp���� ���� ���Ϳ� �ְ�
      output();
   }
   
   public void output() {//������ ����ʱ�ȭ (this=JPanel)
      this.setLayout(new BorderLayout());  //���̾ƿ� ����
      this.table.setModel(new MyModel(this.vector));
      this.add("Center",this.scroll);
      this.add("North",getNorth());   
   }
   private JPanel getNorth() {
      JPanel panel = new JPanel();
      
      panel.add(this.btnDis = new JButton("Display"));
      this.btnDis.addActionListener(new MyAction(this.vector, this));
      panel.add(this.btnSort = new JButton("Sort"));
      this.btnSort.addActionListener(new MyAction(this.vector, this));
      panel.add(this.btnSave = new JButton("Save"));
      this.btnSave.addActionListener(new MyAction(this.vector, this));
      return panel;
      
      
   }
   
}