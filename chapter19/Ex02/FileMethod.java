package chapter19.Ex02;

import java.io.File;

public class FileMethod {
	public static void main(String[] args) {
		// 1. C:\에 작업폴더 생성(temp)
		File tempDir = new File("C:/temp");
		if (!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		// 2. 파일객체 생성(C:\Windows)
		File file = new File("C:/windows");
		
		// 3. File객체의 여러 메서드 사용
		System.out.println("절대 경로 출력 : " + file.getAbsolutePath());
		System.out.println("폴더인지 확인 : " + file.isDirectory()); // 폴더면 true, 아니면 false
		System.out.println("파일인지 확인 : " + file.isFile());  // 파일이면 true, 아니면 false
		System.out.println("파일/ 폴더 이름 출력 : " + file.getName());  // 파일, 폴더 이름 출력
		System.out.println("부모 폴더를 출력 : " + file.getParent());  // 부모 폴더를 출력
		
		File newFile1 = new File("C:/temp/abc");  
		System.out.println(newFile1.mkdir());  //temp밑에 abc폴더를 만들어라
		 // 출력구문 안에 newFile1.mkdir()를 찍으면 폴더를 잘 생성한 경우 -> true, 폴더가 존재해서 생성하지 못한경우 -> false
			// 그래서 맨 처음에 실행한 값만 true가 나온다. 여러 이유로 인해서 false(해당 폴더가 존재하는 경우, 권한 문제로 만들 수 없는 경우 , 하위폴더)
		System.out.println(newFile1.exists()); 	//폴더가 존재하기 때문에 항상 true
		
		File newFile2 = new File("C:/temp/bcd/cde");  //하위의 폴더를 한꺼번에 생성하기
		System.out.println(newFile2.mkdir());   // 얘로는 생성 불가능 -> .mkdir() 하위폴더 생성 불가능
			//false , 하위폴더까지 한꺼번에 생성 불가능
		System.out.println(newFile2.mkdirs()); // true , 하위폴더까지 한꺼번에 생성됨
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdirs());  //하위폴더까지 한꺼번에 만들어라 //true
		
		// 4. File객체를 사용해서 하위폴더의 정보추출
		File[]	frame = file.listFiles();    // file : "C:\Windows" 하위의 모든 폴더나, 파일의 이름을 파일 배열에 저장	
		
		for (File k : frame) {  //데이터 타입 File, 배열안에 들어있는 
			System.out.println((k.isDirectory() ? "폴더 : " : "파일 : " ) + k.getName()); // true면 "폴더" 그렇지 않으면 "파일" 출력
				//.getName() 폴더와 파일 이름 모두 출력
		}
		
		
		

	}

}
