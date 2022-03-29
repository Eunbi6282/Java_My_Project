package chapter11.Ex05;

//�߻� Ŭ������ ����ؼ� ��� �����ϴ� ���
abstract class Animal {		//�߻� �޼��尡 �ϳ��� ������ �߻�Ŭ������ �����
	abstract void cry();		//�߻� �޼ҵ� : ���� �Ǿ��ְ� �����ΰ� ���� �޼ҵ�
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{

	@Override
	void cry() {
		System.out.println("�۸�");
	}
}
public class AbstractModifier_3 {

	public static void main(String[] args) {
		//�߻�Ŭ������ ��üȭ �� �� ����.
		//Animal a3 = new Animal(); //�߻�Ŭ������ ��üȭ�� �� ����. 
		
		//But Ÿ�����δ� ���� ����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		a1.cry();
		a2.cry();
	}
}
