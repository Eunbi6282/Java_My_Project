package chapter06_07.Ex04;

/*������ thisŰ���� �ڵ� �߰�*/
//1. Ŭ���� ���ο��� �ʵ�, �޼��� �̸� �տ� �ڵ����� thisŰ���尡 ���� 
	// this Ű�� ��ü�� �ʵ�� ��ü�� �޼ҵ带 ��Ī, 
class A {
	int m;
	int n;
	
	// A() {}  	   -> �⺻������ ������
	
	void initt (int a, int b) {		// ���� a,b,c�� �������� (Stack ������ ������� ���� ����), 
									// initt()�޼ҵ� ������, stack������ ������ �ǰ� �޼ҵ尡 ������ ������
		int c;
		c = 3;
		this.m = a;			// this Ű�� �������� ��, �����Ϸ��� �ڵ����� �߰� 
		this.n = b;			// this Ű�� �������� ��, �����Ϸ��� �ڵ����� �߰� 
	}
	
	void work() {
		this.initt(2, 3);		//�޼ҵ� �տ� this -> ��ü �ڱ��ڽ� 
		System.out.println(this.m + " " + this.n);  //this ��������, ������ �����Ϸ��� �ڵ����� �߰� 
	}
}
public class ThisKeyword_1 {
	public static void main(String[] args) {
		
		// 2. ��ü ����
		
		A a = new A();
		
		// 3. �޼��� ȣ��
		a.work();
		
		
	}

}
