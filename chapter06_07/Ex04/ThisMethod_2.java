package chapter06_07.Ex04;

import javax.crypto.AEADBadTagException;

//Aaa Ŭ������ �������� �����ڸ� ����� ��� this(); ���� ����� ��� -> �ߺ��� ���� �Ź� �Է��ؾ� ��
class Aaa{					
	int m1, m2, m3, m4;		//�ʵ� 4�� ����
	
	Aaa(){					// ������ : �Ű������� ���� ������
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aaa(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {					//�� �޸��� ���� ���.... V'.'V 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
	// Aaa Ŭ������ �������� �����ڸ� ����� ��� this(); ���� ����� ��� -> �ߺ��� ���� �Ź� �Է��ؾ� ��
}

// Aaa Ŭ������ �������� �����ڸ� ����� ��� this(); ����� ��� 
class Bbb {
	int m1, m2, m3, m4;
	
	Bbb(){
		m1 = 1; m2 = 2; m3 = 3; m4 = 4; //�ʱⰪ �Ҵ�
	}
	
	Bbb(int a) {
		this();
		m1 = a;
	}
	
	Bbb(int a, int b){
		this(a);			//�Ű����� 1�� ������ ȣ��
		m2 = b;
	}
	
	void print() {					//�� �޸��� ���� ���.... V'.'V 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}

public class ThisMethod_2 {

	public static void main(String[] args) {
		// 1. ������ ��ü ����(this �̻��)
		Aaa a1 = new Aaa(); 	//�Ű������� ���� ������ ȣ��
		Aaa a2 = new Aaa(10);	// �Ű������� �ϳ��� ������ ȣ��
		Aaa a3 = new Aaa(10, 20); // �Ű� ������ 2���� ������ ȣ��
				
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println("========================================");
		Bbb b1 = new Bbb();
		Bbb b2 = new Bbb(10); 		//Bbb�� �Ű����� �ϳ� �� ������ ȣ��
		Bbb b3 = new Bbb(10, 20);	//Bbb�� �Ű����� �ΰ��� ������ ȣ��
		
		b1.print();			// 1 2 3 4
		b2.print();			// 10 2 3 4
		b3.print();			// 
	}

}
