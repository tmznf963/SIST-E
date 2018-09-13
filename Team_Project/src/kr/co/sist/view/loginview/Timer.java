/*
 * @refer  [http://m.blog.daum.net/creazier/11174342]
 * Sangmin
 * 2018-09-08
 * MS windows 10 pro, eclipse_photon, JDK1.8.0_181
*/
package kr.co.sist.view.loginview;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer extends JPanel implements ActionListener{ //현재시간 알려주는 패널
      Calendar calendar1 = Calendar.getInstance(); 
      int hour = calendar1.get(Calendar.HOUR_OF_DAY); 
      int min = calendar1.get(Calendar.MINUTE); 
      int sec = calendar1.get(Calendar.SECOND); 

      javax.swing.Timer timer; 
      JLabel lbPresent; 
      private Font font;
      public Timer(){ 
    	  	this.font = new Font("Sans Serif",Font.BOLD,25);
            timer = new javax.swing.Timer(1000, this); 
            timer.setInitialDelay(0); 
            timer.start(); 

            lbPresent = new JLabel("현재시간 : " + hour + "시 " + min + "분 " + sec + "초",Label.RIGHT);
            this.add(lbPresent); 
            this.setBackground(new Color(192, 207, 216));
      } 

      public void actionPerformed(ActionEvent e){  //초당 이벤트처리
    	  
            ++sec; 
            Calendar calendar2 = Calendar.getInstance(); 
            hour = calendar2.get(Calendar.HOUR_OF_DAY); 
            min = calendar2.get(Calendar.MINUTE); 
            sec = calendar2.get(Calendar.SECOND); 
            lbPresent.setText("현재시간 : " + hour + "시 " + min + "분 " + sec + "초"); 
            lbPresent.setForeground(Color.white);
            lbPresent.setBackground(new Color(192, 207, 216));
            lbPresent.setFont(font);
      } 
}