package chapter11.Ex05;

//추상 클래스를 사용해서 기능 구현하는 경우
abstract class Animal {		//추상 메서드가 하나라도 있으면 추상클래스로 만들기
	abstract void cry();		//추상 메소드 : 선언만 되어있고 구현부가 없는 메소드
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{

	@Override
	void cry() {
		System.out.println("멍멍");
	}
}
public class AbstractModifier_3 {

	public static void main(String[] args) {
		//추상클래스는 객체화 할 수 없다.
		//Animal a3 = new Animal(); //추상클래스는 객체화할 수 없다. 
		
		//But 타입으로는 지정 가능
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		a1.cry();
		a2.cry();
	}
}
