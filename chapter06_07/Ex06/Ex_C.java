package chapter06_07.Ex06;

import chapter06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		//�ٸ� Ŭ������ ������/ public�� ����/ model, color -> �޸𸮷� ���� �Ұ�
				// model�� color �� setter�� public ���ؼ� ���� �־ ���
		
		C c = new C();		//�ٸ� ��Ű�� �̹Ƿ� import������� ��
		
		
		//company, model, color�� �ٸ� ��Ű������ ���� �Ұ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		c.maxSpeed = 250;		//�ٸ� ��Ű���� Ŭ���������� public, protected(��� ����)
		
		//setter�� ���ؼ� �޸��� ���� �ο� (setter -> public)
		c.setColor("����");
		c.setModel("���׽ý�");
		c.setmaxSpeed(300);
		
		c.print();
		
		
		

	}

}
