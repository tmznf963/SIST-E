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
             m.getCode(), m.getCost_k(),m.getCost_y(),m.getCost_c(),(m.getCost_c()+m.getCost_k()+m.getCost_y()));//���� �Ǹž� �Ǹž� �Ҹž� �Ǹŷ�
      sum += m.getSu();
    }
    System.out.printf("���հ��Ǹŷ� : %d \n", sum);
    
    for(int i=0; i < vector.size(); i++) {
       Music m = this.vector.elementAt(i);
       System.out.printf("�Էµ�����\n,%5d%5d%5d",m.getNum(),m.getCode(),m.getSu());
       
    
     }
}
 private void displayLabel() {
    System.out.println("                           <<���ݰ������α׷�>>");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    System.out.println("����   ��������Ǹž�     ���������Ǹž�   ��û�����Ǹž�    �Ǹŷ�");
    System.out.println("-------------------------------------------------------------------------------------------------------");
    
    
 }
}
