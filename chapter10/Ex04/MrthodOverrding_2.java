package chapter10.Ex04;
class Animal2{
	void run() {
	}
}
class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat(){
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}
class Eagle extends Animal2{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void eagleEat() {
		System.out.println("독수리는 다른 새를 잡아먹습니다.");
	}
}
class Snake extends Tiger{
	//@Override
	void run2() {
		System.out.println("뱀은 기어다닙니다.");
	}
}

public class MrthodOverrding_2 {

	public static void main(String[] args) {
		// 1. 모든 객체 Animal타입으로 업캐스팅해서 생성
		Animal2 tigerAnimal = new Tiger();
		Animal2 eagleAnimal = new Eagle();
		Animal2 snakeAnimal = new Snake(); 
		// 2.Animal배열에 넣기
		Animal2[] animals = {tigerAnimal,eagleAnimal,snakeAnimal};
		
		// 3. for ,enhancedfor을 출력
		System.out.println("====for====");
		for (int i = 0; i < animals.length; i++) {
			animals[i].run();
		}
		
		System.out.println("====EnhancedFor====");
		for (Animal2 k : animals) {
			k.run();
		}
		
		System.out.println("====다운 캐스팅====");
		//4. 다운캐스팅
		if (tigerAnimal instanceof Tiger) {
			Tiger tiger = (Tiger)tigerAnimal;
			tiger.tigerEat();
		}
		if (eagleAnimal instanceof Eagle) {
			Eagle eagle = (Eagle)eagleAnimal;
			eagle.eagleEat();
		}
		if (snakeAnimal instanceof Animal2) {
			Tiger snTiger = (Tiger)snakeAnimal;
			snTiger.run();
		}
	}

}
