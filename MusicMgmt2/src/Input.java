import java.util.ArrayList;
import java.util.Scanner;

class Input {// Input Class 멤버변수 선언.
	private ArrayList<Account> array;
	private Scanner scan;
	
	Input(ArrayList<Account> array){//생성자에서 멤버변수 초기화
		this.array = array;
		scan = new Scanner(System.in);
	}
	void input(){//input 메소드
		int count = 0;//반복문 갯수
		char y_n = '\0';// 캐릭터형 초기값
		do{
			count++;
			System.out.print("소매점번호 : ");
			int no = this.scan.nextInt(); //int 값을 Scanner로 받기 위해
			System.out.print("음악종류코드 : ");
			String code = this.scan.next();//String값을 Scanner로 받기 위해
			System.out.print("판매수량 : ");
			int su = this.scan.nextInt();
			System.out.print("입력/출력(I/O) ? : ");
			y_n = this.scan.next().charAt(0);//charAt(0) == 0번째 인덱스의 String값 비교
			Account account = new Account(no, code, su);
			this.array.add(count - 1, account);
		}while(count <= 7 && (y_n == 'i' || y_n == 'I'));//7번 이하 이거나 i or I 를 누를경우 Do-while 반복
	}
}
