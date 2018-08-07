
public class Db {
	private int num; //구분 (입력)
	private String tel; // 전화번호 (입력)
	private String name;//이름 (입력)
	private int time; //통화량 (입력)
	private int def_tax; //기본요금
	private int price; //통화료
	private double tax; //세금
	private double sum; //합계
	public Db(int num, String tel, String name, int time) {
		this.num = num;
		this.tel = tel;
		this.name = name;
		this.time = time;
	}
	public int getDef_tax() {
		return def_tax;
	}
	public void setDef_tax(int def_tax) {
		this.def_tax = def_tax;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public int getNum() {
		return num;
	}
	public String getTel() {
		return tel;
	}
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
	public void display() {
		System.out.printf("%d %s %s %d %d %d %f %f \n",
				num,tel,name,time,def_tax,price,tax,sum);
	}
	

}
