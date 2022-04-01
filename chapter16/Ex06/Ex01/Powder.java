package chapter16.Ex06.Ex01;

//GenericPrinter에 사용될 객체[재료]

public class Powder extends Material {	//추상클래스를 상속
	public void doPrinting(){	//추상 메서드를 구현
		System.out.println("파우더 재료로 출력합니다.");
	}
	@Override
	public String toString() {
		return "재료는 파우더입니다.";
	}
}
