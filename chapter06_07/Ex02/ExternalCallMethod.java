package chapter06_07.Ex02;

//메소드 오버로딩: 하나의 메소드명에 메개변수의 타입, 갯수에 따라서 호출하는 것 (Java)
//메소드 오버라이딩: 상속에서 부모 클래스의 메소드를 재정의해서 사용



//다양한 타입의 메소드 형식(리턴 타입이 있는 경우 (int, double, String...)
	//리턴타입이 없는 경우
public class ExternalCallMethod {

	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		
		//메소드 호출
		a.print();
		
		int k = a.data();		//3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);		//8.2
		
		a.printMethod(8);
		a.printMethod(133);
		
		//주의 :
		System.out.println(a.data());  //출력 구문에 호출가능한 메소드 (return이 있는 메소드)
		// System.out.println(a.print());  -> 오류 , 바로 프린트 가능함
		a.print();
		System.out.println(a.sum(4, 10.5));
		// System.out.println(a.printMethod(3)); -> 오류발생
		a.printMethod(3);
		
		
	}

}
