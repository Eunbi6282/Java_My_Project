package chapter10.Ex05;
class A{
	A (){} 	//�⺻������ : Ŭ�������� �ٸ� �����ڰ� �������� ���� ��� �������� 
	//�ν��Ͻ� �޼ҵ� �������̵� : ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵��ȴ�.
		// ��Ӱ��迡�� �ν��Ͻ� �ʵ�, stack �ʵ�, static �޼ҵ�� �������̵� ���� �ʽ��ϴ�. 
		// �������̵� �� ���� �ñ״�ó�� ���ƾ� ���. ����Ÿ��, �޼ҵ��, �Ű�����Ÿ��, �Ű����� ����
	void print() {
		System.out.println("Class A ���");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("Class B ���");
	}
}

class C extends A{
	@Override
	void print() {
		System.out.println("Class C ���");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		//1. A Ÿ��, A ������
		A a = new A();
		a.print();
		
		//2. BŸ��, B������
		B b = new B();
		b.print();
		
		//3. CŸ��, C������
		C c = new C();
		c.print();
		
		System.out.println("==================");
		//4. AŸ��, B������(�������̵� �����)	
			//Ŭ���� A�� print()ȣ�� �� B�� print() ��µ�
		A ab = new B();
		ab.print(); 	//A�� print()ȣ�� , but �������̵��Ǿ� B�� print()�� ���
		
		A ac = new C();
		ac.print();
		
		A[] arr = {ab,ac};	//�迭�� AŸ���� ��ü�� ����
		
		for(int i = 0 ; i <arr.length; i++) {
			arr[i].print();
		}	
		System.out.println("====enhacrd pointer");
		for (A a2 : arr) {
			
		}
		
		
	}

}
