package kr.co.sist.control;

import java.util.Vector;

import kr.co.sist.model.EmpVO;

public class Calc {
private EmpVO e;
	public Calc(EmpVO emp) {
		this.e=emp;
		
}
	public void calc() {
		Vector<EmpVO> v4 =CountSelectionControl.getcountGeneralAffairs(); //총무부
		Vector<EmpVO> v2 =CountSelectionControl.getcountHumanResources(); //인사부
		Vector<EmpVO> v6 =CountSelectionControl.getcountProduction(); // 생산부
		Vector<EmpVO> v3 =CountSelectionControl.getcountPublicRelations(); //홍보부
		Vector<EmpVO> v5 =CountSelectionControl.getcountResearch(); //연구부
		Vector<EmpVO> v1 =CountSelectionControl.getcountSales(); //영업부

		String countGeneral = String.valueOf(v4.elementAt(0).getCount()+1); //총무부 총인원 
		String countHuman = String.valueOf(v2.elementAt(0).getCount()+1); //인사부 총인원 
		String countProduction = String.valueOf(v6.elementAt(0).getCount()+1); //생산부 총인원 
		String countPublic = String.valueOf(v3.elementAt(0).getCount()+1);//홍보부 총인원 
		String countResearch = String.valueOf(v5.elementAt(0).getCount()+1); //연구부 총인원 
		String countSales = String.valueOf(v1.elementAt(0).getCount()+1); //영업부 총인원 
		
		if(countGeneral.length()==1) { //총무부 0붙이기
			countGeneral="00"+countGeneral;
		}else if(countGeneral.length()==2) {
			countGeneral="0"+countGeneral;
		}
		if(countHuman.length()==1) { //인사부 0붙이기
			countHuman="00"+countHuman;
		}else if(countGeneral.length()==2) {
			countHuman="0"+countHuman;
		}
		if(countProduction.length()==1) { //생산부 0붙이기
			countProduction="00"+countProduction;
		}else if(countGeneral.length()==2) {
			countProduction="0"+countProduction;
		}
		if(countPublic.length()==1) { //홍보부 0붙이기
			countPublic="00"+countPublic;
		}else if(countPublic.length()==2) {
			countPublic="0"+countPublic;
		}
		if(countResearch.length()==1) { //연구부 0붙이기
			countResearch="00"+countResearch;
		}else if(countResearch.length()==2) {
			countResearch="0"+countResearch;
		}
		if(countSales.length()==1) { //영업부 0붙이기
			countSales="00"+countSales;
		}else if(countSales.length()==2) {
			countSales="0"+countSales;
		}
		
				
 //백터 풀기
		int age = Integer.parseInt(e.getSaveage());
		e.setAge(age); //나이
		int nighttime = Integer.parseInt(e.getSavenighttime());
		e.setNighttime(nighttime); //야근시간
		String dcode = e.getDcode();
		String hiredate = e.getHiredate();
		String position = e.getPosition();
		
		switch(position) { //직급
		case "사원" : e.setGibon(2400); break;
		case "주임" :e.setGibon(3400); break;
		case "대리" :e.setGibon(4400); break;
		case "과장" :e.setGibon(6400); break;
		case "차장" :e.setGibon(7400); break;
		case "부장" :e.setGibon(9400); break;
		case "이사" :e.setGibon(11400); break;
		case "사장" :e.setGibon(13400); break;
		}
		String insertHiredate = hiredate.substring(2, 10); //입사날짜
		e.setHiredate(insertHiredate);
		
		switch(dcode){ //사번
		case "영업부" : e.setEmpno("A"+countSales); break;
		case "인사부" : e.setEmpno("B"+countHuman); break;
		case "홍보부" : e.setEmpno("C"+countPublic); break;
		case "총무부" : e.setEmpno("D"+countGeneral); break;
		case "연구부" : e.setEmpno("E"+countResearch); break;
		case "생산부" : e.setEmpno("F"+countProduction); break;
		}
		
		int sum = e.getGibon();
		e.setSum(sum); //총금액
		int salary = sum*9/10;
		e.setSalary(salary);//실수령액
		
	}
}
	

