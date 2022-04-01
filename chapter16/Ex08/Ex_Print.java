package chapter16.Ex08;
public class Ex_Print {
	public static void main(String[] args) {
		// Apple
		EX_Generic<Apple> g1 = new EX_Generic<Apple>();
		g1.setT(new Apple("사과", 1000));
		System.out.println(g1.getT());
		Apple apple = g1.getT();
		apple.print();	//추상클래스 fruit을 구현한 메서드 print()구현
		
		System.out.println("=============================");
		
		//Banana
		EX_Generic<Banana> g2 = new EX_Generic<Banana>();
		g2.setT(new Banana("바나나", 2000));
		System.out.println(g2.getT());
		Banana banana = g2.getT();
		banana.print(); //추상클래스 fruit을 구현한 메서드 print()구현
		
		System.out.println("=================================");
		
		//Strawberry  
		EX_Generic<Strawberry> g3 = new EX_Generic<Strawberry>();
		g3.setT(new Strawberry("딸기", 3000));
		System.out.println(g3.getT());
		Strawberry strawberry = g3.getT();
		strawberry.print();
	}
}
