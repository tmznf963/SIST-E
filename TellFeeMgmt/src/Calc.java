public class Calc {
	private Db [] array;
	private int count;
	public Calc(Db [] array, int count){//������
		this.array = array;
		this.count = count;
	}
	public void calc(){//�޼ҵ�
		for(int i=0; i<this.count;i++) {
			Db db =array[i]; //���� ����
			
		      if(db.getNum()==1) {
		    	  db.setDef_tax(6000);
		      }else if(db.getNum()==2) {
		    	  db.setDef_tax(4800);
		      }else if(db.getNum() ==3) {
		    	  db.setDef_tax(3000);		    	  
		      }
			
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
