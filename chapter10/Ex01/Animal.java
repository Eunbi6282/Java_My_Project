package chapter10.Ex01;

class Tiger extends Animal{
	int leg;
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��� �Խ��ϴ�. ");
	}
}

class Dog extends Animal{
	int dog;
	void dogEat(){
		System.out.println("���� ��ļ��Դϴ�.");
	}
}

class Dog_sub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog�� �ڽ� Ŭ���� �Դϴ�.");
	}
}

class Eagle extends Animal{
	int eagle;
	void eagleFly() {
		System.out.println("�������� ���ƴٴմϴ�. ");
	}
}
 
public class Animal {
	String nameString;  	//������ �̸�
	int age;				//������ ����
	String colorString;		//������ ��
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�. ");
	}
	
	
	
	public static void main(String[] args) {
		
		// ��ĳ������ ���������� ó���ϱ� ������ ���־��� ȿ�������� ���α׷��� ó���� �� �ִ�. 
				//������ : �������̵��� �̿��ؼ� ��ӿ��� �ϳ��� �޼ҵ�� ���������� ó��
		
		// 1. Animal Ŭ���� ��ü��
		Animal a1 = new Animal();	//�ڽ��� �ʵ�� �޼ҵ常 ��� ����
		
		// 2. DogŬ������ DogŸ������ ��üȭ
		Dog d1 = new Dog();			// Animal, Dog�� �ʵ�� �޼ҵ� ����
		
		// 3. DogŬ������ AnimalŸ������ ��ĳ����
		Animal a2 = new Dog();		//a2�� Animal, Dog�� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ常 ���� 
		
		// 4. Dog_sub�� AnimalŸ������ ��ĳ����
		Animal a3 = new Dog_sub();	//a3�� Animal, Dog, Dog_sub�� �����ϰ� �ְ�, Animal�� �ʵ�� �޼ҵ常 ���� ����
			a3.nameString = "���";
			// a3.dog = 6;  ���� ->  
			
		
		// 5. Dog_sub�� Dog ������ Ÿ������ ��ĳ����
		Dog d2= new Dog_sub();		//d2�� Animal, Dog, Dog_sub�� �����ϰ� �ְ� , Animal�� Dog�� �ʵ�� �޼ҵ带 ���
			d2.nameString="����Ʈ";
			d2.dog = 5;
			// d2.dog_sub = 3; ���� -> Dog_sub�� ������ �� ����. 
		
		// 6. Dpg_sub�� Dog_sub������ Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();
			// ds1�� Animal,Dog, Dog_sub �� ������� �ְ�, ��� ��� ����
			ds1.nameString = "������";		//Animal Ŭ����
			ds1.age = 4;
			ds1.dog = 4;					//Dog Ŭ����
			ds1.dog_sub(); 					//Dog_subŬ����
			
		// ��ĳ���� : �ڽ� Ÿ���� ������ Ÿ�Կ��� �θ����� Ÿ������ ��ȯ�ϴ� ��
			// �θ� Ÿ���� �ʵ�� �޼��常 ���� ����
			//���� Ÿ�Ժ�ȯ���� �ڵ����� ��ĳ���õ�.
			// ds1�� Dog_sub������ Ÿ���� ������ ���� -> ��� ���� ����
			
			Dog ds1_c1 = ds1;	///��ĳ���� : Dog_sub ===> Dog Ÿ��(Animal, Dog����)
			Animal ds1_c2 = ds1;	///��ĳ���� : Dog _sub ===> AnimalŸ�� (Animal ����)
			
			//ds1 : 
			//ds1_c1 : Dog(Animal, dog)
			//ds1_c2 :  
			
		// �ٿ�ĳ���� : �θ����� Ÿ���� �ٽ� �ڽĵ����� Ÿ������ ��ȯ
			//������ Ÿ�Ժ�ȯ�� �ʿ�
			// a3�� ��� ������ Ÿ���� ������ ����, ��ĳ�������� animal Ÿ�Ը� ��밡����
			
			Dog a3_down1 = (Dog)a3;
			Dog_sub a3_down2 = (Dog_sub)a3;
			
			
		
	}

}
