package chapter16.Ex06.Ex01;

//GenericPrinter�� ���� ��ü[���]

public class Plastic extends Material {

	public void doPrinting() {	//�߻�޼����� Ŭ������ ������ �޼��� 
		System.out.println("�ö�ƽ ���� ����մϴ�. ");
	}
	@Override
	public String toString() {
		return "���� �ö�ƽ�Դϴ�.";
	}
}
