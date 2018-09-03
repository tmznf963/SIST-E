package kr.co.sist.libs.control;
import kr.co.sist.libs.model.EmployeeVO;

public class CalcControl {
	private EmployeeVO emp;
	public CalcControl(EmployeeVO emp) {
		this.emp = emp;
	}
	public void calc() {
		String empno = emp.getEmpno();
		String dname = SelectControl.getDepartment(emp.getEmpno().substring(0, 1));  //부서이름
		int hobonus = SelectControl.getHobongBonus(Integer.parseInt(emp.getEmpno().substring(1, 2))); //호급수당
		int familybonus = emp.getFamily() * 7000;   //가족수당
		int nightbonus = SelectControl.getNightBonus(emp.getNighthour());     //야간수당
		int gibon = SelectControl.getGibon(emp.getGiboncode());                         //기본급
		int sum = hobonus + gibon + nightbonus + familybonus; //총계
		double tax = hobonus * 0.1;    //세금
		int salary = sum - (int)tax;       //실수령액
		emp.setDname(dname);
		emp.setGibon(gibon);
		emp.setHobonus(hobonus);
		emp.setFamilybonus(familybonus);
		emp.setNightbonus(nightbonus);
		emp.setSum(sum);
		emp.setSalary(salary);
	}
}
