package chapter19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() 메서드의 유용한 정보들
		
		System.out.println(System.getProperty("user.dir"));  	// 현재 작업 디렉토리를 출력
		System.out.println(System.getProperty("java.version")); // Java버전
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home")); //Java설치 홈폴더
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name")); // 로그온 한 계정
		System.out.println(System.getProperty("user.home")); // 로그온 한 계정의 홈폴더
		System.out.println(System.getProperty("os.name")); //OS정보
		System.out.println(System.getProperty("os.arch")); //OS아키텍쳐
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("file.separator")); // 폴더 구분자가 뭐냐 -> \
		System.out.println(System.getProperty("path.separator")); // ;
		System.out.println(System.getProperty("line.separator")); // 라인 구분자

	}

}
