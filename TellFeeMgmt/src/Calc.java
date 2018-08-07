public class Calc {
	private Db [] array;
	private int count;
	public Calc(Db [] array, int count){//생성자
		this.array = array;
		this.count = count;
	}
	public void calc(){//메소드
		for(int i=0; i<this.count;i++) {
			Db db =array[i]; //명세서 생성
			
		      if(db.getNum()==1) {
		    	  db.setDef_tax(6000);
		      }else if(db.getNum()==2) {
		    	  db.setDef_tax(4800);
		      }else if(db.getNum() ==3) {
		    	  db.setDef_tax(3000);		    	  
		      }
			
			int price = db.getTime() * 12; //통화량*1통화(12원)
			db.setPrice(price);
			double tax = (db.getDef_tax()+price) * 0.1; //통화료*10%
			db.setTax(tax);
			
			
			
			double sum = db.getPrice() + db.getTax() + db.getDef_tax();
			//합계 =통화료 + 세금 + 기본요금
			
			db.setSum(sum);
		}
	}
}
