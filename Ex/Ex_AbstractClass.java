package Ex;
abstract class Abc{
	abstract void cry();	
	abstract void fly();
}

class Cat2 extends Abc{

	@Override
	void cry() {
		System.out.println("����̴� �߿�");
		
	}

	@Override
	void fly() {
		System.out.println("����̴� ������ ��� ���� ���Ѵ�.");
		
	}
}

class Eagle2 extends Abc{

	@Override
	void cry() {
		System.out.println("�������� ±");
		
	}

	@Override
	void fly() {
		System.out.println("�������� ������ �־� �� �� �ִ�. ");
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		System.out.println("===�ڽ�Ŭ���� Cat, Eagle ���� �� �� �޼ҵ带 �������̵��ؼ� ���===");
		// 1. �ڽ�Ŭ���� Cat, Eagle ���� �� �� �޼ҵ带 �������̵��ؼ� ���
		Abc abc = new Cat2();
		Abc abc2 = new Eagle2();
		
		Abc[] abcs = {abc,abc2};
		
		for (int i = 0; i < abcs.length; i++) {
			abcs[i].cry();
			abcs[i].fly();
		}
		
		System.out.println("===�͸� Ŭ���� ���� �� ���===");
		// 2. �͸� Ŭ���� ������ ���, 
		Abc catAbc = new Abc() {
			
			@Override
			void cry() {
				System.out.println("����̴� �߿�");
			}
			
			@Override
			void fly() {
				System.out.println("����̴� ������ ��� ���� ���Ѵ�.");
			}
		};
		
		Abc eagleAbc = new Abc() {
			
			@Override
			void cry() {
				System.out.println("�������� ±");
			}
			@Override
			void fly() {
				System.out.println("�������� ������ �־� �� �� �ִ�. ");
			}
		};
		
		Abc[] abcs2 = {catAbc,eagleAbc};
		for (Abc k : abcs2) {
			k.cry();
			k.fly();
		}
	}
}
