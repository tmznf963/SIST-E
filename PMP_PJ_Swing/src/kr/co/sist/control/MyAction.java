/*
 * ���� : ������
 * ���� : 2018 08 24
 * �� : �׼��̺�Ʈ�� �ֱ� ���� Ŭ����
 * ����ȯ�� : ������8.1 , ��Ŭ��������, JDK1.8.0_192
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
				JOptionPane.showMessageDialog(output, "ȯ�� �����Ͱ� �����ϴ�.", "���â", JOptionPane.WARNING_MESSAGE);
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