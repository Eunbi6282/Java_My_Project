package chapter14.Ex08;
// 1. Exception�� ��ӹ޴� ����ڿ��� : �Ϲݿ���
	// 1-1 : ������ ������ ��� ���� �߻�
	// 1-2 : ������ 100���� �ʰ��ϴ� ��� ���� �߻�

class MinusException extends Exception{	//������ ���� ��� MinusException ���� �߻�
	public MinusException (){
		super();  	//Exception�� �⺻ ������ ȣ��
	};
	public MinusException (String message){	//���� �޼��� ���, e.getmessage();
		super(message);
	};
}

class OverException extends Exception{
	public OverException () {
		super();
	}
	public OverException (String message) {		//���� �޼��� ���, e.getmessage();
		super(message); //100 �̻��� ���� ������ ȣ��
	}
}

class AAA{
	int score;
	
	void checkScore(int score) throws MinusException, OverException{
		if (score < 0) {
			throw new MinusException("���� �߻�! ������ ���� �� �����ϴ�."); //���� �޼���
		}else if (score > 100) {
			throw new OverException("���� �߻�! 100���� �Ѵ� ���� �Է��� �� �����ϴ�.");
		} else {
			System.out.println("���������� �� �ԷµǾ����ϴ�. ");
			this.score = score;
			System.out.println("������ : " + this.score); //�׳� score�� ���� ���������� ��, 
				//this.score�� ����ؾ� ������ ������ ���� �޸𸮿� �ø��� ������ ���� ����!
		}
			
	}
}


public class UserException {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		// aaa.checkScore(0); //����ó�� �ʿ�
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		try {
			aaa.checkScore(95);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
