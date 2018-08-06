
public class Calc {
	public void calc(Db[] array){
		for(int i=0; i<array.length;i++) {
			Db db =array[i]; //명세서 생성
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
