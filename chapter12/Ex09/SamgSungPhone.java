package chapter12.Ex09;

public class SamgSungPhone implements PhoneInterFace{
	
	//인터페이스의 메서드를 오버라이딩 해서 구현함
	@Override
	public void sendCall() {
		System.out.println("띠리리링~!~!~!~!");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받으세요!!");
	}
	
	// 추가적인 SamSungPhone 만의 기능을 추가
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}
