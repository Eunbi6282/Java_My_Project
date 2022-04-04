package chapter16.Ex11;


// 제너릭 클래스의 상속 :자식 클래스는 부모 클래스의 제너릭 변수 (T,V,T,E)와 같거나 더 많아야 한다.
class Parent<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
class Child1 <T> extends Parent<T>{ //제너릭 클래스를 상속받는 자식 클래스는 부모의 타입인 인자갯수와 겉거나 커야한다.
	
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
		// 1. 부모 제너릭 클래스 생성
		// Parent<String> parent = new Parent<String>();  //전체 완성된 구문
		// Parent<String> parent = new Parent();  // 뒤의 생성자 호출할 때는 생략 가능
		Parent<String> parent = new Parent<>(); // 이렇게도 가능
		
		parent.setT("부모 제너릭 클래스");
		System.out.println(parent.getT());
		
		Parent<Integer> i1 = new Parent();
		i1.setT(1);
		System.out.println(i1.getT()); 	
		
		// 2. 자식 클래스 1
		Child1 <String> child1 = new Child1<String>();
		child1.setT("자식1 제너릭 클래스");	//부모에서 상속된 메서드
		System.out.println(child1.getT());
		
		// 3. 자식 클래스 2
		Child2 <String, Integer> child2 = new Child2(); //T는 부모에서 상속되어서 내려옴, V는 자식에서 만듬
		child2.setT("자식2 - 제너릭 클래스");	// 부모클래스의 메서드
		child2.setV(100); // 자식 클래스의 메서드
		System.out.println(child2.getT());	// 부모의 메서드
		System.out.println(child2.getV());	// 자식의 메서드 
		
		
		
		
		
		
		
		

	}

}
