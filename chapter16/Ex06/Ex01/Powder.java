package chapter16.Ex06.Ex01;

//GenericPrinter�� ���� ��ü[���]

public class Powder extends Material {	//�߻�Ŭ������ ���
	public void doPrinting(){	//�߻� �޼��带 ����
		System.out.println("�Ŀ�� ���� ����մϴ�.");
	}
	@Override
	public String toString() {
		return "���� �Ŀ���Դϴ�.";
	}
}
