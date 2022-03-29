package Ex_T;
abstract class Animal {		//추상클래스 : 추상메소드가 하나이상 포함된 경우
							// 추상 클래스는 객체 생성 불가능, 타입은 생성가능
								// 자식클래스는 부모클래스의 메소드 구현시 오류를 방지함
							// 추상클래스는 추상클래스 내의 추상메소드를 자식 클래스에서 반드시 구현하도록 보장받는다. 
	String nameString;
	int age;
	
	abstract void cry();	//추상메소드 : 구현부가 없는 메소드
	abstract void run();
	
	@Override
	public String toString() {	//객체 자체를 출력시 메모리의 정보를 출력
		return "이름은 : " + nameString + " 나이는 : " + age;
	}
}

class Cat extends Animal{		//Cat이 Animal 클래스의 일부만 상속한 경우 -> abstract클래스
											//추상메소드 전부를 상속한 경우 -> 콘크리트 클래스(완전히 구현된)클래스
	Cat(String nameString, int age){
		this.nameString = nameString;
		this.age = age;
	}

	@Override
	void cry() {
		System.out.println("고양이는 야옹");
	}

	@Override
	void run() {
		System.out.println("고양이는 다리가 네개");
	}
}

class Tiger extends Animal{
	
	Tiger (String nameString, int age){
		this.nameString = nameString;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("호랑이는 어흥");
	}

	@Override
	void run() {
		System.out.println("호랑이는 다리가 네개");
	}
}

class Eagle extends Animal{
	Eagle(String nameString, int age){
		this.nameString = nameString;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("독수리는 짹짹..?");
	}

	@Override
	void run() {
		System.out.println("독수리는 다리가 두개");
	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이",10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리",15);
			
		// 1. Animal 배열객체에 저장 
		Animal[]animals = {a1,a2,a3};
		
		// 2. for문 사용해서 출력시 이름과 나이를 출력, cry와 run메소드 출력
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
			animals[i].cry();
			animals[i].run();
		}
		System.out.println("========================");
		//3 Enhanced For
		for (Animal k : animals) {
			System.out.println(k);
			k.cry();
			k.run();
		}
	}
}
