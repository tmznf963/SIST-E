/*
 * @Origin NetBeans IDE 8.2<editor-fold defaultstate="collapsed" desc="Generated Code">
 * @refer <editor-fold defaultstate="collapsed" desc="Generated Code"> 
 * Modify by Sangmin from Sangmin's source code in NetBeans IDE 8.2 
 * 2018-09-08
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

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import kr.co.sist.model.EmpVO;

public class InsertEmployee extends JPanel {
	 private JLabel btngetImage;
	    private JPanel imagePanel; //사진 패널
	    private JLabel jLabel63; // 주민번호 - 
	    private JPanel infoPanel; //정보 패널
	    private JTextField labelAddreddF; //주민등록번호 앞자리
	    private JLabel labelAddreddS; //주민등록번호 뒷자리
	    private JLabel labelAddressK;
	    private JTextField labelAddress_S; //거주지 주소
	    private JLabel labelAddress_SK;
	    private JTextField labelAge; //나이
	    private JLabel labelAge_Gender;//성별/나이 한글표기
	    private JComboBox comboBoxDept; //부서명
	    private JLabel comboBoxDeptK;
	    private JTextField labelEmailF;//e메일  @앞 ( 하나로 표기하자고 하여 한번에표기하면됨)
	    private JLabel labelEmailK;
	    private JTextField labelEmpName;//사원이름
	    private JLabel labelEmpNameK;
	    private JTextField labelPassword;//비밀번호
	    private JLabel labalPasswordK;
	    private JTextField labelHireDateM;//월
	    private JTextField labelHiredateD;//일
	    private JLabel labelHiredateDK;
	    private JLabel labelHiredateK;
	    private JLabel labelHiredateMK;
	    private JTextField labelHiredateY;//년
	    private JLabel labelHiredateYK;
	    private JTextField labelPhoneF; //번호 1번째칸
	    private JLabel labelPhoneFD; //처음 대쉬
	    private JTextField labelPhoneS; //번호 2번쨰칸
	    private JLabel labelPhoneSD; //두번째 대쉬
	    private JTextField labelPhoneT; //번호 3번째칸
	    private JLabel labelPhonek;
	    private JComboBox comboBoxPosition; //직종
	    private JLabel comboBoxPositionK;
	    private JLabel labelS2; //슬러쉬 (성별 / 나이) 사이에 들어가는 슬러쉬
	    private JComboBox comboBoxGender; //성별
	    private Font font;
    public InsertEmployee() {
    	this.font = new Font("Sans Serif", 1, 14);;
        initComponents();
        this.setBackground(Color.white);
    }
                         
    private void initComponents() {
    	
    	String [] array = {"none","남","여"};
        infoPanel = new JPanel();
        imagePanel = new JPanel();
        labelHiredateK = new JLabel();
        labelEmpNameK = new JLabel();
        labelAddressK = new JLabel();
        jLabel63 = new JLabel();
        labelAddreddS = new JLabel();
        labelAddress_SK = new JLabel();
        labelPhonek = new JLabel();
        labelPhoneFD = new JLabel();
        labelPhoneSD = new JLabel();
        comboBoxDeptK = new JLabel();
        comboBoxPositionK = new JLabel();
        labelEmailK = new JLabel();
        labelAge_Gender = new JLabel();
        labelS2 = new JLabel();
        btngetImage = new JLabel();
        labelEmpName = new JTextField(10);
        labelAddreddF = new JTextField(10);
        labelAge = new JTextField();
        comboBoxGender = new JComboBox<String>(array);
        labelAddress_S = new JTextField();
        labelPhoneF = new JTextField(3);
        labelPhoneS = new JTextField(5);
        labelPhoneT = new JTextField(5);
        labelEmailF = new JTextField(10);
        String [] dept = {"none","영업부","인사부","홍보부","총무부","연구부","생산부"};
        String [] pos = {"none","사원","주임","대리","과장","차장","부장","이사","사장"};
        comboBoxDept = new JComboBox<String>(dept);
        comboBoxPosition = new JComboBox<String>(pos);
        labelHiredateMK = new JLabel();
        labelHireDateM = new JTextField(3);
        labelHiredateD = new JTextField(3);
        labelHiredateY = new JTextField(6);
        labelHiredateYK = new JLabel();
        labelHiredateDK = new JLabel();
        labalPasswordK = new JLabel();
        labelPassword = new JTextField();
        

        infoPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        infoPanel.setBackground(Color.WHITE);
        imagePanel.setBackground(Color.WHITE);
        GroupLayout imagePanelLayout = new GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
           
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
            
        );
        
        labelHiredateK.setFont(font);
        labelHiredateK.setText("입사 년 월 일");

        labelEmpNameK.setFont(font);
        labelEmpNameK.setText("사    원    명");

        labelAddressK.setFont(font);
        labelAddressK.setText("주민 등록번호");

        jLabel63.setFont(font);
        jLabel63.setText("-");




        labelAddress_SK.setFont(font);
        labelAddress_SK.setText("주            소");

        labelPhonek.setFont(font);
        labelPhonek.setText("전  화  번  호");

        labelPhoneFD.setFont(font);
        labelPhoneFD.setText("-");

        labelPhoneSD.setFont(font);
        labelPhoneSD.setText("-");

        comboBoxDeptK.setFont(font);
        comboBoxDeptK.setText("부          서");

        comboBoxPositionK.setFont(font);
        comboBoxPositionK.setText("직          급");

        labelEmailK.setFont(font);
        labelEmailK.setText("이   메   일");

        labelAge_Gender.setFont(font);
        labelAge_Gender.setText("나  이 / 성  별");

        labelS2.setFont(font);
        labelS2.setText("/");

        btngetImage.setFont(font);
        btngetImage.setBackground(Color.WHITE);
        btngetImage.setForeground(Color.WHITE);
        btngetImage.setText("이미지 불러오기");
        
       
        labelEmpName.setFont(font);
        labelEmpName.setToolTipText("이름 입력");

        labelAddreddF.setFont(font);
        labelAddreddF.setToolTipText("주민등록번호 앞자리 입력(6자리)");

        labelAge.setFont(font);
        labelAge.setToolTipText("나이(숫자로 입력)");

        comboBoxGender.setFont(font);

        labelAddress_S.setFont(font);
        labelAddress_S.setToolTipText("실 거주지 주소 입력");
        labelPhoneF.setFont(font);
        labelPhoneS.setFont(font);
        labelPhoneT.setFont(font);
        labelEmailF.setFont(font);
        labelEmailF.setToolTipText("이메일 형식이 아니면 차후 불익을 받을수 있습니다.");
        comboBoxDept.setFont(font);
        comboBoxPosition.setFont(font);
        labelHiredateMK.setFont(font);
        labelHiredateMK.setText("월");
        labelHireDateM.setFont(font);
        labelHiredateD.setFont(font);
        labelHiredateY.setFont(font);
        labelHiredateYK.setFont(font);
        labelHiredateYK.setText("년");
        labelHiredateDK.setFont(font);
        labelHiredateDK.setText("일");
        labalPasswordK.setFont(font);
        labalPasswordK.setText("비   밀   번   호");
        labelPassword.setFont(font);
        

        GroupLayout infoPanelLayout = new GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(labelPhonek, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAddress_SK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEmpNameK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(labelHiredateK, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(labelAge_Gender, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelAddressK, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(labalPasswordK)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(labelAddreddF)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel63)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelAddreddS, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelEmpName)
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(labelHiredateY)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelHiredateYK)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelHireDateM)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelHiredateMK)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelHiredateD)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelHiredateDK))
                                    .addComponent(labelPassword))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btngetImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(labelAge)
                                .addGap(13, 13, 13)
                                .addComponent(labelS2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxGender))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(labelPhoneF)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPhoneFD)
                                .addGap(6, 6, 6)
                                .addComponent(labelPhoneS)
                                .addGap(11, 11, 11)
                                .addComponent(labelPhoneSD)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPhoneT))
                            .addComponent(labelAddress_S))
                        .addGap(21, 21, 21))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(comboBoxPositionK)
                                .addGap(40, 40, 40)
                                .addComponent(comboBoxPosition))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBoxDeptK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelEmailK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxDept)
                                    .addComponent(labelEmailF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(178, 178, 178))))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHiredateK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHiredateY)
                            .addComponent(labelHiredateYK)
                            .addComponent(labelHiredateMK)
                            .addComponent(labelHiredateDK)
                            .addComponent(labelHireDateM)
                            .addComponent(labelHiredateD))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labalPasswordK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEmpNameK, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(imagePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(labelEmpName)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddressK, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(labelAddreddS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddreddF)
                    .addComponent(btngetImage))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(labelS2)
                        .addComponent(labelAge)
                        .addComponent(comboBoxGender))
                    .addComponent(labelAge_Gender, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddress_SK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddress_S))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoneFD)
                    .addComponent(labelPhoneSD)
                    .addComponent(labelPhoneF)
                    .addComponent(labelPhoneS)
                    .addComponent(labelPhoneT)
                    .addComponent(labelPhonek, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailK, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmailF))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDeptK, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDept))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPositionK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPosition))
                .addGap(222, 222, 222))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(infoPanel, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }
  public EmpVO passinfo(){
		String pwd = labelPassword.getText().trim();
		  String name = labelEmpName.getText().trim();
		  String email = labelEmailF.getText().trim();
		  String hiredate = labelHiredateY.getText().trim()+"/"+labelHireDateM.getText().trim()+"/"+
				  								labelHiredateD.getText().trim();
		  String birthdate = labelAddreddF.getText().trim();
		  String p_num = labelPhoneF.getText().trim()+labelPhoneS.getText().trim()+labelPhoneT.getText().trim();
		  String address = labelAddress_S.getText().trim();
		  Object dcode1 =  comboBoxDept.getSelectedItem();
		  String dcode = (String)dcode1; 
		  Object gender =  comboBoxGender.getSelectedItem();
		  String sex = (String)gender;
		  Object position1 = comboBoxPosition.getSelectedItem();
		    String position =(String)position1;
		  String savenighttime = "0";
		  String saveage = labelAge.getText().trim();
		
		  EmpVO e = new EmpVO( pwd, name, sex, email, hiredate, birthdate,
					 p_num,  address, dcode,  position,  savenighttime,  saveage);
		  
		  return e;
  }

  
}
