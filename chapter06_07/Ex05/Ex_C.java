package chapter06_07.Ex05;

public class Ex_C {

	public static void main(String[] args) {
		
		//다른 클래스에 존재함/ public만 접근/ model, color -> 메모리로 접근 불가
		// model과 color 는 setter 을 통해값을 넣어서 출력
		C c = new C();
		
		c.modelString = "그랜저";
		c.colorString = "하양";
		c.maxSpeed = 225;
		
		c.print();
		

	}

}
