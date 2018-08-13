
public class HackSaeng {
	private int kor,eng;
	public HackSaeng(int kor, int eng) throws KoreanException, EnglishException{
		if(kor>=0 && kor <=100 && eng>=0 && eng <= 100)	{
			this.kor = kor;
			this.eng = eng;
		}else if(kor<0 || kor > 100) {
			throw new KoreanException("국어점수의 범위가 잘못되었습니다.");//Exception 의 자식 (throws 선언 필수)
		}else if(eng<0 || kor > 100) {
			throw new EnglishException("영어점수의 범위가 잘못되었습니다.");//RuntimeException 의 자식
		}
	}
}
