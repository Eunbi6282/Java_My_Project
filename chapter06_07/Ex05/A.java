package chapter06_07.Ex05;
	//���� ������(ĸ��ȭ : �����͸� �ܺηκ��� ��ȣ) : public, protected, default(�����ؼ� ���), private
		// Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ� �տ� 
		// Ŭ���� �̸� : public, default�� ��� ����
public class A {

	// private: �ܺ� Ŭ�������� ���� �Ұ� 
	private int m = 3;		
	private int n= 4;
	
	int a = 10;					//�ʵ��� �⺻ ���� �����ڴ� default : ������, ���� ��Ű�� �������� ���� ����
	int b = 50;					// default : �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�, ���� ��Ű���� �ٸ� 																		Ŭ�������� ���� ����
	public int k = 10;			//public : �ٸ� ��Ű������ ���� ����
	
	
	
	void print() {  //default : ���� ��Ű�� ���� Ŭ���������� ��� ����
		System.out.println("����Ʈ ����" + m);
		System.out.println("����Ʈ ����" + n);
		
	}
	
	public void print2() {		//public : �ٸ� ��Ű������ ���� ����
		System.out.println("�ܺ� ��Ű���� �ٸ� Ŭ�������� ���� ����" + k);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
