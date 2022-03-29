package chapter14.Ex08;

// --사용자 정의 예외 만들기--
// ID의 값을 NULL일 경우 Exception 발생
// userID가 8자 이상 , 20자가 아닌 경우 Exception

//일반 예외 생성 - Exception 상속
class IDFormatException extends Exception{	//생성자 두개 만들기
	public IDFormatException() {
			super();
	}
	public IDFormatException (String message) { 	//예외 발생 시 예외 메세지가 출력, 
		//e.getMessage(); -> 생성자에서 넘어온 message값을 여기서 호출
		super(message);
	}
}

public class IDFormatTest {
	
	private String userID;	//체크 :  null, 8자 이상 이고 20자가 아닌 경우 Exception
		//userID는 캡슐화 되어있다. -> private : 외부에서 접근 불가, 같은 클래스에서만 접근 가능
			//값넣기 -> 1. 생성자 , 2. setter 통해서 값을 할당(외부에서 만들 때 객체 생성 못하기 때문)
		//private으로 설정된 경우 getter나 setter를 사용해서 값을 넣거나 출력할 수 있음
	
	//getter
	public String getUserID() {		//메서드 호출 시 메모리의 userID를 던져줌
		return userID;
	}
	
	//setter : 메모리에 값을 할당할 때/ 조건을 넣어서 control할 수 있음
	public void setUserID (String userID) throws IDFormatException {	//setUserID를 호출하는 쪽에서 예외처리 해줘야 함
		if (userID == null) {
			throw new IDFormatException("아이디는 Null일 수 없습니다. ");
		}else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용 가능합니다. ");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		//1. userID 값이 null일 경우
		String userID = null;
		//test.setUserID(userID)  -> throw로 받아서 예외 처리 필요
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		} 	//setter호출 시 null(userID)값을 입력 후 호출
		// null 경우 -> if (userID == null)에 걸려 예외 발생
		
		System.out.println("==========================");
		
		// 2. userID 를 7자를 넣을 경우
		userID = "1234567";
		// test.setUserID(userID); -> throw로 받아서 예외 처리 필요
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); 	//예외 발생했으므로 설정한 오류 메세지 출력됨
		}
		System.out.println("==========================");
		
		// 3. Null이 아니고 8자이상 20자 미만일 경우(예외 발생 X)
		userID = "abcdefg1234";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		//출력 잘 됐음으로 확인 후 값 가져오기
		System.out.println(test.getUserID()); //private이기 때문에 getter를 통해 값 가져오기
	}

}
