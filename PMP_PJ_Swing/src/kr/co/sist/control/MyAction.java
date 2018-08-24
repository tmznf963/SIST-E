/*
 * 누가 : 정주희
 * 언제 : 2018 08 24
 * 왜 : 액션이벤트를 주기 위한 클래스
 * 개발환경 : 윈도우8.1 , 이클립스포톤, JDK1.8.0_192
 */
package kr.co.sist.control;
//1. import
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;

import kr.co.sist.model.Pmp;
import kr.co.sist.view.Output;

public class MyAction implements ActionListener { //2. implements
   private Vector <Pmp> vector;
   private Output output;
   public MyAction(Vector<Pmp> vector, Output output) { 
      this.vector = vector; 
      this.output = output; 
   }
   @Override
   public void actionPerformed(ActionEvent evt) {
      switch (evt.getActionCommand()) {
		case "Display":
			if (vector.isEmpty()) {
				JOptionPane.showMessageDialog(output, "환자 데이터가 없습니다.", "경고창", JOptionPane.WARNING_MESSAGE);
			} else
				calc();
			break;
      case "Sort" : sort(); break;
      case "Save" : save(); break;
      }
   }
   private void calc() {
      Calc calc = new Calc(this.vector);
      calc.calc();
      this.output.refresh(this.vector);
   }
   private void sort() {
      Sort sort = new Sort(this.vector);
      sort.BubbleSort();
      this.output.refresh(this.vector);
   }
   private void save() {
	   Save save = new Save(this.vector);
	   save.save();
   }
}