package practice;
class Airplane{
	int m;
	void work() {
		System.out.println(m);
	}
//	A(){				// �����ڸ� �������� ������ �����Ϸ��� �⺻�����ڸ� �ڵ����� �߰�
//		
//	}
}

class Banana{
	int m ;
	void work() {
		System.out.println(m);
	}
}

//��ü ������ �����ڸ� ���ؼ� �ʵ��� �ʱⰪ�� �Ҵ��ϰ� ��ü ����
class C{
	int m;
	void work() {
		System.out.println(m); 	//�������� �Ѿ�� ��
	}
	C(int c){
		m = c;
	}
}
class D {
	int m,n,l,k;
	
	D () {}	// Class D�� �⺻ ������
	
	D (int m , int n, int l, int k){	//�Ű����� 4���� ������
		this.m = m;			//this ��� -> �Ű����� �� = ��ǲ�޴� ���� = �޸𸮿� �ø��� ���� 
		this.n = n;
		this.l = l;
		this.k = k;
	}
	
	D(int a, int b, int c){		//�Ű������� 3���� ������
		m = a;
		n=b;
		k = c;
	}
	
	void work() {		//work()�� ȣ��� �޸� ���� ���
		System.out.println("���� m�� �� : " + m);
		System.out.println("���� n�� �� : " + n);
		System.out.println("���� l�� �� : " + l);
		System.out.println("���� k�� �� : " + k);
	}
}
public class Ex01_DefaultConstructor {
	public static void main(String[] args) {
		
		//��ü ���� -> ���� �޼ҵ� �ȿ���
		
		Airplane a = new Airplane();		//�⺻ ������ ȣ��
		a.work();
		
		Banana banana = new Banana();		//�⺻������ ȣ��
		banana.work();
		
		C c = new C(3);		// ���� 1���� �Ű������� �޴� ������ ȣ��
							// ������ ȣ�� �� �⺻���� ��ǲ�ؼ� �޸� �ʵ忡 �ʱⰪ ����
		c.work();
		
		C ccC = new C(30);
		ccC.work();
		
		D d = new D();		//class D�� �⺻������
		d.work();
		
		D d2 = new D(3, 5, 7); 	// �Ű� ������ ���� ������ �޴� ������ ȣ��
		d2.work();
		
		D d3 = new D(55, 33, 90, 2);	//�Ű������� ���� �װ��� �޴� ������ ȣ��
		d3.work();
		//�����ε�: �޼ҵ���� ����( �����ڸ�, ������ Ÿ��, �Ű����� ����)�� ���� �ش� �޼ҵ带 �ε��Ѵ�.
	
	}

}
