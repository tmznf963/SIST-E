
public class Calc {
	public void calc(Db[] array){
		for(int i=0; i<array.length;i++) {
			Db db =array[i]; //���� ����
			int price = db.getTime() * 12; //��ȭ��*1��ȭ(12��)
			db.setPrice(price);
			double tax = (db.getDef_tax()+price) * 0.1; //��ȭ��*10%
			db.setTax(tax);
			
			double sum = db.getPrice() + db.getTax() + db.getDef_tax();
			//�հ� =��ȭ�� + ���� + �⺻���
			
			db.setSum(sum);
		}
	}
}
