package chapter12.Ex09;

public interface PhoneInterFace {
	int TIMEOUT = 10000;	//public staic final����
	void sendCall();	//public abstract ����
	void receiveCall();
	
	default void printLogo() {
		System.out.println("�ΰ� ����մϴ�.");
	}
	
}
