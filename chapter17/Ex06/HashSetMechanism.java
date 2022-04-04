package chapter17.Ex06;

import java.util.HashSet;
import java.util.Objects;
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

// equals()�� ������, hashCode ������ x
class B{
	int data;   	// �ΰ��� ��ü�� data�ʵ��� ���� ���� �� , �����ϴٶ�� �ĺ��ڸ� �־��־�� ��
						// equals(), hashCode()
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // ��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü�� ������ Ư�� �ʵ��� ���� ��
		
		if(obj instanceof B) { //obj�� bŸ���� �����ϰ� ���� ���� �ٿ� ĳ����
			
			if(this.data == ((B)obj).data) // ��ü���� data field�� ������ ��// ���� : �߸� �ٿ�ĳ������ �� ��� : ��ܰ� �ٷ���
			 return true;
		}
		return false;
	}
}

//equals()������ O, hashCode() ������ O
class C{
	int data;   	// �ΰ��� ��ü�� data�ʵ��� ���� ���� �� , �����ϴٶ�� �ĺ��ڸ� �־��־�� ��
						// equals(), hashCode()
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // ��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü�� ������ Ư�� �ʵ��� ���� ��
		
		if(obj instanceof C) { //obj�� bŸ���� �����ϰ� ���� ���� �ٿ� ĳ����
			
			if(this.data == ((C)obj).data) // ��ü���� data field�� ������ ��// ���� : �߸� �ٿ�ĳ������ �� ��� : ��ܰ� �ٷ���
			 return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {		//Objects.hash(�ʵ��, �ʵ��, �ʵ��) <= �������� �ʵ��� �ؽ��ڵ带 ���� ������ �� �ִ�. 
		//return Objects.hash(data);
		
		return data; 		//data�ʵ��� ���� ������ hashCode�� �����ϰ� ����.
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
		
		hashSet1.add(a1);  //Set�� �ߺ��� ���� ���� ���Ѵ�. 
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size()); // 2��� => equals()�� hashCode()�޼��尡 ������ �Ǿ����� �ʴ�. 
		
		// 2. equals()������ (��ü�� data�ʵ��� ���� ��), hashCode()�޼��尡 ������ ���� ���� ����
		Set<B> hashSet2 = new HashSet<B>();
		// Set�ȿ��� B��ü�� ����
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);  //Stack �޸��� ���� ��(�����ٸ� ������ ��ġ�� �ٸ� ��ġ���� ������ ����) -> false
		System.out.println(b1.equals(b2)); // �Ű������� b2������ 
			//if(obj instanceof B) { 
			//		if(this.data == ((B)obj).data) 
			//		 return true;
			//	}
			//	return false;
 		// -> equals�� ���� ���ϵ��� ������ �ص� -> true
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());  	//equals()�� ������ -> 2(�� ���� �������� ������ �ǹ�)
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		// 3. equals(), hashCode() ��� ������ 
		Set<C> hashSet3 = new HashSet<C>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2); // false -> ������ �ּҰ� ��
		System.out.println(c1.equals(c2)); // true -> ��ü�� data�ʵ��� ���� ���ϵ��� ������ �Ǿ�����
		System.out.println(c1.hashCode() + " , " + c2.hashCode());
			//�� ��ü�� ������ ��ü
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); // 1���� �Էµ� -> �� ���� �������� �ǹ�(equals()�� hashCode()�� ���ǵǾ��� ����)
		
		
		
	}

}
