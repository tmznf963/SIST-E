
public class Calc {
	private Product[] array;
	private int count;
	
	public Calc(Product[] array, int count) { //생성자 Constructor
		this.array = array;
		this.count = count;
	}
	
	public void calc() {
		for(int i = 0 ; i < this.count ; i++) {
			Product p = this.array[i];
			int sell_p = p.getSu() * p.getSell_price(); //판매금액
			int buy_p = p.getSu() * p.getBuy_price(); //매입금액
			int fee = p.getFee();
			
			int b_p = sell_p - (buy_p+fee); //이익금
			p.setCost(b_p);
			
			double b_fit = (double)b_p / (double)buy_p *100.; //이익율
			p.setPer_cost(b_fit);

		}
	}

	
}//end
