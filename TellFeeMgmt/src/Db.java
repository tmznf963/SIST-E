
public class Db {
	private int num; //���� (�Է�)
	private String tel; // ��ȭ��ȣ (�Է�)
	private String name;//�̸� (�Է�)
	private int time; //��ȭ�� (�Է�)
	private int def_tax; //�⺻���
	private int price; //��ȭ��
	private double tax; //����
	private double sum; //�հ�
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
