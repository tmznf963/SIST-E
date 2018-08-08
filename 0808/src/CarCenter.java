
public class CarCenter {
	public static void main(String[] args) {
		CarCenter cc = new CarCenter();
		
		Sonata so = new Sonata("Silver Sonata");
		cc.repair(so);

		Matiz mt = new Matiz("Pink Matiz");
		cc.repair(mt);
		
		Carnival cn = new Carnival("White Carnival");
		cc.repair(cn);
	}

/*	void repair(Sonata so) { // Overloading
		System.out.println(so.toString()+" �� ���� �ƽ��ϴ�.");
	}
	void repair(Matiz mt) {
		System.out.println(mt.toString()+" �� ���� �ƽ��ϴ�.");
	}*/
	void repair(Car car) { //������ �Ķ����
		if(car instanceof Matiz) {//�ϰ� ��Ƽ���? (����ȯ üũ)
			System.out.println(car.toString()+" �� �����ƽ��ϴ�.");
		}else if(car instanceof Sonata) {//�� or ���� (������ 2�׿��� ���迬��)
			System.out.println(car.toString()+" �� �����ƽ��ϴ�.");
		}else if(car instanceof Carnival) {
			System.out.println(car.toString()+" �� �����ƽ��ϴ�.");
		}
	}
}
