package Ex_T;

import javax.naming.directory.SearchControls;

class MyAllException extends Exception{
	public MyAllException() {
		super();
	}
	public MyAllException(String message) {
		super(message);	//예외 메세지 출력 ,하나만 만들어두고 돌려쓰기 가능
	}
}

class A{
	
	// private : 캡슐화, 객체생성후 바로 접근하지 못하도록 설정
		//setter나 생성자로 값할당
	
	private String season;		//봄, 여름, 가을 ,겨울만 들어올 수 있음, 다른값이 들어오면 예외(예외 발생 : 봄,여름,가을,겨울만 입력하세요)
	private String week;  	//월,화,수,목,금,토,일 값만(예외발생 : 월,화,수,목,금,토,일만 입력하세요)
	private int scoreKor; 	// 0~ 100값만 입력 (예외 발생 : 0에서 100까지 정수만 입력하세요)
	private int scoreEng;	// 0~ 100값만 입력 (예외 발생 : 0에서 100까지 정수만 입력하세요)
	private String userID; 	//12자 이상, 20자 사이의 문자 혹은 숫자(예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)
	
	//하나의 메서드로 처리
	void studentInfo(String season, String week,int scoreKor,int scoreEng,String userID) throws MyAllException {
		if(season != "봄" && season != "여름" && season != "가을" && season != "겨울") {
			throw new MyAllException("봄, 여름, 가을 ,겨울만 들어올 수 있음, 다른값이 들어오면 예외(예외 발생 : 봄,여름,가을,겨울만 입력하세요)");
			
		}else if(week != "월" && week != "화" && week != "수" && week != "목" && week != "금" && week != "토" && week != "일"){
			throw new MyAllException("월,화,수,목,금,토,일 값만(예외발생 : 월,화,수,목,금,토,일만 입력하세요)");
		}else if(scoreKor < 0 || scoreKor > 100){
			throw new MyAllException("0~ 100값만 입력 (예외 발생 : 0에서 100까지 정수만 입력하세요)");
		}else if(scoreEng < 0 || scoreEng > 100) {
			throw new MyAllException("0~ 100값만 입력 (예외 발생 : 0에서 100까지 정수만 입력하세요)");
		}else if(userID.length() < 12 && userID.length() > 20) {
			throw new MyAllException("12자 이상, 20자 사이의 문자 혹은 숫자(예외 발생 : 12자이상 20자 사이의 문자만 넣으세요");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다. ");
			this.season = season;
			this.week = week;
			this.scoreEng = scoreEng;
			this.scoreKor = scoreKor;
			this.userID = userID;
		}
		System.out.printf(season + " , " + week + " , " + scoreKor + ",\n" + scoreEng + " , " + userID);
	}
}

public class UserException_Ex {
	public static void main(String[] args) {
		A a = new A();
		
		//모든 필드의 값을 정상적으로 넣음
		try {
			a.studentInfo("봄", "월", 85, 88, "20270033333333");
		} catch (MyAllException e) {
			System.out.println(e.getMessage()); //return String
			//e.printStackTrace();  //void -> println에 넣을 수 없음
		}
		
		//season 필스 테스트
		try {
			a.studentInfo("꿈", "월", 85, 88, "20270033333333");
		} catch (MyAllException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
