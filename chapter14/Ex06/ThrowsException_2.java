package chapter14.Ex06;

	//일반예외(Checked Exception) : 컴파일 단계에서 예외
		//1.직접 처리하는 경우
		// 2. thorws 미루는 경우

	//main 메서드에 throws를 전가시키는 경우,Exception이 발생될 경우 : 정보를 출력(오류메세지)해주고 중지. exception처리는 x

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//정상적으로 파일 존재 -> ClassNotFoundException발생되지않음
		Class cls = Class.forName("java.lang.Object");
		
		//파일이 존재하지 않음 -> ClassNotFoundException발생
		Class cls2 = Class.forName("java.lang.Object000");

	}

}
