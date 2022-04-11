package chapter18.Ex06;

//�޼��带 �����ϱ� ���ؼ��� return Ÿ�԰� �Ű������� �����ؾ� �Ѵ�.

interface A{
	void abc (B b, int k);  // B�� ��ü�� ��ǲ���� ����
}

class B{
	void bcd(int k) {  //�ν��Ͻ� �޼���
		System.out.println(k);
	}
}
public class RefOfInstanceMethod_Type_1_2 {
	public static void main(String[] args) {
		// �ν��Ͻ� �޼��� ���� Type2
		// �͸� �̳� Ŭ���� 
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (B b, int k) -> {b.bcd(k);}; 
		
		// �ν��Ͻ� �޼��� ����
		A a3 = B :: bcd;  // <== �ν��Ͻ� �޼����̳� B��ü�� ��ǲ�޾Ƽ� bcd�޼��� ȣ��.
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
	}
}
