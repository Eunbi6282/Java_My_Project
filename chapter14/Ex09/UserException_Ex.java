package chapter14.Ex09;

class A{
	String season;		//봄, 여름, 가을 ,겨울만 들어올 수 있음, 다른값이 들어오면 예외(예외 발생 : 봄,여름,가을,겨울만 입력하세요)
	String week;  	//월,화,수,목,금,토,일 값만(예외발생 : 월,화,수,목,금,토,일만 입력하세요)
	int scoreKor; 	// 0~ 100값만 입력 (예외 발생 : 0에서 100까지 정수만 입력하세요)
	int scoreEng;	// 0~ 100값만 입력 (예외 발생 : 0에서 100까지 정수만 입력하세요)
	String userID; 	//12자 이상, 20자 사이의 문자 혹은 숫자(예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)
	
	 void checkKorscores(int scoreKor) throws RangeException{
		if (scoreKor < 0 || scoreKor > 100) {
			throw new RangeException("예외 발생 : 0에서 100까지 정수만 입력하세요");
		}
		else {
			this.scoreKor = scoreKor;
			System.out.println("국어 점수 : " + this.scoreKor);
		}
	}
	 void checkEngscores(int scoreEng) throws RangeException{
		if (scoreEng < 0 || scoreEng > 100) {
			throw new RangeException("예외 발생 : 0에서 100까지 정수만 입력하세요");
		}
		else {
			this.scoreEng = scoreEng;
			System.out.println("영어 점수 : " + this.scoreEng);
		}
	}
	 void checkSeason(String season) throws WordException {
		if(season != "봄"  &&  season != "여름" &&  season != "가을" &&  season != "겨울" ) {
			throw new WordException("예외 발생 : 봄,여름,가을,겨울만 입력하세요");
		}else {
			this.season = season;
			System.out.println("계절은 : " + this.season + "입니다.");
		}
	}
	
	 void checkWeek(String week) throws WordException {
		if(week != "월" && week != "화" && week != "수" && week != "목" && week != "금" && week != "토" && week != "일") {
			throw new WordException("예외발생 : 월,화,수,목,금,토,일만 입력하세요");
		}else {
			this.week = this.week;
			System.out.println("요일은 : " + this.week + "요일 입니다.");
		}
	}
	
	 void checkUserID(String userID) throws RangeException{
		if (userID.length() < 12 || userID.length() > 20) {
			throw new RangeException("예외 발생 : 12자이상 20자 사이의 문자만 넣으세요");
		}
		else {
			this.userID = userID;
			System.out.println("사용자의 ID는 : "+ this.userID + "입니다.");
		}
	}
	
}

class WordException extends Exception{		//다른 문자가 들어오면 예외 발생
	public WordException(){
		super();
	}
	public WordException(String message) {
		super(message);
	}
}
class RangeException extends Exception{		//범위 벗어나면 예외 발생
	public RangeException () {
		super();
	}
	public RangeException (String message) {
		super(message);
	}
}

public class UserException_Ex {

	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		
		//예외 처리 + 출력
		
		//영어점수
		try {
			a.checkEngscores(82);
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("==========");
		
		//국어점수
		try {
			a.checkKorscores(55);
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========");
		
		// 계절
		try {
			a.checkSeason("가을");
		} catch (WordException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===========");
		//주
		try {
			a.checkWeek("월월");
		} catch (WordException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=============");
		
		//사용자 Id
		try {
			a.checkUserID("20170033ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
