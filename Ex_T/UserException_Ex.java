package Ex_T;

import javax.naming.directory.SearchControls;

class MyAllException extends Exception{
	public MyAllException() {
		super();
	}
	public MyAllException(String message) {
		super(message);	//���� �޼��� ��� ,�ϳ��� �����ΰ� �������� ����
	}
}

class A{
	
	// private : ĸ��ȭ, ��ü������ �ٷ� �������� ���ϵ��� ����
		//setter�� �����ڷ� ���Ҵ�
	
	private String season;		//��, ����, ���� ,�ܿ︸ ���� �� ����, �ٸ����� ������ ����(���� �߻� : ��,����,����,�ܿ︸ �Է��ϼ���)
	private String week;  	//��,ȭ,��,��,��,��,�� ����(���ܹ߻� : ��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���)
	private int scoreKor; 	// 0~ 100���� �Է� (���� �߻� : 0���� 100���� ������ �Է��ϼ���)
	private int scoreEng;	// 0~ 100���� �Է� (���� �߻� : 0���� 100���� ������ �Է��ϼ���)
	private String userID; 	//12�� �̻�, 20�� ������ ���� Ȥ�� ����(���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)
	
	//�ϳ��� �޼���� ó��
	void studentInfo(String season, String week,int scoreKor,int scoreEng,String userID) throws MyAllException {
		if(season != "��" && season != "����" && season != "����" && season != "�ܿ�") {
			throw new MyAllException("��, ����, ���� ,�ܿ︸ ���� �� ����, �ٸ����� ������ ����(���� �߻� : ��,����,����,�ܿ︸ �Է��ϼ���)");
			
		}else if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��"){
			throw new MyAllException("��,ȭ,��,��,��,��,�� ����(���ܹ߻� : ��,ȭ,��,��,��,��,�ϸ� �Է��ϼ���)");
		}else if(scoreKor < 0 || scoreKor > 100){
			throw new MyAllException("0~ 100���� �Է� (���� �߻� : 0���� 100���� ������ �Է��ϼ���)");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException("0~ 100���� �Է� (���� �߻� : 0���� 100���� ������ �Է��ϼ���)");
		}else if(userID.length() < 12 && userID.length() > 20) {
			throw new MyAllException("12�� �̻�, 20�� ������ ���� Ȥ�� ����(���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�. ");
			this.season = season;
			this.week = week;
			this.scoreEng = scoreEng;
			this.scoreKor = scoreKor;
			this.userID = userID;
		}
		System.out.printf(season + " , " + week + " , " + scoreKor + ",\n" + scoreEng + " , " + userID);
	}
}

public class UserException_Ex {
	public static void main(String[] args) {
		A a = new A();
		
		//��� �ʵ��� ���� ���������� ����
		try {
			a.studentInfo("��", "��", 85, 88, "20270033333333");
		} catch (MyAllException e) {
			System.out.println(e.getMessage()); //return String
			//e.printStackTrace();  //void -> println�� ���� �� ����
		}
		
		//season �ʽ� �׽�Ʈ
		try {
			a.studentInfo("��", "��", 85, 88, "20270033333333");
		} catch (MyAllException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
