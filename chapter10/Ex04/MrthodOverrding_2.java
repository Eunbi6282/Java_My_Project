package chapter10.Ex04;
class Animal2{
	void run() {
	}
}
class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat(){
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}
class Eagle extends Animal2{
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void eagleEat() {
		System.out.println("�������� �ٸ� ���� ��ƸԽ��ϴ�.");
	}
}
class Snake extends Tiger{
	//@Override
	void run2() {
		System.out.println("���� ���ٴմϴ�.");
	}
}

public class MrthodOverrding_2 {

	public static void main(String[] args) {
		// 1. ��� ��ü AnimalŸ������ ��ĳ�����ؼ� ����
		Animal2 tigerAnimal = new Tiger();
		Animal2 eagleAnimal = new Eagle();
		Animal2 snakeAnimal = new Snake(); 
		// 2.Animal�迭�� �ֱ�
		Animal2[] animals = {tigerAnimal,eagleAnimal,snakeAnimal};
		
		// 3. for ,enhancedfor�� ���
		System.out.println("====for====");
		for (int i = 0; i < animals.length; i++) {
			animals[i].run();
		}
		
		System.out.println("====EnhancedFor====");
		for (Animal2 k : animals) {
			k.run();
		}
		
		System.out.println("====�ٿ� ĳ����====");
		//4. �ٿ�ĳ����
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
