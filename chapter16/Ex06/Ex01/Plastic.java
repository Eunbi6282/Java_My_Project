package chapter16.Ex06.Ex01;

//GenericPrinter에 사용될 객체[재료]

public class Plastic extends Material {

	public void doPrinting() {	//추상메서드의 클래스를 구현한 메서드 
		System.out.println("플라스틱 재료로 출력합니다. ");
	}
	@Override
	public String toString() {
		return "재료는 플라스틱입니다.";
	}
}
