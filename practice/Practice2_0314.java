package practice;

class Animal {
	String name;
	int age;
	
	void cry() {}
		//Object.tostring �޼���� ��ü ��ü�� ����� �� ȣ��ȴ�.

	@Override
	public String toString() {
		return "�̸��� : " + name + "�̰� , ���̴� : " + age + "�Դϴ�." ;
	}
}
class Tiger extends Animal{
	Tiger(){}		//�ٸ� �����ڰ� ���������Ƿ� �⺻������ ��ü�� ������� �⺻������ ����Ǿ��־�� ��
	
	Tiger(String name, int age) {
		super.age = age;
		super.name = name;
	}
	
	@Override
	void cry() {
		System.out.println("ȣ���̴� �����ϰ� ��ϴ�.");
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
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
	
}


public class Practice2_0314 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal);
		//��ü ��ü�� ����� ���, ObjectŬ������ toString�޼��尡 ȣ��ȴ�. 
		//Object.toSting() : ��ü �޸� �ּ��� �ؽ��ڵ带 ���
		System.out.println(animal.toString());
		
		Animal tigerAnimal = new Tiger();	//Tiger�� Animal�� ��ĳ����
		Animal catAnimal = new Cat();
		tigerAnimal.cry();
		catAnimal.cry();
		
		System.out.println("!�ٸ� �����ڰ� ���� �� ��������� �ٸ� �����ڸ� �����Ѵٸ� �⺻ �����ڸ� ȣ���� ��� �⺻�����ڸ� ȣ���ؾ� ��!");
		Animal tiger2 = new Tiger("ȣ����",5);
		Animal cat2 = new Cat("�����", 3);
		
		System.out.println();
		//�迭�� �ֱ�
		Animal animalcry[] = {tigerAnimal,catAnimal};	//AnimalŸ������ �������� -> ��¥�� �� �������̵��ż� ������ �޼ҵ尡 ��� ��
		Animal animal2 [] = {tiger2,cat2};
		
		for (int i = 0; i < animal2.length; i++) {
			System.out.println(animal2[i]);
			animalcry[i].cry();
			
		}

	}

}
