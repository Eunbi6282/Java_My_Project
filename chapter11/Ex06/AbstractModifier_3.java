package chapter11.Ex06;

abstract class Animal {		//추상클래스 : 추상메소드가 하나이상 포함된 경우
							// 자식클래스는 부모클래스의 메소드 구현시 오류를 방지함
	String nameString;
	int age;
	
	abstract void cry();	//추상메소드 : 구현부가 없는 메소드
	abstract void run();
	
	@Override
	public String toString() {
		return "이름은 : " + nameString + " 나이는 : " + age;
	}
}

class Cat extends Animal{
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
