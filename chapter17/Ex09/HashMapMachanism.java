package chapter17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


// Map : Key�� �ߺ����� �ʾƾ� �� -> equals(), hashCode() ������ ������� ��
	// Value�� �ߺ��Ǿ ��.

//equals(), hashCode()�� ������ ���� �ʴ� Ŭ����
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data + " "; // ����Ÿ���� String�̾ ���� �־��ָ� String���� �ٲ�
	}
}

//equals()�� �������� Ŭ����
class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override  // ��ü�� �ʵ�(data�ʵ�)�� ���� ���ؼ� ������ ���� ���̴�. 
	public boolean equals(Object obj) {
		if(obj instanceof B) { //obj�� BŸ���� ������ ��
			if (this.data == ((B)obj).data){ // obj�� ObjectŸ������ ������ ���� data�� ���Ϸ��� BŸ������ �ٿ�ĳ�����ؾ� �Ѵ�. ) 
			return true;
			}
		}
			return false;
	}
	
	@Override
	public String toString() {
		return data + " "; // ����Ÿ���� String�̾ ���� �־��ָ� String���� �ٲ�
	}
	
}
//equals(), hachCode()�� �������� Ŭ���� => Map�� Key�� ����� �� �ִ�. 
class C{
	int data;
	public C(int data) {
		this.data = data;
	}
	
	@Override  // ��ü�� �ʵ��� ���� ���ؼ� ������ ���� ���̴�. 
	public boolean equals(Object obj) {
		if(obj instanceof C) { //obj�� BŸ���� ������ ��
			if (this.data == ((C)obj).data){ // obj�� ObjectŸ������ ������ ���� data�� ���Ϸ��� BŸ������ �ٿ�ĳ�����ؾ� �Ѵ�. ) 
			return true;
			}
		}
			return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data); // ���� ���
	}
	@Override
	public String toString() {
		return data + " "; // ����Ÿ���� String�̾ ���� �־��ָ� String���� �ٲ�
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		
		// 1. �� �޼��� ��� �������̵� ���� ���� ��� , �� ��ü ��� Map�� Key�� ��ϵȴ�. (���� ���� �ƴ�)
		Map<A, String> hashMap1 = new HashMap<>();
		A a1 = new A(3); 
		A a2 = new A(3);
		System.out.println(a1 == a2); //false , stack��
		System.out.println(a1.equals(a2)); //false -> �������̵� �ȵǾ��ֱ� ������
		
		hashMap1.put(a1, "ù��°");
		hashMap1.put(a2, "�ι�°");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1); //hashCode()�������̵� ���߱� ������ �ٸ� �ּҰ��� ������ ����
		
		// 2. equals()�� �������̵� �� BŬ����
		Map<B, String> hasMap2 = new HashMap<B, String>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2); // false
		System.out.println(b1.equals(b2)); //true -> �������ص�(data�ʵ��� ���� ������ true)
		
		hasMap2.put(b1, "ù��°");
		hasMap2.put(b2, "�ι�°");
		System.out.println(hasMap2.size()); // 2 -> hashCode()�������̵� ���߱� ������ ������ ��ü�� �ν�
		System.out.println(hasMap2); //hashCode()�������̵� ���߱� ������ �ٸ� �ּҰ��� ������ ����
		
		System.out.println("=======================");
		
		// 3. �ΰ� �� �������̵� �� ���(equals(), hashCode())
		Map<C, String> hashMap3 = new HashMap<>();
		C c1= new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2); //false  -> stack�� ���嵵�� ���� �ٸ�
		System.out.println(c1.equals(c2)); //true
		hashMap3.put(c1, "ù��°");
		hashMap3.put(c2, "�ι�°");
		System.out.println(c1.hashCode() + " , " + c2.hashCode()); //�� hashCode�� ����!! , // 34 -> 10���� ���
		System.out.println(hashMap3.size()); // 1
		System.out.println(hashMap3); //22 -> 16���� ǥ��
		
		
		
		
	}

}
