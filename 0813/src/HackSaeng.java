
public class HackSaeng {
	private int kor,eng;
	public HackSaeng(int kor, int eng) throws KoreanException, EnglishException{
		if(kor>=0 && kor <=100 && eng>=0 && eng <= 100)	{
			this.kor = kor;
			this.eng = eng;
		}else if(kor<0 || kor > 100) {
			throw new KoreanException("���������� ������ �߸��Ǿ����ϴ�.");//Exception �� �ڽ� (throws ���� �ʼ�)
		}else if(eng<0 || kor > 100) {
			throw new EnglishException("���������� ������ �߸��Ǿ����ϴ�.");//RuntimeException �� �ڽ�
		}
	}
}
