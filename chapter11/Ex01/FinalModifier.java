package chapter11.Ex01;
/* Final : 마지막
 		- 필드명, 지역변수명 앞에 final: 상수로 바뀜 / final double PI = 3.14; (값변경x)
 				: 상수는 값을 변경할 수 없다. 
 				: 클래스 영역내의 상수 영역에 값이 복사. 객체나 메소드가 사라질 경우에도 호출이 가능
 		- 메소드명 앞 : 오버라이딩 할 수 없는 메소드 (자식클래스에서 메소드 오버라이딩 불가) 
 				/ final void print(){} 
 		
 		- 클래스명 앞 : 상속이 불가함  / final class A{} (자식을 가지지 못함)
  
 */

class A1 {
	int a = 3;			//필드명, 지역변수명은 소문자, 여러 문자가 이어질 경우 첫자를 대문자
	final int B = 5;	//final을 사용한 변수는 대문자로, 상수명은 대문자
	A1(){}
	
}
class A2{
	int a = 3;			//필드명, 지역변수명은 소문자, 여러 문자가 이어질 경우 첫자를 대문자
	final int B;	//final을 사용한 변수는 대문자로, 상수명은 대문자
	A2(){
		a = 3;
		B = 5;
	}
}
class A3{
	int a= 3;
	final int B = 5;
	A3(){
		a = 5;
		// B= 10;	//final은 값을 수정할 수 없다. 
	}
}
class B{
	void bcd(){		//지역변수(메서드 안에 있는 변수) -> stack에 저장
						//지역변수의 값은 메소드 호출이 끝나면 사라짐
		int a = 3;
		final int B = 5;    //final이 붙어 상수가 된 B -> 상수는 상수 영역에 저장됨, 메소드가 끝나더라도 상수영역에 남아있음
		a = 7;
		// b = 9;	//final은 값을 변경할 수 없다. 
	}
}
public class FinalModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
