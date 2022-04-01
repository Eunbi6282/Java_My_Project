package chapter16.Ex03;
// Object : ��� ��ä�� ������ �� ������, �ٿ�ĳ������ �ʿ��ϰ� ĳ���� �� ���ܰ� �߻��� �� �ִ�.(���� Ÿ�� üũ)
// ���ʸ� Ŭ���� : �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� �� �ִ�. 
//  ���ʸ� Ÿ�� ���� : T (Type),  K (Key), V(Value), N (Number-����), E(Element-����) 
	// A-Z ���� ���Ƿ� ���� �� �ִ�. 
	// wrapper Ŭ���� : �⺻Ÿ���� ��üȭ ���ѳ��� Ŭ����
		// int(�⺻Ÿ��) ==> Integer(��ü), boolean ==> Boolean , char ==> Character, 
		// double ==> Double, float ==> Float 
		// byte ==> Byte , short ==> Short , long ==> Long

class MyClass<T>{		//<  > �ȿ� ������ Ÿ�� ��
	private T t;
	public T get() {		// getter �ʵ��� ���� ��������
		return t;
	}
	public void set(T t) {	//setter ->�ʵ��� ���� �Ҵ�
		this.t=t;
	}
}
public class SingleGenericArgunment {

	public static void main(String[] args) {
		// 1. ���ʸ� Ŭ���� ��ü ���� <String>�� �Է�
		MyClass<String>mc1 = new MyClass<String>() ;	//wrapperŬ������ �Ҵ��ؾ� �Ѵ�.
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		// 2. ���ʸ� Ŭ���� ��ü ���� <Integer>�� �Է�
		MyClass<Integer> mc2 = new MyClass<Integer>();	//wrapperŬ������ �Ҵ��ؾ� �Ѵ�. 
		mc2.set(100);
		System.out.println(mc2.get());
		
		// 3. ���ʸ� Ŭ���� ��ü ���� <Double>�� �Է� 
		MyClass<Double> mc3 = new MyClass();	// �������� �ڷ����� ���� �����ϴ�. 
		mc3.set(3330333.333);
		System.out.println(mc3.get());
		
		// 4. ���� Ÿ�� üũ (������ �ܰ迡�� ������ ���)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();	
		mc4.set(true);
		//mc4.set("�ȳ�"); -> ���� , Boolean�� true false�� ����
			// ���� Ÿ�� üũ -> �����ϴܰ迡�� ���� ǥ��(������� ������ ���� ������)
		
		
		
	}

}
