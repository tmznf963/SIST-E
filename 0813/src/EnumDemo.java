
public class EnumDemo {
	public static void main(String[] args) {
		//Week w = new Week();// new �� ��. enum�� protected ��
		Week w = Week.FRI;	//�������̸�.�����
		Week [] array = w.values();
		
		for(Week week : array) {
			System.out.println(week+ " --> " + week.ordinal() +
					" --> "+week.display());//0���� �����ϴ�
		}
	}
}
//enum.ordinal() ������ 