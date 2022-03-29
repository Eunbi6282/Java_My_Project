package Ex_T;
abstract class Animal {		//�߻�Ŭ���� : �߻�޼ҵ尡 �ϳ��̻� ���Ե� ���
							// �߻� Ŭ������ ��ü ���� �Ұ���, Ÿ���� ��������
								// �ڽ�Ŭ������ �θ�Ŭ������ �޼ҵ� ������ ������ ������
							// �߻�Ŭ������ �߻�Ŭ���� ���� �߻�޼ҵ带 �ڽ� Ŭ�������� �ݵ�� �����ϵ��� ����޴´�. 
	String nameString;
	int age;
	
	abstract void cry();	//�߻�޼ҵ� : �����ΰ� ���� �޼ҵ�
	abstract void run();
	
	@Override
	public String toString() {	//��ü ��ü�� ��½� �޸��� ������ ���
		return "�̸��� : " + nameString + " ���̴� : " + age;
	}
}

class Cat extends Animal{		//Cat�� Animal Ŭ������ �Ϻθ� ����� ��� -> abstractŬ����
											//�߻�޼ҵ� ���θ� ����� ��� -> ��ũ��Ʈ Ŭ����(������ ������)Ŭ����
	Cat(String nameString, int age){
		this.nameString = nameString;
		this.age = age;
	}

	@Override
	void cry() {
		System.out.println("����̴� �߿�");
	}

	@Override
	void run() {
		System.out.println("����̴� �ٸ��� �װ�");
	}
}

class Tiger extends Animal{
	
	Tiger (String nameString, int age){
		this.nameString = nameString;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("ȣ���̴� ����");
	}

	@Override
	void run() {
		System.out.println("ȣ���̴� �ٸ��� �װ�");
	}
}

class Eagle extends Animal{
	Eagle(String nameString, int age){
		this.nameString = nameString;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("�������� ±±..?");
	}

	@Override
	void run() {
		System.out.println("�������� �ٸ��� �ΰ�");
	}
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����",10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������",15);
			
		// 1. Animal �迭��ü�� ���� 
		Animal[]animals = {a1,a2,a3};
		
		// 2. for�� ����ؼ� ��½� �̸��� ���̸� ���, cry�� run�޼ҵ� ���
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
