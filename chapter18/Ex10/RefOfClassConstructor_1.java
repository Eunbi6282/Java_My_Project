package chapter18.Ex10;

interface A{
	B abc(int k);   // ����Ÿ���� B ��ü�� ����
}

class B{
	B(){
		System.out.println("ù��° ������");
	}
	B (int k) {
		System.out.println("�ι�° ������");
	}
}
public class RefOfClassConstructor_1 {
	public static void main(String[] args) {
		System.out.println("=================================");
		// �͸� �̳�Ŭ���� 
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(3);  //��ü�� BŸ������ ������
			}
		};
		
		// ���ٽ� ǥ��
		A a2 = (int k) -> {return new B(3);};   //(��ǲ��) -> {������}
		A a3 = k -> new B(3);  // ��� -> �Ű����� 1�� �޾Ƽ� �Ұ�ȣ, �Ű����� Ÿ�� ��������, return�� ����ȣ�� ��������
		
		// Ŭ���� ������ ����
		A a4 = B :: new; // B�� �ι�° ������ ȣ��
		
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		a4.abc(3);
	}
}
