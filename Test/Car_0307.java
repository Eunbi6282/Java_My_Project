package Test;

class Car{
	String companysString;		//필드(인스턴스필드)의 company를 알려주는  this, heap메모리에 저장
	String modelString;				//인스턴스 : 객체화를 했을 때 사용 가능한 필드.
	String colorString;			// [필드명 : 필드의 값]은 heap 영역안에 들어감 
	double maxSpeed;
	
	Car (String companysString, String modelString, String colorString, double max) {
		this.companysString = companysString;		
		this.modelString = modelString;
		this.colorString = colorString;
		maxSpeed = max; 	//this 키워드가 생략된 상태
	}
	
	void work() {			//메소드(인스턴스 메소드) : heap영역의 메소드명과 포인터를 저장
		System.out.println("회사는 : " + companysString + " 모델은 : " + modelString + " 색은 : " + colorString + " 최대 속력은 : " + maxSpeed);
		//메소드의 전테 구문 -> class 영역의  메소드 영역에 저장
	}
}

public class Car_0307 {
	public static void main(String[] args) {
		//생성자를 통해서 기본값을 할당 후 메모리의 내용을 work()메소드를 사용해서 출력
		
		//객체 생성
		Car car = new Car("현대", "그랜저", "하양", 250);
		//출력
		car.work();
	}
}
