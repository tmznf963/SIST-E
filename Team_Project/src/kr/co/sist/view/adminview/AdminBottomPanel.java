/*
 * @Origin NetBeans IDE 8.2<editor-fold defaultstate="collapsed" desc="Generated Code">
 * @refer <editor-fold defaultstate="collapsed" desc="Generated Code"> 
 * Modify by Sangmin from Sangmin's source code in NetBeans IDE 8.2 
 * 2018-09-09
 * MS windows 10 pro,eclipse_photon ,NetBeans IDE 8.2, JDK1.8.0_181
*/
/*
 * <변수명 표기>
 * 마지막 K 한글표기
 * _D 대쉬
 * Y 연도, M 월, D일
 * F 처음, S 두번째, T 3번쨰
 * _S 거주지 주소
 * 나머지는 별도의 표기
*/
package kr.co.sist.view.adminview;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;

import kr.co.sist.model.EmpVO;


public class AdminBottomPanel extends JPanel {
	private Font font;
	private JLabel basicSalary;
	private JLabel basicSalaryK;
	private JLabel inputNightTime;
	private JLabel nightSalary;
	private JLabel nightSalaryK;
	private JLabel nightTimeK;
	private JLabel realSalary;
	private JLabel realSalaryK; 
    public AdminBottomPanel() {
    	this.font = new Font("Sans Serif", 1, 14);
        initComponents();
    }

                       
    private void initComponents() {
    	basicSalaryK = new JLabel();
        basicSalary = new JLabel();
        nightTimeK = new JLabel();
        realSalaryK = new JLabel();
        realSalary = new JLabel();
        nightSalaryK = new JLabel();
        nightSalary = new JLabel();
        inputNightTime = new JLabel();

        
       

        setBackground(new Color(45, 60, 70));
        setBorder(BorderFactory.createTitledBorder(null, "급여정보", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, font, new Color(255, 255, 255)));
        
    
    }                 
    public void setsalinfo(Vector<EmpVO> vSalary, Vector<EmpVO> vNight) {
    	if(vSalary!=null && vNight!=null) {
  
            
            GroupLayout layout = new GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nightSalaryK, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(nightSalary))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(realSalaryK, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(realSalary))
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(basicSalaryK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(basicSalary)))
                            .addGap(60, 60, 60)
                            .addComponent(nightTimeK, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inputNightTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            ))
                    .addContainerGap(304, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(basicSalaryK)
                        .addComponent(basicSalary)
                        .addComponent(nightTimeK)
                        .addComponent(inputNightTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nightSalaryK)
                        .addComponent(nightSalary))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(realSalaryK)
                        .addComponent(realSalary))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
    		  basicSalaryK.setBackground(new Color(0, 204, 204));
    	        basicSalaryK.setFont(font); 
    	        basicSalaryK.setForeground(new Color(255, 255, 255));
    	        basicSalaryK.setText("기  본  금");

    	        basicSalary.setBackground(new Color(0, 204, 204));
    	        basicSalary.setFont(font); 
    	        basicSalary.setForeground(new Color(255, 255, 255));
    	        basicSalary.setText(String.valueOf(vSalary.elementAt(0).getGibon()));

    	        nightTimeK.setBackground(new Color(0, 204, 204));
    	        nightTimeK.setFont(font); 
    	        nightTimeK.setForeground(new Color(255, 255, 255));
    	        nightTimeK.setText("야근시간");

    	        realSalaryK.setBackground(new Color(0, 204, 204));
    	        realSalaryK.setFont(font); 
    	        realSalaryK.setForeground(new Color(255, 255, 255));
    	        realSalaryK.setText("실  급  여");

    	        realSalary.setBackground(new Color(0, 204, 204));
    	        realSalary.setFont(font); 
    	        realSalary.setForeground(new Color(255, 255, 255));
    	        realSalary.setText(String.valueOf((vSalary.elementAt(0).getGibon()+vNight.elementAt(0).getNightbonus())*9/10));

    	        nightSalaryK.setBackground(new Color(0, 204, 204));
    	        nightSalaryK.setFont(font); 
    	        nightSalaryK.setForeground(new Color(255, 255, 255));
    	        nightSalaryK.setText("야간수당");

    	        nightSalary.setBackground(new Color(0, 204, 204));
    	        nightSalary.setFont(font); 
    	        nightSalary.setForeground(new Color(255, 255, 255));
    	        nightSalary.setText(String.valueOf(vNight.elementAt(0).getNightbonus()));
    	        
    	        inputNightTime.setBackground(new Color(0, 204, 204));
    	        inputNightTime.setForeground(new Color(255, 255, 255));
    	        inputNightTime.setFont(font); 
    	        inputNightTime.setText(String.valueOf(vNight.elementAt(0).getNighttime()));


    	}
    }
}
