package chapter13.Ex10;

class Button{
	//OnClickListener:객체타입, ocl :참조변수 
	OnClickListener ocl; 	// ocl 기본값 null
	
	
	
	//setter로 OnClickListener의 참조변수 ocl에 객체 주소를 담는다.
	void setOnClickListener(OnClickListener ocl) {		
		this.ocl = ocl;		//초기값(null)값에서 변수를 받는 값으로 객체 활성화시킴
	}
	
	//인터페이스만 존재, 구현한 자식 클래스가 존재하지 않는다.
		// 호출하는 곳에서 onClick()를 재정의해서 호출해야 함
	interface OnClickListener{		//InnerInterFace , static생략, Button.OnClickListener : 
		void onClick();		//추상메서드, 선언만 됨, 하위에서 오버라이딩 해서 재정의 필요
	}
	
	void click() {	//실행했을 때 ocl.onClick()를 호출
		ocl.onClick();	//ocl : 참조변수 / 초기값(null) ===> set통해 활성화
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// 개발자 1 : 클릭시 음악재생
		Button button1 = new Button();	//button1 객체 생성,
		
		//A.B = new A.B() {이너인터페이스 B의 메서드를 구현한 코드
		//OnClickListener 갹체타입으로 객체 생성해서 매개변수로 던져줌
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자1. 음악재생");
				
			}
		} ); 	
//		
		button1.click();
		System.out.println("==============");
		
		
		// 개발자 2 : 클릭시 네이버 접속
		Button button2 = new Button();
		
		// setOnClickListener() 메서드에 매개변수로 OnClickListener의 하위 익명 객체를 생성후
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자2. 네이버 접속");
			}
		}); 	//인터페이스 데이터 타입 넣어주기
		button2.click(); // click()를 활성화키려면 
	}

}
