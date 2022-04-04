package chapter16.Ex11;


// ���ʸ� Ŭ������ ��� :�ڽ� Ŭ������ �θ� Ŭ������ ���ʸ� ���� (T,V,T,E)�� ���ų� �� ���ƾ� �Ѵ�.
class Parent<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
class Child1 <T> extends Parent<T>{ //���ʸ� Ŭ������ ��ӹ޴� �ڽ� Ŭ������ �θ��� Ÿ���� ���ڰ����� �Ѱų� Ŀ���Ѵ�.
	
}
class Child2 <T, V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}


public class InheritanceGeneric {

	public static void main(String[] args) {
		// 1. �θ� ���ʸ� Ŭ���� ����
		// Parent<String> parent = new Parent<String>();  //��ü �ϼ��� ����
		// Parent<String> parent = new Parent();  // ���� ������ ȣ���� ���� ���� ����
		Parent<String> parent = new Parent<>(); // �̷��Ե� ����
		
		parent.setT("�θ� ���ʸ� Ŭ����");
		System.out.println(parent.getT());
		
		Parent<Integer> i1 = new Parent();
		i1.setT(1);
		System.out.println(i1.getT()); 	
		
		// 2. �ڽ� Ŭ���� 1
		Child1 <String> child1 = new Child1<String>();
		child1.setT("�ڽ�1 ���ʸ� Ŭ����");	//�θ𿡼� ��ӵ� �޼���
		System.out.println(child1.getT());
		
		// 3. �ڽ� Ŭ���� 2
		Child2 <String, Integer> child2 = new Child2(); //T�� �θ𿡼� ��ӵǾ ������, V�� �ڽĿ��� ����
		child2.setT("�ڽ�2 - ���ʸ� Ŭ����");	// �θ�Ŭ������ �޼���
		child2.setV(100); // �ڽ� Ŭ������ �޼���
		System.out.println(child2.getT());	// �θ��� �޼���
		System.out.println(child2.getV());	// �ڽ��� �޼��� 
		
		
		
		
		
		
		
		

	}

}
