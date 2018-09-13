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
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;

import kr.co.sist.model.EmpVO;

public class AdminCenterPanel extends JPanel {
	private Font font,font1; //폰트
	private JLabel imagePanel; //이미지 패널
	private JPanel infoPanel; //정보 출력 패널
	private JLabel labelDept;
	private JPanel koreanPanel; //한글부 패널
	private JPanel showInfoPanel; //정보 출력부 패널
	private JLabel labelAddressF;
	private JLabel labelAddressK;
	private JLabel labelAddressS;
	private JLabel labelAddress_D;
	private JLabel labelAddress_S;
	private JLabel labelAddress_SK;
	private JLabel labelAge;
	private JLabel labelAge_N_GenderK;
	private JLabel labelAge_N_Gender_D;
	private JLabel labelDeptK;
	private JLabel labelEmail;
	private JLabel labelEmailK;
	private JLabel labelEmpname;
	private JLabel labelEmpnameK;
	private JLabel labelEmpno;
	private JLabel labelEmpnoK;
	private JLabel labelGender;
	private JLabel labelHiredateD;
	private JLabel labelHiredateDK;
	private JLabel labelHiredateK;
	private JLabel labelHiredateM;
	private JLabel labelHiredateMK;
	private JLabel labelHiredateY;
	private JLabel labelHiredateYK;
	private JLabel labelPhoneF;
	private JLabel labelPhoneK;
	private JLabel labelPhoneS;
	private JLabel labelPhoneT;
	private JLabel labelPhone_DF;
	private JLabel labelPhone_DS;
	private JLabel labelPosition;
	private JLabel labelPositionK;
	private  Toolkit toolkit;
    public AdminCenterPanel() {
    	this.font = new Font("Sans Serif", 1, 12);
    	this.font1 =new Font("Sans Serif", 1, 14);
        initComponents();
    }

                       
    private void initComponents() {

        infoPanel = new JPanel();
        imagePanel = new JLabel();
        koreanPanel = new JPanel();
        labelHiredateK = new JLabel();
        labelEmpnameK = new JLabel();
        labelAddressK = new JLabel();
        labelAge_N_GenderK = new JLabel();
        labelAddress_SK = new JLabel();
        labelPhoneK = new JLabel();
        labelEmailK = new JLabel();
        labelDeptK = new JLabel();
        labelPositionK = new JLabel();
        labelEmpnoK = new JLabel();
        showInfoPanel = new JPanel();
        labelHiredateYK = new JLabel();
        labelHiredateMK = new JLabel();
        labelHiredateDK = new JLabel();
        labelAddress_D = new JLabel();
        labelPhone_DF = new JLabel();
        labelPhone_DS = new JLabel();
        labelAge_N_Gender_D = new JLabel();
        labelGender = new JLabel();
        labelHiredateY = new JLabel();
        labelHiredateM = new JLabel();
        labelHiredateD = new JLabel();
        labelEmpname = new JLabel();
        labelAddressF = new JLabel();
        labelAge = new JLabel();
        labelAddress_S = new JLabel();
        labelPhoneF = new JLabel();
        labelPhoneS = new JLabel();
        labelPhoneT = new JLabel();
        labelAddressS = new JLabel();
        labelEmpno = new JLabel();
        labelDept = new JLabel();
        labelPosition = new JLabel();
        labelEmail = new JLabel();

        setBackground(new Color(192, 207, 216));

        infoPanel.setBackground(new Color(255,255,255));
        infoPanel.setBorder(BorderFactory.createTitledBorder(null, "인사정보", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, font)); 
        koreanPanel.setBackground(new Color(255,255,255));
        GroupLayout koreanPanelLayout = new GroupLayout(koreanPanel);
        koreanPanel.setLayout(koreanPanelLayout);
        koreanPanelLayout.setHorizontalGroup(
            koreanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(koreanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(koreanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(koreanPanelLayout.createSequentialGroup()
                        .addComponent(labelHiredateK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(150, 150, 150))
                    .addGroup(koreanPanelLayout.createSequentialGroup()
                        .addComponent(labelEmpnameK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(koreanPanelLayout.createSequentialGroup()
                        .addGroup(koreanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelAge_N_GenderK)
                            .addComponent(labelPositionK)
                            .addGroup(koreanPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(labelPhoneK)
                                .addGroup(koreanPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelDeptK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelEmailK)))
                            .addComponent(labelEmpnoK)
                            .addComponent(labelAddressK, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddress_SK))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        koreanPanelLayout.setVerticalGroup(
            koreanPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(koreanPanelLayout.createSequentialGroup()
                .addComponent(labelHiredateK, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelEmpnoK)
                .addGap(18, 18, 18)
                .addComponent(labelEmpnameK)
                .addGap(26, 26, 26)
                .addComponent(labelAddressK)
                .addGap(18, 18, 18)
                .addComponent(labelAge_N_GenderK)
                .addGap(18, 18, 18)
                .addComponent(labelAddress_SK)
                .addGap(18, 18, 18)
                .addComponent(labelPhoneK)
                .addGap(18, 18, 18)
                .addComponent(labelEmailK)
                .addGap(18, 18, 18)
                .addComponent(labelDeptK, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPositionK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        showInfoPanel.setBackground(new Color(255,255,255));
        imagePanel.setBackground(new Color(255, 255, 255));
        imagePanel.setOpaque(true);
        GroupLayout showInfoPanelLayout = new GroupLayout(showInfoPanel);
        showInfoPanel.setLayout(showInfoPanelLayout);
        showInfoPanelLayout.setHorizontalGroup(
            showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(showInfoPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(labelPosition, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                    .addGroup(showInfoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDept, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelEmpno)
                    .addGroup(showInfoPanelLayout.createSequentialGroup()
                        .addComponent(labelHiredateY)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHiredateYK)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHiredateM)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHiredateMK)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHiredateD)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHiredateDK))
                    .addGroup(showInfoPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress_S)
                            .addGroup(showInfoPanelLayout.createSequentialGroup()
                                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAddressF)
                                    .addComponent(labelAge)
                                    .addComponent(labelEmpname))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(GroupLayout.Alignment.LEADING, showInfoPanelLayout.createSequentialGroup()
                                        .addComponent(labelAge_N_Gender_D)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelGender, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(showInfoPanelLayout.createSequentialGroup()
                                        .addComponent(labelAddress_D, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelAddressS))))
                            .addGroup(showInfoPanelLayout.createSequentialGroup()
                                .addComponent(labelPhoneF)
                                .addGap(1, 1, 1)
                                .addComponent(labelPhone_DF)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPhoneS)
                                .addGap(16, 16, 16)
                                .addComponent(labelPhone_DS)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPhoneT)))))
                .addGap(0, 84, Short.MAX_VALUE))
        );
        showInfoPanelLayout.setVerticalGroup(
            showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(showInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHiredateYK)
                    .addComponent(labelHiredateMK)
                    .addComponent(labelHiredateDK)
                    .addComponent(labelHiredateY)
                    .addComponent(labelHiredateM)
                    .addComponent(labelHiredateD))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmpno)
                .addGap(20, 20, 20)
                .addComponent(labelEmpname)
                .addGap(20, 20, 20) //28
                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddress_D)
                    .addComponent(labelAddressF)
                    .addComponent(labelAddressS))
                .addGap(25, 25, 25) //18
                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(labelAge_N_Gender_D)
                    .addComponent(labelGender))
                .addGap(18, 18, 18)
                .addComponent(labelAddress_S)
                .addGap(18, 18, 18)
                .addGroup(showInfoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhone_DF)
                    .addComponent(labelPhone_DS)
                    .addComponent(labelPhoneF)
                    .addComponent(labelPhoneS)
                    .addComponent(labelPhoneT))
                .addGap(23, 23, 23)
                .addComponent(labelEmail)
                .addGap(23, 23, 23)
                .addComponent(labelDept)
                .addGap(18, 18, 18)
                .addComponent(labelPosition)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        GroupLayout infoPanelLayout = new GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(koreanPanel, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showInfoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(showInfoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(imagePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(koreanPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
         }                        

public void setinfo(Vector<EmpVO> v, Vector<EmpVO> vSalary, String no) {
	if(v!=null){
		

	    imagePanel.setBackground(new Color(255, 255, 255));
        GroupLayout imagePanelLayout = new GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
       	toolkit = Toolkit.getDefaultToolkit();
        Image image=  toolkit.getImage("./images/"+no+".jpg"); //사진 크기는 135x142 jpg형식
        ImageIcon icon = new ImageIcon(image); 
        imagePanel.setIcon(icon);
        
        labelHiredateYK.setFont(font1); 
        labelHiredateYK.setText("년");
        labelHiredateMK.setFont(font1); 
        labelHiredateMK.setText("월");
        labelHiredateDK.setFont(font1); 
        labelHiredateDK.setText("일");
        labelAddress_D.setFont(font1); 
       labelAddress_D.setText("-");
        labelPhone_DF.setFont(font1); 
        labelPhone_DF.setText("-");
        labelPhone_DS.setFont(font1); 
        labelPhone_DS.setText("-");
        labelAge_N_Gender_D.setFont(font1); 
        labelAge_N_Gender_D.setText("/");
        labelGender.setFont(font1); 
        labelHiredateY.setFont(font1);      
        labelHiredateM.setFont(font1); 
        labelHiredateD.setFont(font1);       
        labelEmpname.setFont(font1);  
        labelAddressF.setFont(font1); 
        labelAge.setFont(font1); 
        labelAddress_S.setFont(font1);  
        labelPhoneF.setFont(font1);   
        labelPhoneS.setFont(font1);
        labelPhoneT.setFont(font1);
        labelAddressS.setFont(font1); 
        labelEmpno.setFont(font1); 
        labelDept.setFont(font1); 
        labelPosition.setFont(font1); 
        labelEmail.setFont(font1); 
        labelHiredateK.setFont(font1); 
        labelHiredateK.setText("입 사 년 월 일");
        labelEmpnameK.setFont(font1); 
        labelEmpnameK.setText("사     원     명");
        labelAddressK.setFont(font1); 
        labelAddressK.setText("주민 등록 번호");
        labelAge_N_GenderK.setFont(font1); 
        labelAge_N_GenderK.setText("나 이  /  성 별");
        labelAddress_SK.setFont(font1); 
        labelAddress_SK.setText("주            소");
        labelPhoneK.setFont(font1); 
        labelPhoneK.setText("전  화   번  호");
        labelEmailK.setFont(font1); 
        labelEmailK.setText("이      메    일");
        labelDeptK.setFont(font1); 
        labelDeptK.setText("부            서");
        labelPositionK.setFont(font1); 
        labelPositionK.setText("직            급");
        labelEmpnoK.setFont(font1); 
        labelEmpnoK.setText("사  원   번  호");
        
        this.labelGender.setText(v.elementAt(0).getSex());
       this.labelHiredateY.setText("20"+v.elementAt(0).getHiredate().substring(0, 2));
       this.labelHiredateM.setText(v.elementAt(0).getHiredate().substring(3, 5));
       this.labelHiredateD.setText(v.elementAt(0).getHiredate().substring(6, 8));
       this.labelEmpname.setText(v.elementAt(0).getName());
       this.labelAddressF.setText(v.elementAt(0).getBirthdate());
       this.labelAge.setText(String.valueOf(v.elementAt(0).getAge()));
       this.labelAddress_S.setText(v.elementAt(0).getAddress()); 
       this.labelPhoneF.setText(v.elementAt(0).getP_num().substring(0, 3));
       this.labelPhoneS.setText(v.elementAt(0).getP_num().substring(3, 7));
       this.labelPhoneT.setText(v.elementAt(0).getP_num().substring(7, 11));
       this.labelEmpno.setText(v.elementAt(0).getEmpno());
       this.labelDept.setText(v.elementAt(0).getDname()); 
       this.labelPosition.setText(vSalary.elementAt(0).getPosition());
       this.labelEmail.setText(v.elementAt(0).getEmail());
        if (v.elementAt(0).getSex().equals("남")) {
        	this.labelAddressS.setText("1******");
        }else {
        	this.labelAddressS.setText("2******");
        }//else
}// if
}
                
}

