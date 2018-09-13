package kr.co.sist.model;

public class EmpVO {
	private String empno;
	private String pwd;
	private String name;
	private String sex;
	private String email;
	private String hiredate;
	private String birthdate;
	private String p_num; //phone num
	private int sum;
	private int salary;
	private String address;
	private String dcode;
	private String dname;
	private String position;
	private int gibon;
	private int nighttime;
	private int nightbonus;
	private int age;
	private int count;
	private String saveage; //입력받은 int형을 임시로 string형으로 받음
	private String savenighttime;//입력받은 int형을 임시로 string형으로 받음
	public EmpVO(int count) { //각각의 부서의 인원을 알아오는 생성자
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getSavenighttime() {
		return savenighttime;
	}
	public void setSavenighttime(String savenighttime) {
		this.savenighttime = savenighttime;
	}
	public String getSaveage() {
		return saveage;
	}
	public void setSaveage(String saveage) {
		this.saveage=saveage;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getP_num() {
		return p_num;
	}
	public void setP_num(String p_num) {
		this.p_num = p_num;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getGibon() {
		return gibon;
	}
	public void setGibon(int gibon) {
		this.gibon = gibon;
	}
	public int getNighttime() {
		return nighttime;
	}
	public void setNighttime(int nighttime) {
		this.nighttime = nighttime;
	}
	public int getNightbonus() {
		return nightbonus;
	}
	public void setNightbonus(int nightbonus) {
		this.nightbonus = nightbonus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public EmpVO() {
		
	}
	public EmpVO(String empno,  String pwd) { //아이디 비밀번호 비교
		this.pwd = pwd;
		this.empno = empno;
		
	}
	public EmpVO(String name,  String dname, String empno) { //트리생성
		this.empno = empno;
		this.name = name;
		this.dname = dname;
	}
	public EmpVO( String pwd, String name, String sex, String email, String hiredate, String birthdate, //입력 다이얼로그
			String p_num, String address, String dcode, String position,String savenighttime,  String saveage) {

		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.hiredate = hiredate;
		this.birthdate = birthdate;
		this.p_num = p_num;
		this.address = address;
		this.dcode = dcode;
		this.position = position;
		this.savenighttime = savenighttime;
		this.saveage = saveage;
	}

	public EmpVO(String empno, String pwd, String name, String sex, String email, String hiredate, String birthdate, //사원정보 갱신
			String p_num, int sum, int salary, String address, String dcode, String dname,int age) {
		this.empno = empno;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.hiredate = hiredate;
		this.birthdate = birthdate;
		this.p_num = p_num;
		this.sum = sum;
		this.salary = salary;
		this.address = address;
		this.dcode = dcode;
		this.dname = dname;
		this.age = age;
	}
	public EmpVO(String position, int gibon) { //기본급
		this.position=position;
		this.gibon = gibon;
	}
	public EmpVO(int time, int bonus) { //야근수당
		this.nighttime=time;
		this.nightbonus=bonus;
	}

}