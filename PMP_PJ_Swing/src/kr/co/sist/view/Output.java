/*
 * 누가 : 김수연
 * 언제 : 2018 08 24
 * 왜 : 출력화면을 만들기 위한 클래스
 * 개발환경 : 윈도우8.1 , 이클립스포톤, JDK1.8.0_192
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
      this.table = new JTable();    //테이블 먼저 만들고
      this.scroll = new JScrollPane(this.table);   //그걸 넣기
      this.output(); //랜더링
      
   }
   public void refresh(Vector<Pmp> vector) {
      this.vector =vector;  //입력받은 pmp벡터 나의 벡터에 넣고
      output();
   }
   
   public void output() {//생성자 멤버초기화 (this=JPanel)
      this.setLayout(new BorderLayout());  //레이아웃 선언
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