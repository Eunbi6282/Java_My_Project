package chapter06_07.Ex06;

import chapter06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		//다른 클래스에 존재함/ public만 접근/ model, color -> 메모리로 접근 불가
				// model과 color 는 setter를 public 통해서 값을 넣어서 출력
		
		C c = new C();		//다른 패키지 이므로 import시켜줘야 함
		
		
		//company, model, color는 다른 패키지에서 접근 불가, setter을 통해서 메모리 값을 할당하도록 구성
		c.maxSpeed = 250;		//다른 패키지의 클래스에서는 public, protected(상속 설정)
		
		//setter을 통해서 메모리의 값을 부여 (setter -> public)
		c.setColor("검정");
		c.setModel("제네시스");
		c.setmaxSpeed(300);
		
		c.print();
		
		
		

	}

}
