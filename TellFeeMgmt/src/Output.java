
public class Output {
	private Db [] array;
	private int count;
	public Output(Db [] array , int count) { //������ = ������� �ʱ�ȭ
		this.array = array;
		this.count = count;
	}
   public void output () {
      System.out.println
      ("================================================================");
      System.out.println
      ("����\t ��ȭ��ȣ\t �̸�\tt �⺻���\t ��ȭ��\t ����\t �հ�\t");
      System.out.println
      ("-----------------------------------------------------------------");
      /*
      for (Db d : array) {
         d.display();
      }
      */
      for(int i = 0 ; i<this.count ; i++) {
    	  this.array[i].display();
      }
      System.out.println
      ("-----------------------------------------------------------------");
   }

}