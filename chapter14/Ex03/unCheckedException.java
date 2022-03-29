package chapter14.Ex03;

//실행예외(unCjecked Exception, RunTime Exception) : 컴파일 단계에서는 예외 발생되지 않음

class AA{}
class BB extends AA{}
public class unCheckedException {
	public static void main(String[] args) {
		//실행 예외
		
		// ArithmeticException : 0으로 어떤 수를 나누면 오류가 발생
		//System.out.println(10 / 0);
		
		// ClassCastException : 클래스의 타입을 변환할 떄 변환되지 않는 예외
		AA aa = new AA();
		//BB bb = (BB) aa;  // 컴파일 단게에선 오류가 발생되지 않는다. -> AA를 BB타입으로 다운캐스팅 불가
		
		int[] array = {1,2,3};
		System.out.println(array[2]);
		// ArrayIndexOutOfBoundsException : 배열에 존재하지 않는 방번호를 출력할 경우 
		// System.out.println(array[3]);
		
		// NumberFormatException :문자형의 숫자를 정수타입으로 변환할 수 없는 예외 발생
		// int num = Integer.parseInt("10!");
		int num2 = Integer.parseInt("10"); //문자열 10을 정수로 변환
		System.out.println(num2);
		
		// NullPointerExceptio: 객체가null인테 메서드를 호출하는 경우 발생
		String string = null;
		System.out.println(string.charAt(4)); // 문자열에서 index 4번째 값을 가지고 아
		
		
	}
}
