package chapter12.Ex03;

interface A{}
interface B{}

// 1. ���� �������̽� ���
class C implements A{} 	//CŬ������ A�������̽��� ����(���)

// 2. ���� �������̽� ���
class D implements A,B{} //�������̽��� ���� ���� (���)�� ����

// 3. Ŭ������ �������̽��� �ѹ��� ��� (extends�� implements�� ������ ���� �Ұ�)
	//Ŭ������ ���� ��� �Ұ�, �������̽��� ���� ��� ����

class E extends C implements A,B{}


public class Interface_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}