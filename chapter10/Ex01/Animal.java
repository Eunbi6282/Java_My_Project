package chapter10.Ex01;

class Tiger extends Animal{
	int leg;
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아 먹습니다. ");
	}
}

class Dog extends Animal{
	int dog;
	void dogEat(){
		System.out.println("개는 잡식성입니다.");
	}
}

class Dog_sub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog의 자식 클래스 입니다.");
	}
}

class Eagle extends Animal{
	int eagle;
	void eagleFly() {
		System.out.println("독수리는 날아다닙니다. ");
	}
}
 
public class Animal {
	String nameString;  	//동물의 이름
	int age;				//동물의 나이
	String colorString;		//동물의 색
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다. ");
	}
	
	
	
	public static void main(String[] args) {
		
		// 업캐스팅은 다형성으로 처리하기 때문에 아주아주 효율적으로 프로그램을 처리할 수 있다. 
				//다형성 : 오버라이딩을 이용해서 상속에서 하나의 메소드로 여러정보를 처리
		
		// 1. Animal 클래스 객체와
		Animal a1 = new Animal();	//자신의 필드와 메소드만 사용 가능
		
		// 2. Dog클래스를 Dog타입으로 객체화
		Dog d1 = new Dog();			// Animal, Dog의 필드와 메소드 접근
		
		// 3. Dog클래스를 Animal타입으로 업캐스팅
		Animal a2 = new Dog();		//a2는 Animal, Dog를 내포하고 있고, Animal의 필드와 메소드만 접근 
		
		// 4. Dog_sub를 Animal타입으로 업캐스팅
		Animal a3 = new Dog_sub();	//a3는 Animal, Dog, Dog_sub를 내포하고 있고, Animal의 필드와 메소드만 접근 가능
			a3.nameString = "비숑";
			// a3.dog = 6;  오류 ->  
			
		
		// 5. Dog_sub를 Dog 데이터 타입으로 업캐스팅
		Dog d2= new Dog_sub();		//d2는 Animal, Dog, Dog_sub를 내포하고 있고 , Animal과 Dog의 필드와 메소드를 사용
			d2.nameString="셰퍼트";
			d2.dog = 5;
			// d2.dog_sub = 3; 오류 -> Dog_sub는 접근할 수 없다. 
		
		// 6. Dpg_sub를 Dog_sub데이터 타입으로 객체화
		Dog_sub ds1 = new Dog_sub();
			// ds1은 Animal,Dog, Dog_sub 를 내포라고 있고, 모두 사용 가능
			ds1.nameString = "진돗개";		//Animal 클래스
			ds1.age = 4;
			ds1.dog = 4;					//Dog 클래스
			ds1.dog_sub(); 					//Dog_sub클래스
			
		// 업캐스팅 : 자식 타입의 데이터 타입에서 부모데이터 타입으로 변환하는 것
			// 부모 타입의 필드와 메서드만 접근 가능
			//강제 타입변환없이 자동으로 업캐스팅됨.
			// ds1은 Dog_sub데이터 타입을 가지고 있음 -> 모두 접근 가능
			
			Dog ds1_c1 = ds1;	///업캐스팅 : Dog_sub ===> Dog 타입(Animal, Dog접근)
			Animal ds1_c2 = ds1;	///업캐스팅 : Dog _sub ===> Animal타입 (Animal 접근)
			
			//ds1 : 
			//ds1_c1 : Dog(Animal, dog)
			//ds1_c2 :  
			
		// 다운캐스팅 : 부모데이터 타입을 다시 자식데이터 타입으로 변환
			//강제로 타입변환이 필요
			// a3는 모든 데이터 타입을 가지고 있음, 업캐스팅으로 animal 타입만 사용가능함
			
			Dog a3_down1 = (Dog)a3;
			Dog_sub a3_down2 = (Dog_sub)a3;
			
			
		
	}

}
