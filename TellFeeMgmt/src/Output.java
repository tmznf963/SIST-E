
public class Output {
	private Db [] array;
	private int count;
	public Output(Db [] array , int count) { //생성자 = 멤버변수 초기화
		this.array = array;
		this.count = count;
	}
   public void output () {
      System.out.println
      ("================================================================");
      System.out.println
      ("구분\t 전화번호\t 이름\tt 기본요금\t 통화료\t 세금\t 합계\t");
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