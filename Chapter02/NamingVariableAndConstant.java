package Chapter02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		// 변수명
		boolean aBcD; //변수명은 첫자는 소문자로 시작, 단어를 연결한 경우 첫단어는 대문자로
		byte 가나다라;  //변수명은 한글을 넣을 수 있다.(하지만 권장하진 않음)
		short _abcd;  //변수명에 특수문자_를 사용할 수 있다.
		char $ab_cd;  //변수명에 $를 사용할 수 있다.
		//char ab cd;  //공백이나 다른 특수문자는 넣을 수 없다.
		long abcd3;   //변수명에 숫자를 넣을 수 있다. 하지만 첫번째 단어에 숫자가 오면 오류 발생
		//long 3abcd;  //첫글자에 숫자가 오면 오류 발생
		double main;  
		//double class;  //자바에서 사용하는 예약어들은 변수명으로 사용할 수 없다.
		int ABCD;  //변수명은 대문자로 사용가능 (권장하진 않음), 상수는 상수명을 전체 대문자로 사용. 
		
		// 상수 : 값을 변경할 수 없다. final키워드를 사용한다. , 상수명은 대문자를 사용한다. 
		final double PI ; 
		final int MY_DATA;
		final float my_Data; // 권장하지 않음. 상수와 변수를 구분하기 위해서 상수명은 대문자를 사용한다. 
		
		PI = 3.141957;
		System.out.println(PI);
		
		//PI = 123.4567 // 상수는 선언하고 값을 할당한 후 새로운 값으로 재할당할 수 없다. 
						// (변수는 재할당 가능)
		
		System.out.println("=============");
		
		abcd3 = 1234L; //정수 데이터 타입 long형 변수에 값을 할당할 때 , l을 명시해 줌(대소문자 상관x)
		System.out.println(abcd3);
		abcd3 = 56789L;//변수에 값을 재할당
		System.out.println(abcd3);
		
		aBcD = true;  //aBcD는 boolean형 타입이므로 true, false만 넣을 수 있다.
		
		가나다라 = 127;  //byte : 1byte (-128 ~ +127)
		System.out.println(가나다라);
		//가나다라 = 128;
		
		
	}

}
