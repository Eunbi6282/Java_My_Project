package chapter13.Ex10.Ex01;

class A{
	
	A(){}  // 기본 생성자
	A(B b) {		//B타입인 변수 
		this.b = b;
	}
	B b;		//B : 인터페이스 타입, b :참조변수 <값을 할당하는 방법>
					//b : 초기값(null)
						// 1. 객체 생성 후 값을 할당
						// 2. 생성자를 통해서 값을 할당
						// 3. setter를 통해서 값을 할당
	
	//setter 통해서 값을 할당
	public void setB (B b) {
		this. b = b;	}
	
	interface B{
		void play();
		void stop();
	}
	
	void abc() {		//play()재정의,stop()재정의
		b.play();
		b.stop();
	}
}

public class InnerInterface_1_1 {
	public static void main(String[] args) {
		A a = new A();
		

		//setter 통해서 값을 할당
		a.setB(new A.B() {
			@Override
			public void stop() {
				System.out.println("중지합니다.");
			}
			
			@Override
			public void play() {
				System.out.println("실행합니다.");
			}
		});
		a.abc();
		System.out.println("==============");
		// 1. 객체 생성후 필드의 값을 할당
		A a1 = new A();
		a1.b = (A.B) new A.B() {		//인터페이스 A객체 하위 B인터페이스(A.B)
			public void play() {
				System.out.println("play");
			};
			public void stop() {
				System.out.println("stop");
			};
		}; 
		a1.abc();
		
		System.out.println("====================");
		// 2. 생성자를 이용해서 값을 할당
		A a2 = new A(				//생성자 내부에 A.B타입의 객체 생성 후 주입
				new A.B() {			//A생성자 내부에 

					@Override
					public void play() {
						System.out.println("실행");
					}

					@Override
					public void stop() {
						System.out.println("중지");
					}
					}
				);
		a2.abc();
		
		// 3. 
		
		
	}
}
