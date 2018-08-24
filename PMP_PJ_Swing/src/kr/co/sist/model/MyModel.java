/*
 * 누가 : 정주희
 * 언제 : 2018 08 24
 * 왜 : 벡터들의 값으로 테이블을 만들기 위한 클래스
 * 개발환경 : 윈도우8.1 , 이클립스포톤, JDK1.8.0_192
 */
package kr.co.sist.model;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyModel extends DefaultTableModel {
   private Vector<Pmp> vector;
   public MyModel(Vector<Pmp> vector) {
      this.vector = vector;
      Vector<String> columnVector = new Vector<String>(1,1);
      String [] array = {"번호", "진료부서", "진찰비", "입원비", "진료비"};
      for(String str : array) columnVector.addElement(str); 
      this.setDataVector(getMyDataVector(), columnVector); 
   }
   private Vector <Object>getMyDataVector(){
      Vector<Object>dataVector = new Vector<Object>(1,1);
      for(int i = 0 ; i <this.vector.size(); i++) {
         Pmp p = this.vector.get(i);
         Vector<String>rowVector = new Vector<String>(1,1);
         rowVector.addElement(String.valueOf(p.getNum()));
         rowVector.addElement(p.getPart());
         rowVector.addElement(String.valueOf(p.getFee()));
         rowVector.addElement(String.valueOf(p.getCost()));
         rowVector.addElement(String.valueOf(p.getPrice()));
         dataVector.addElement(rowVector);
      }
      return dataVector;
   }
}