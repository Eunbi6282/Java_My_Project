package chapter16.Ex12;


class Parent {
	
	//Number : Boolean, Character을 제외한 Wrapper(기본 데이터 타입을 객체형으로 바꿈)타입의 클래스가 올 수 있다. 
		// Byte, Short, Integer , Long, Float, Double
	<T extends Number> void print(T t) {	// 제너릭 메서드 : 일반클래스 내에 있어야 함
		System.out.println(t);
	}
}

class Child extends Parent{
	
}
public class InheritanceGenericMethod {

	public static void main(String[] args) {
		//1. 부모 클래스의 제너릭 메서드 사용
		Parent parent =new Parent();
		parent.<Integer>print(10);
		parent.<Double>print(100.855);
		//parent.<String>print("안녕"); 	// 오류 발생, Number만 들어갈 수 있다.
		parent.print(300); // 매개변수로 들어가는 값의 타입을 알 수 있는 경우 생략가능/
		parent.print(300.5555);
		
		// 2. 자식 클래스에서 제너릭 메서드 사용.
		Child child = new Child();
		child.<Integer>print(200);
		child.<Double>print(200.12345);
		

	}

}
