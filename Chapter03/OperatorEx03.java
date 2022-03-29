package Chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자 (&&, ㅣㅣ, ^, !) : 쇼트 서킷이 발생됨 (앞부분의 연산 결과를 인지할 수 있을 때 뒷부분은 연산을 생략)
		 * 비트 연산자 (& , ㅣ , ^ , ~ ) : 쇼트 서킷이 발생되지 않음
		 * */
		
		System.out.println("1. 논리 연산자 AND (&&) : 두 항이 모두 true 일때 결과가 true");
		System.out.println(true && true); //true, 쇼트 서킷이 발생되지 않음. 
		System.out.println(true && false); //false, 쇼트 서킷이 발생되지 않음.
		System.out.println(false && true); // false, 쇼트 서킷 발생됨 (앞에 false가 오면 뒤에 true가 오던지 false가 오던지 false가 되기 때문에)
		System.out.println(true && (5<3)); //false
		System.out.println((5 <= 5) && (7 > 2)); //true
		System.out.println((3 < 2) && (8 < 10)); //false, 쇼트서킷 발생
		
		System.out.println("2. 논리 연산자 OR (||) : 두 항중 하나만 true 이면 결과가 true");
		System.out.println(true || true); //true ; or연산에서 앞에 true가 오면 쇼트서킷 발생
		System.out.println(false || (5<3)); // false , 쇼트서킷 발생x
		System.out.println();
		
		System.out.println("1. 논리 연산자 XOR (^)"); //두 값이 같을 때 false, 두 값이 다를 때 true
		System.out.println(true ^ true); //false , 뒤에 값이 반드시 확인되어야 하기 때문에 쇼트 서킷이 발생되지 않는다. 
		System.out.println(false ^ false); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println((5 <=5 ^ (7 > 2))); //false , 두개 다 트루임
		System.out.println();
		
		System.out.println("1. 논리 연산자 NOT (!)"); //true이면 false, false 이면 true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3)); //true
		System.out.println();
		
		System.out.println("=====쇼트 서킷을 사용하는 여부(논리연산자일 때 발생, 비트연산자일때는 발생되지 않음========");
		int value2 = 3;
		System.out.println(true & value2++ == 3); //false, 쇼트서킷 발생
		System.out.println(value2); 	//value2가 4가 되어야 하는데 쇼트서킷으로 인해서 뒤에 계산이 생략되어 value2가 그대로 3이 됨
		
		int value3 = 3;
		System.out.println(true & value3++ == 3);
		System.out.println(value3);  //4, 쇼트 서킷이 발생되지 않아 4가 됨
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6);
		System.out.println(value4);
		
		int value5= 3;
		System.out.println(true | ++value5 > 6); //true
		System.out.println(value5); //4, 쇼트서킷이 발생되지 않음
		
		
		
				
		
		
	}

}
