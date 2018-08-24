/*
 * ���� : ����
 * ���� : 2018 08 24
 * �� : ����� �ϱ� ���� Ŭ����
 * ����ȯ�� : ������8.1 , ��Ŭ��������, JDK1.8.0_192
 */
package kr.co.sist.control;
import java.util.Vector;

import kr.co.sist.model.Pmp;

public class Calc {
	private Vector<Pmp> vector;

	public Calc(Vector<Pmp> vector) {
		this.vector = vector;
	}
   
   public void calc() {
      for(int i = 0 ; i < this.vector.size() ; i++) {
         Pmp p = this.vector.get(i);
         
         String code = p.getCode();//�����ڵ�
         if(code.equals("MI")) p.setPart("�ܰ�");
         else if(code.equals("NI")) p.setPart("����");
         else if(code.equals("SI")) p.setPart("�Ǻΰ�");
         else if(code.equals("TI")) p.setPart("�Ҿư�");
         else if(code.equals("VI")) p.setPart("����ΰ�");
         else if(code.equals("WI")) p.setPart("�񴢱��");
         
         int days = p.getDays(); //�Կ��ϼ�
         double sale = 0.; //���κ���
         if(days<10) sale = 1.0;
         else if(days >=10 && days<15) sale = 0.85;
         else if(days >=15 && days<20) sale = 0.80;
         else if(days >=20 && days<30) sale = 0.77;
         else if(days >=30 && days<100) sale = 0.72;
         else if(days >=100) sale = 0.68;
         
         int age = p.getAge();//����
         int fee = p.getFee();//������
         if(age<10) p.setFee(7000);
         else if(age >=10 && age<20) p.setFee(5000);
         else if(age >=20 && age<30) p.setFee(8000);
         else if(age >=30 && age<40) p.setFee(7000);
         else if(age >=40 && age<50) p.setFee(4500);
         else if(age >=50) p.setFee(2300);
         
         
         int one_day_cost = 25000;//1�� �Կ���
         if(days<4) one_day_cost = 30000;
         
         
         int all_cost = one_day_cost * days; //���Կ���
         
         int cost = (int)(all_cost * sale); //�Կ���
         p.setCost(cost);
         
         int price = p.getFee() + cost;//�����
         p.setPrice(price);


      }
   }

   
}//end