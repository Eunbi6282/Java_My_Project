package chapter12.Ex09;

public class SamgSungPhone implements PhoneInterFace{
	
	//�������̽��� �޼��带 �������̵� �ؼ� ������
	@Override
	public void sendCall() {
		System.out.println("�츮����~!~!~!~!");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ ��������!!");
	}
	
	// �߰����� SamSungPhone ���� ����� �߰�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
}
