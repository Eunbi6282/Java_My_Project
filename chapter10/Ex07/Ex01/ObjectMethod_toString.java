package chapter10.Ex07.Ex01;

//ObjectŬ������ toString �޼ҵ� : ��ü�� ����� �� Object toString()ȣ��
	//toString() : ��Ű����.Ŭ������@�ؽ��ڵ� 
	// �ؽ� �ڵ� : ��ü�� ����Ű�� �ִ� ���޸��� ������ �ؽ��ڵ�� ��ȯ
	// �������ؼ� ��� : ��ü�� ������ ���,(�ʵ尪 , �޼ҵ� ȣ��)

class A{
	int m = 3;
	int n = 4;
}
class B{	//extends Object (����)
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {		//b��ü�� ������ ��µ�
		return "a : " + a + " , b : " + b;
	}
}

public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);	//��Ű����.Ŭ������.�ؽ��ڵ�, chapter10.Ex07.Ex01.A@32d2fa64(16����)
		System.out.println(a.toString());
		System.out.printf("%x\n" , a.hashCode());	//��ü�� �ؽ��ڵ常
		// %x\n -> 16������ ���
		//printf("<����>", );
		System.out.println(a.hashCode());  //10������ ��µ�
		
		B b= new B();
		System.out.println(b);
	}

}
