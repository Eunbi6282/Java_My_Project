package chapter17.Ex06;

import java.util.HashSet;
import java.util.Set;

// Set : �ߺ��� ���� ���� �� ����. 
	// equals() , hashCode() �޼��尡 ���ǵǾ� �־�� �Ѵ�. 
	// String, Integer Ŭ�������� equals() �޼���� hashCode()�� ������ �Ǿ� �ִ�.
	// Ư�� ��ü�� Set�� ������ ��� �ߺ� ������ ���� ���ϵ��� �ϱ� ���ؼ��� equals() �� hashCode()�޼��带 ������ �ؾ� �Ѵ�. 
	// ObjectŬ������ equals() �� hashCode() 
		// Object Ŭ������ equals()�޼���� == �� ����. 
			// == �� Stack �޸��� ���� ��
 
//equals(), hashCode() �޼��尡 ������ ���� ���� ����
class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}

// equals()�� ������, hashcode ������ x
class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // ��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü�� ������ Ư�� �ʵ��� ���� ��
		
		if(obj instanceof B) { //obj�� bŸ���� �����ϰ� ���� ���� �ٿ� ĳ����
			
		this.data = ((B)obj).data; // ���� : �߸� �ٿ�ĳ������ �� ��� : ��ܰ� �ٷ���
		return true;
		}
		return false;
	}
}
public class HashSetMechanism {
	public static void main(String[] args) {
		
		// 1. equals(), hashCode() �޼��尡 ������ ���� ���� ����
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2); //false
		
			// == : ����(stack)�޸��� ���� ��
		System.out.println(a1); 	//��ü���� ��� : ��Ű����.Ŭ������@���޸��ּ��� �ؽ��ڵ�(16����)
		System.out.println(a2);
		
		System.out.println(a1.equals(a2)); //false
			// �����Ǿ��� equals()< -Object�� equals() �� ==�� ����. 
		
		System.out.println(a1.hashCode() + " , " + a2.hashCode()); // �ؽ��ڵ� ��� (10����)
		
		hashSet1.add(a1);
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size()); // 2��� => 
		
		
		
	}

}
