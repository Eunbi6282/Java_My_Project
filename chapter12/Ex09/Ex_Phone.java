package chapter12.Ex09;

public class Ex_Phone {
	public static void main(String[] args) {
		// 1. Ÿ���� SamSungPhone�� ��� 
		SamgSungPhone s1 = new SamgSungPhone();
		s1.printLogo();		//�������̽����� ��ӵǾ �����°���
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("===================");
		
		// 2. Ÿ���� PhoneInterFace�� ��ĳ����
		PhoneInterFace s2 = new SamgSungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		s2.receiveCall();
		
		SamgSungPhone ss = (SamgSungPhone)s2;  //PhoneInterFace => SamgSungPhone Ÿ�Ժ�ȯ
		ss.flash(); //flash �ٿ� ĳ���� �� ���
		

	}

}
