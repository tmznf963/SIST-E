
public class Calc {
	private Pmp[] array;
	private int count;
	
	public Calc(Pmp[] array, int count) { //생성자 Constructor
		this.array = array;
		this.count = count;
	}
	
	public void calc() {
		for(int i = 0 ; i < this.count ; i++) {
			Pmp p = this.array[i];
			
			String code = p.getCode();//진료코드
			if(code.equals("MI")) p.setPart("외과");
			else if(code.equals("NI")) p.setPart("내과");
			else if(code.equals("SI")) p.setPart("피부과");
			else if(code.equals("TI")) p.setPart("소아과");
			else if(code.equals("VI")) p.setPart("산부인과");
			else if(code.equals("WI")) p.setPart("비뇨기과");
			
			int days = p.getDays(); //입원일수
			double sale = 0.; //할인비율
			if(days<10) sale = 1.0;
			else if(days >=10 && days<15) sale = 0.85;
			else if(days >=15 && days<20) sale = 0.80;
			else if(days >=20 && days<30) sale = 0.77;
			else if(days >=30 && days<100) sale = 0.72;
			else if(days >=100) sale = 0.68;
			
			int age = p.getAge();//나이
			if(age<10) p.setFee(7000);//진찰비
			else if(age >=10 && age<20) p.setFee(5000);
			else if(age >=20 && age<30) p.setFee(8000);
			else if(age >=30 && age<40) p.setFee(7000);
			else if(age >=40 && age<50) p.setFee(4500);
			else if(age >=50) p.setFee(2300);
			
			
			int one_day_cost = 25000;//1일 입원비
			if(days<4) one_day_cost = 30000;
			
			
			int all_cost = one_day_cost * days; //총입원비
			
			int cost = (int)(all_cost * sale); //입원비
			p.setCost(cost);
			
			int fee = p.getFee();//진찰비
			int price = fee+ cost;//진료비
			p.setPrice(price);


		}
	}

	
}//end
