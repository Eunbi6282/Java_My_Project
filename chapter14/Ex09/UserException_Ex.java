package chapter14.Ex09;

class A{
	String season;		//��, ����, ���� ,�ܿ︸ ���� �� ����, �ٸ����� ������ ����(���� �߻� : ��,����,����,�ܿ︸ �Է��ϼ���)
	String week;  	//��,ȭ,��,��,��,��,�� ����(���ܹ߻� : ��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���)
	int scoreKor; 	// 0~ 100���� �Է� (���� �߻� : 0���� 100���� ������ �Է��ϼ���)
	int scoreEng;	// 0~ 100���� �Է� (���� �߻� : 0���� 100���� ������ �Է��ϼ���)
	String userID; 	//12�� �̻�, 20�� ������ ���� Ȥ�� ����(���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)
	
	 void checkKorscores(int scoreKor) throws RangeException{
		if (scoreKor < 0 || scoreKor > 100) {
			throw new RangeException("���� �߻� : 0���� 100���� ������ �Է��ϼ���");
		}
		else {
			this.scoreKor = scoreKor;
			System.out.println("���� ���� : " + this.scoreKor);
		}
	}
	 void checkEngscores(int scoreEng) throws RangeException{
		if (scoreEng < 0 || scoreEng > 100) {
			throw new RangeException("���� �߻� : 0���� 100���� ������ �Է��ϼ���");
		}
		else {
			this.scoreEng = scoreEng;
			System.out.println("���� ���� : " + this.scoreEng);
		}
	}
	 void checkSeason(String season) throws WordException {
		if(season != "��"  &&  season != "����" &&  season != "����" &&  season != "�ܿ�" ) {
			throw new WordException("���� �߻� : ��,����,����,�ܿ︸ �Է��ϼ���");
		}else {
			this.season = season;
			System.out.println("������ : " + this.season + "�Դϴ�.");
		}
	}
	
	 void checkWeek(String week) throws WordException {
		if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��") {
			throw new WordException("���ܹ߻� : ��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���");
		}else {
			this.week = this.week;
			System.out.println("������ : " + this.week + "���� �Դϴ�.");
		}
	}
	
	 void checkUserID(String userID) throws RangeException{
		if (userID.length() < 12 || userID.length() > 20) {
			throw new RangeException("���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������");
		}
		else {
			this.userID = userID;
			System.out.println("������� ID�� : "+ this.userID + "�Դϴ�.");
		}
	}
	
}

class WordException extends Exception{		//�ٸ� ���ڰ� ������ ���� �߻�
	public WordException(){
		super();
	}
	public WordException(String message) {
		super(message);
	}
}
class RangeException extends Exception{		//���� ����� ���� �߻�
	public RangeException () {
		super();
	}
	public RangeException (String message) {
		super(message);
	}
}

public class UserException_Ex {

	public static void main(String[] args) {
		//��ü ����
		A a = new A();
		
		//���� ó�� + ���
		
		//��������
		try {
			a.checkEngscores(82);
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("==========");
		
		//��������
		try {
			a.checkKorscores(55);
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========");
		
		// ����
		try {
			a.checkSeason("����");
		} catch (WordException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===========");
		//��
		try {
			a.checkWeek("����");
		} catch (WordException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=============");
		
		//����� Id
		try {
			a.checkUserID("20170033��������������������");
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
