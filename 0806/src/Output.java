
public class Output {
   public void output (Db [] array ) {
      System.out.println
      ("================================================================");
      System.out.println
      ("���� ��ȭ��ȣ\t �̸�\t �⺻���\t ��ȭ��\t ����\t �հ�\t");
      System.out.println
      ("-----------------------------------------------------------------");
      for (Db d : array) {
         d.display();
      }
      System.out.println
      ("-----------------------------------------------------------------");
   }

}