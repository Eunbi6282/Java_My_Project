package chapter12.Ex09;

public interface PhoneInterFace {
	int TIMEOUT = 10000;	//public staic final생략
	void sendCall();	//public abstract 생략
	void receiveCall();
	
	default void printLogo() {
		System.out.println("로고를 출력합니다.");
	}
	
}
