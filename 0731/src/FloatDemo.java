
public class FloatDemo {
public static void main(String[] args) {
	float height = 175.3f;
	//�Ǽ��� �⺻���� double
	//(double)8����Ʈ�� (float)4����Ʈ�� ������.
	
	double avg = 89.5;
	System.out.printf("avg = %f\n",avg); //�Ǽ���
	System.out.printf("avg = %e\n",avg); //������
	
	double avg2 = 8.95e-03; //����
	System.out.printf("avg2 = %f\n",avg2); //�Ǽ���
	System.out.printf("avg2 = %e\n",avg2); //������
	
	float f = 0.123456789123456789f;
	double d = 0.123456789123456789;
	System.out.println("f = " +f);
	System.out.println("d = " +d);
}
}
