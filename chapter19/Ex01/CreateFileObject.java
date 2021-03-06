package chapter19.Ex01;

import java.io.File;  //파일과 폴더를 다루는 객체
import java.io.IOException;


// 주의: 이클립스에서 파일생성시 C:\\에 생성할 때 권한 문제로 인한 오류가 생길 수 있다. 
	// 문제해결 첫번째 방법 1: 이클립스를 <<관리자 권한>>으로 실행
	// 2. 폴더 내부에 파일을 생성 ex)"C:/temp001/newFile.txt"


// File객체 내의 폴더식별자를 적용할 경우 
//		C:\abc\abc.txt 
		
	// 1. Windows인 경우 : String path = "C:\\abc\\abc.txt"(역슬래시 두번 처리)  	""내에 특수문자를 처리하기 위한 기호 \ <= \를 처리해주기 위해서 \을 하나 더 붙임
	//    Windows10인 경우 : String path = "C:/abc/abc.txt" 
	// 2. Mac인 경우 : String path = "C:/abc/abc.txt" 

// 호환을 위해서 공통적으로 사용할 수 있는 코드작성 <슬래시가 들어가는 부분을  File.seperator 사용>
	// String path = "C:" + File.seperator + "abc" + File.separator + "abc.txt"


public class CreateFileObject {

	public static void main(String[] args) throws IOException {   //trhows 사용해서 예외처리 미룸 -> 예외처리 필요
		
		// 1. File객체 사용해서 폴더생성. 해당 파일이나 폴더가 존재하지 않는 경우 
		File tempDir = new File("C:/temp001");
		if(!tempDir.exists()) {    // .exist() 해당 경로에 파일이나 폴더가 존재하면 true, 존재하지 않는다면 false
			tempDir.mkdir();		// 폴더 생성 명령어. 
		}
		System.out.println(tempDir.exists());  // 파일이 경로에 존재하면 true/ 아니면 false
		
		// 2. File객체를 사용해서 파일 생성
		File newFile = new File("C:/temp001/newFile.txt"); //C드라이브에 바로 파일을 만들경우 권한 문제로 오류가 생길 수 있음 <= 이클립스를 관리자 권한으로 실행
		if(!newFile.exists()){		//newFile이 존재하지 않는다면)  
			newFile.createNewFile();   ////파일을 생성할 때 예외가 발생될 수 있다. 예외처리 필요.. 권한문제 등등등
		}
		System.out.println(newFile.exists());
		
		System.out.println("================");
		//3. 파일 구분자
		File newFile2 = new File("C:\\temp001\\newfile01.txt"); // Windows10 하위버전용
		File newFile3 = new File("C:/temp001/newfile02.txt");   //Window10 이나 Mac
		if(!newFile2.exists()) {newFile2.createNewFile();}
		if(!newFile3.exists()) {newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		//모든 OS에서 공통으로 식별가능한 코드
		File newFile4 = new File ("C:" + File.separator +"temp001" + File.separator + "newfile03.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
		
		// 4. 절대 경로로 처리 
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath()); //file 객체에 저장된 파일의 절대 경로를 출력.
		
		// 5. 상대 경로로 처리 < = 권장사항
		// 현재 나의 작업 폴더의 위치를 게더링해서 가져와야 함
		System.out.println(System.getProperty("user.dir"));  // 현재 작업폴더의 위치를 알려줌
			// 이클립스 실행 폴더 위치
		File newFile6 = new File("newfile06.txt");  // 상대경로로 출력
		if(!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
	}

}
