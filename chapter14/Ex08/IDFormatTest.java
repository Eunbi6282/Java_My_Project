package chapter14.Ex08;

// --����� ���� ���� �����--
// ID�� ���� NULL�� ��� Exception �߻�
// userID�� 8�� �̻� , 20�ڰ� �ƴ� ��� Exception

//�Ϲ� ���� ���� - Exception ���
class IDFormatException extends Exception{	//������ �ΰ� �����
	public IDFormatException() {
			super();
	}
	public IDFormatException (String message) { 	//���� �߻� �� ���� �޼����� ���, 
		//e.getMessage(); -> �����ڿ��� �Ѿ�� message���� ���⼭ ȣ��
		super(message);
	}
}

public class IDFormatTest {
	
	private String userID;	//üũ :  null, 8�� �̻� �̰� 20�ڰ� �ƴ� ��� Exception
		//userID�� ĸ��ȭ �Ǿ��ִ�. -> private : �ܺο��� ���� �Ұ�, ���� Ŭ���������� ���� ����
			//���ֱ� -> 1. ������ , 2. setter ���ؼ� ���� �Ҵ�(�ܺο��� ���� �� ��ü ���� ���ϱ� ����)
		//private���� ������ ��� getter�� setter�� ����ؼ� ���� �ְų� ����� �� ����
	
	//getter
	public String getUserID() {		//�޼��� ȣ�� �� �޸��� userID�� ������
		return userID;
	}
	
	//setter : �޸𸮿� ���� �Ҵ��� ��/ ������ �־ control�� �� ����
	public void setUserID (String userID) throws IDFormatException {	//setUserID�� ȣ���ϴ� �ʿ��� ����ó�� ����� ��
		if (userID == null) {
			throw new IDFormatException("���̵�� Null�� �� �����ϴ�. ");
		}else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ��� �����մϴ�. ");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		//1. userID ���� null�� ���
		String userID = null;
		//test.setUserID(userID)  -> throw�� �޾Ƽ� ���� ó�� �ʿ�
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		} 	//setterȣ�� �� null(userID)���� �Է� �� ȣ��
		// null ��� -> if (userID == null)�� �ɷ� ���� �߻�
		
		System.out.println("==========================");
		
		// 2. userID �� 7�ڸ� ���� ���
		userID = "1234567";
		// test.setUserID(userID); -> throw�� �޾Ƽ� ���� ó�� �ʿ�
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); 	//���� �߻������Ƿ� ������ ���� �޼��� ��µ�
		}
		System.out.println("==========================");
		
		// 3. Null�� �ƴϰ� 8���̻� 20�� �̸��� ���(���� �߻� X)
		userID = "abcdefg1234";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		//��� �� �������� Ȯ�� �� �� ��������
		System.out.println(test.getUserID()); //private�̱� ������ getter�� ���� �� ��������
	}

}
