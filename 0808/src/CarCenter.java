
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
		System.out.println(so.toString()+" 잘 수리 됐습니다.");
	}
	void repair(Matiz mt) {
		System.out.println(mt.toString()+" 잘 수리 됐습니다.");
	}*/
	void repair(Car car) { //다형성 파라미터
		if(car instanceof Matiz) {//니가 마티즈니? (형변환 체크)
			System.out.println(car.toString()+" 잘 수리됐습니다.");
		}else if(car instanceof Sonata) {//참 or 거짓 (연산자 2항연산 관계연산)
			System.out.println(car.toString()+" 잘 수리됐습니다.");
		}else if(car instanceof Carnival) {
			System.out.println(car.toString()+" 잘 수리됐습니다.");
		}
	}
}
