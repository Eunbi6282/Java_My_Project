package practice;

class Animal {
	String name;
	int age;
	
	void cry() {}
		//Object.tostring 메서드는 객체 자체를 출력할 때 호출된다.

	@Override
	public String toString() {
		return "이름은 : " + name + "이고 , 나이는 : " + age + "입니다." ;
	}
}
class Tiger extends Animal{
	Tiger(){}		//다른 생성자가 지정됐으므로 기본생성자 객체를 만드려면 기본생성자 선언되어있어야 함
	
	Tiger(String name, int age) {
		super.age = age;
		super.name = name;
	}
	
	@Override
	void cry() {
		System.out.println("호랑이는 어흥하고 웁니다.");
	}
}
class Cat extends Animal{

	Cat(){}
	
	Cat(String name, int age) {
		super.age = age;
		super.name = name;
	}
	@Override
	void cry() {
		System.out.println("고양이는 야옹하고 웁니다.");
	}
	
}


public class Practice2_0314 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal);
		//객체 자체를 출력할 경우, Object클래스의 toString메서드가 호출된다. 
		//Object.toSting() : 객체 메모리 주소의 해쉬코드를 출력
		System.out.println(animal.toString());
		
		Animal tigerAnimal = new Tiger();	//Tiger을 Animal로 업캐스팅
		Animal catAnimal = new Cat();
		tigerAnimal.cry();
		catAnimal.cry();
		
		System.out.println("!다른 생성자가 없을 땐 상관없지만 다른 생성자를 지정한다면 기본 생성자를 호출할 경우 기본생성자를 호출해야 함!");
		Animal tiger2 = new Tiger("호랑이",5);
		Animal cat2 = new Cat("고양이", 3);
		
		System.out.println();
		//배열에 넣기
		Animal animalcry[] = {tigerAnimal,catAnimal};	//Animal타입으로 넣을거임 -> 어짜피 다 오버라이딩돼서 각자의 메소드가 출력 됨
		Animal animal2 [] = {tiger2,cat2};
		
		for (int i = 0; i < animal2.length; i++) {
			System.out.println(animal2[i]);
			animalcry[i].cry();
			
		}

	}

}
