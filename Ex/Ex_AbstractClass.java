package Ex;
abstract class Abc{
	abstract void cry();	
	abstract void fly();
}

class Cat2 extends Abc{

	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}

	@Override
	void fly() {
		System.out.println("고양이는 날개가 없어서 날지 못한다.");
		
	}
}

class Eagle2 extends Abc{

	@Override
	void cry() {
		System.out.println("독수리는 짹");
		
	}

	@Override
	void fly() {
		System.out.println("독수리는 날개가 있어 날 수 있다. ");
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		System.out.println("===자식클래스 Cat, Eagle 생성 후 두 메소드를 오버라이딩해서 출력===");
		// 1. 자식클래스 Cat, Eagle 생성 후 두 메소드를 오버라이딩해서 출력
		Abc abc = new Cat2();
		Abc abc2 = new Eagle2();
		
		Abc[] abcs = {abc,abc2};
		
		for (int i = 0; i < abcs.length; i++) {
			abcs[i].cry();
			abcs[i].fly();
		}
		
		System.out.println("===익명 클래스 생성 후 출력===");
		// 2. 익명 클래스 생성후 출력, 
		Abc catAbc = new Abc() {
			
			@Override
			void cry() {
				System.out.println("고양이는 야옹");
			}
			
			@Override
			void fly() {
				System.out.println("고양이는 날개가 없어서 날지 못한다.");
			}
		};
		
		Abc eagleAbc = new Abc() {
			
			@Override
			void cry() {
				System.out.println("독수리는 짹");
			}
			@Override
			void fly() {
				System.out.println("독수리는 날개가 있어 날 수 있다. ");
			}
		};
		
		Abc[] abcs2 = {catAbc,eagleAbc};
		for (Abc k : abcs2) {
			k.cry();
			k.fly();
		}
	}
}
