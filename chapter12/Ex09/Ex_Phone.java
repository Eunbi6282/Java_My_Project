package chapter12.Ex09;

public class Ex_Phone {
	public static void main(String[] args) {
		// 1. 타입이 SamSungPhone인 경우 
		SamgSungPhone s1 = new SamgSungPhone();
		s1.printLogo();		//인터페이스에서 상속되어서 내려온거임
		s1.sendCall();
		s1.receiveCall();
		s1.flash();
		
		System.out.println("===================");
		
		// 2. 타입을 PhoneInterFace로 업캐스팅
		PhoneInterFace s2 = new SamgSungPhone();
		s2.printLogo();
		s2.sendCall();
		s2.receiveCall();
		s2.receiveCall();
		
		SamgSungPhone ss = (SamgSungPhone)s2;  //PhoneInterFace => SamgSungPhone 타입변환
		ss.flash(); //flash 다운 캐스팅 후 출력
		

	}

}
