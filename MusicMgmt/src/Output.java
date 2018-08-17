import java.util.Vector;

class Output {
   private Vector<Music> vector;
   public Output(Vector<Music> vector) {
      this.vector = vector;
   }

 public void output() {
    this.displayLabel();
    int sum =0;
    for(int i = 0; i < vector.size(); i++) {
       Music m = this.vector.elementAt(i);
       System.out.printf("%-5s %20d %20d %20d %5d \n",
             m.getCode(), m.getCost_k(),m.getCost_y(),m.getCost_c(),(m.getCost_c()+m.getCost_k()+m.getCost_y()));//종류 판매액 판매액 팬매액 판매량
      sum += m.getSu();
    }
    System.out.printf("총합계판매량 : %d \n", sum);
    
    for(int i=0; i < vector.size(); i++) {
       Music m = this.vector.elementAt(i);
       System.out.printf("입력데이터\n,%5d%5d%5d",m.getNum(),m.getCode(),m.getSu());
       
    
     }
}
 private void displayLabel() {
    System.out.println("                           <<음반관리프로그램>>");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    System.out.println("종류   경기지역판매액     영남지역판매액   충청지역판매액    판매량");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    
    
 }
}
