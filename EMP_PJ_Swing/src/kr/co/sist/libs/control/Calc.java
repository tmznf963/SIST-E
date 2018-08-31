package kr.co.sist.libs.control;


public class Calc {
	private EmpVO s;
	public Calc(EmpVO s) {
		this.s = s;
	}
	public void calc() {
		if(this.s.getE_code().charAt(0) =='A') {
			this.s.setD_name("康诀何");
		}else if(this.s.getE_code().charAt(0) =='B') {
			this.s.setD_name("诀公何");
		}else if(this.s.getE_code().charAt(0) =='C') {
			this.s.setD_name("全焊何");
		}else if(this.s.getE_code().charAt(0) =='D') {
			this.s.setD_name("牢荤何");
		}else if(this.s.getE_code().charAt(0) =='E') {
			this.s.setD_name("版府何");
		}else if(this.s.getE_code().charAt(0) =='F') {
			this.s.setD_name("魄盟何");
		}else if(this.s.getE_code().charAt(0) =='G') {
			this.s.setD_name("醚公何");
		}
		
		
		if(this.s.getE_code().charAt(1) =='1') {
			this.s.setG_s(900000);
		}else if(this.s.getE_code().charAt(1) =='2') {
			this.s.setG_s(400000);
		}else if(this.s.getE_code().charAt(1) =='3') {
			this.s.setG_s(600000);
		}else if(this.s.getE_code().charAt(1) =='4') {
			this.s.setG_s(800000);
		}else if(this.s.getE_code().charAt(1) =='5') {
			this.s.setG_s(300000);
		}else if(this.s.getE_code().charAt(1) =='6') {
			this.s.setG_s(800000);
		}else if(this.s.getE_code().charAt(1) =='7') {
			this.s.setG_s(800000);
		}
		
		
		
		if(this.s.getN_t() == 1) {
			this.s.setB_sal(15000);
		}else if(this.s.getN_t() ==2 ) {
			this.s.setB_sal(25000);
		}else if(this.s.getN_t() ==3 ) {
			this.s.setB_sal(350000);
		}else if(this.s.getN_t() ==4 ) {
			this.s.setB_sal(45000);
		}
		this.s.setF_s(this.s.getFam() * 7000);
		int sum = this.s.getG_s()+this.s.getB_sal()+this.s.getF_s();
		this.s.setSum(sum);
		int realgum = (int)(this.s.getG_s() *0.9);
		this.s.setR_m(realgum);
	}

}
	

