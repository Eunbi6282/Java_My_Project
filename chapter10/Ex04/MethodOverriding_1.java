package chapter10.Ex04;

//메소드 오버라이딩

class Animal {
	void cry() {
	}
}

class Bird extends Animal{
	@Override
	void cry() {		//매개변수 타입 , 갯수, 접근제어자 확인 
		System.out.println("짹짹");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	@Override
	//void crry(){}		//crry를 부모에서 찾을 수 없음
		//crry사용할 경우 Override 없이 
	void cry() {
		System.out.println("멍멍");
	}
}
public class MethodOverriding_1 {
	public static void main(String[] args) {
		// 1. 각각의 타입으로 선언
		Animal aa = new Animal();
		Bird bbBird= new Bird();
		Cat ccCat = new Cat();
		Dog ddDog = new Dog();
		
		aa.cry();		//Animla 클래스의 cry()
		bbBird.cry();	//Bird 클래스의 cry()
		ccCat.cry();	//Cat 클래스의 cry()
		ddDog.cry();	// Dog 클래스의 cry()
		System.out.println("================");
		
		//2. Animal 타입으로 선언하고 +자식타입으로 생성 : 동적 바인딩에 의해서 부모의 cry()를 호출할 경우 자식의 
											// 오버로딩된 메소드로 바인딩 됨
		Animal abAnimal = new Bird(); //abAnimal은 Animal , Bird타입 내포. Animal 필드와 메소드만 접근
		Animal acAnimal = new Cat();  //acAnimal은 Animal, Cat타입 내포. Animal 필드와 메소드만 접근
		Animal adAnimal = new Dog();  //acAnimal은 Animal, Dog타입 내포. Animal 필드와 메소드만 접근
		
		abAnimal.cry();		//Animal의 cry()를 호출할 경우 동적 바인딩에 의해서 Bird클래스의 cry()를 호출 
		acAnimal.cry();		//Animal의 cry()를 호출할 경우 동적 바인딩에 의해서 Cat클래스의 cry()를 호출
		adAnimal.cry();		//Animal의 cry()를 호출할 경우 동적 바인딩에 의해서 Dog클래스의 cry()를 호출
		System.out.println("==================");
		
		//3. 객체 배열로 관리
		Animal[] animals = {abAnimal,acAnimal,adAnimal};
		//객체타입 배열명 = {객체, 객체, 객체}
		System.out.println("=======EnhancedFor=======");
		for (Animal k : animals) {
			k.cry();
		}
		System.out.println("=======For=======");
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
			
		}
	}

}
