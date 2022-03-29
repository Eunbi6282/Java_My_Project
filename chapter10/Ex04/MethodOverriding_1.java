package chapter10.Ex04;

//�޼ҵ� �������̵�

class Animal {
	void cry() {
	}
}

class Bird extends Animal{
	@Override
	void cry() {		//�Ű����� Ÿ�� , ����, ���������� Ȯ�� 
		System.out.println("±±");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal{
	@Override
	//void crry(){}		//crry�� �θ𿡼� ã�� �� ����
		//crry����� ��� Override ���� 
	void cry() {
		System.out.println("�۸�");
	}
}
public class MethodOverriding_1 {
	public static void main(String[] args) {
		// 1. ������ Ÿ������ ����
		Animal aa = new Animal();
		Bird bbBird= new Bird();
		Cat ccCat = new Cat();
		Dog ddDog = new Dog();
		
		aa.cry();		//Animla Ŭ������ cry()
		bbBird.cry();	//Bird Ŭ������ cry()
		ccCat.cry();	//Cat Ŭ������ cry()
		ddDog.cry();	// Dog Ŭ������ cry()
		System.out.println("================");
		
		//2. Animal Ÿ������ �����ϰ� +�ڽ�Ÿ������ ���� : ���� ���ε��� ���ؼ� �θ��� cry()�� ȣ���� ��� �ڽ��� 
											// �����ε��� �޼ҵ�� ���ε� ��
		Animal abAnimal = new Bird(); //abAnimal�� Animal , BirdŸ�� ����. Animal �ʵ�� �޼ҵ常 ����
		Animal acAnimal = new Cat();  //acAnimal�� Animal, CatŸ�� ����. Animal �ʵ�� �޼ҵ常 ����
		Animal adAnimal = new Dog();  //acAnimal�� Animal, DogŸ�� ����. Animal �ʵ�� �޼ҵ常 ����
		
		abAnimal.cry();		//Animal�� cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� BirdŬ������ cry()�� ȣ�� 
		acAnimal.cry();		//Animal�� cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� CatŬ������ cry()�� ȣ��
		adAnimal.cry();		//Animal�� cry()�� ȣ���� ��� ���� ���ε��� ���ؼ� DogŬ������ cry()�� ȣ��
		System.out.println("==================");
		
		//3. ��ü �迭�� ����
		Animal[] animals = {abAnimal,acAnimal,adAnimal};
		//��üŸ�� �迭�� = {��ü, ��ü, ��ü}
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
