package chapter14.Ex08;
// 1. Exception을 상속받는 사용자예외 : 일반예외
	// 1-1 : 점수가 음수인 경우 예외 발생
	// 1-2 : 점수에 100점을 초과하는 경우 예외 발생

class MinusException extends Exception{	//음수가 들어올 경우 MinusException 강제 발생
	public MinusException (){
		super();  	//Exception의 기본 생성자 호출
	};
	public MinusException (String message){	//예외 메세지 출력, e.getmessage();
		super(message);
	};
}

class OverException extends Exception{
	public OverException () {
		super();
	}
	public OverException (String message) {		//예외 메세지 출력, e.getmessage();
		super(message); //100 이상의 값이 들어오면 호출
	}
}

class AAA{
	int score;
	
	void checkScore(int score) throws MinusException, OverException{
		if (score < 0) {
			throw new MinusException("예외 발생! 음수는 넣을 수 없습니다."); //예외 메세지
		}else if (score > 100) {
			throw new OverException("예외 발생! 100점이 넘는 값은 입력할 수 없습니다.");
		} else {
			System.out.println("정상적으로 잘 입력되었습니다. ");
			this.score = score;
			System.out.println("점수는 : " + this.score); //그냥 score을 쓰면 지역변수가 됨, 
				//this.score을 사용해야 들어오는 변수의 값과 메모리에 올리는 변수의 값이 같음!
		}
			
	}
}


public class UserException {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		// aaa.checkScore(0); //예외처리 필요
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		try {
			aaa.checkScore(95);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
