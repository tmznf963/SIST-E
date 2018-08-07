
public class Output {
   public void output (Db [] array ) {
      System.out.println
      ("================================================================");
      System.out.println
      ("구분\t 전화번호\t 이름\tt 기본요금\t 통화료\t 세금\t 합계\t");
      System.out.println
      ("-----------------------------------------------------------------");
      for (Db d : array) {
         d.display();
      }
      System.out.println
      ("-----------------------------------------------------------------");
   }

}