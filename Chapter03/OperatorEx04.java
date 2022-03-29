package Chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		/*
		 * 대입 연산자( = , +=, -=, *=, /=, >>=, <<=, >>>=)
		 * a = b;  <= 오른쪽에 있는 값을 a에 대입해라
		 * a += b <= a = a + b
		 * a -= b <= a = a - b
		 * a *= b <= a = a * b
		 * a /= b <= a = a / b
		 * a &= b <= a = a & b
		 * a |= b <= a = a | b
		 * a <<=b <= a = a << b
		 */
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		int value2;			//기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당됨
		value2 = 5;			//참조 자료형인 경우 변수의 값을 할당 하지 않을 경우 기본값으로 NULL
		//축약 표현
		System.out.println(value2 += 2); // value2 = value2 + 2
		System.out.println(value2 -= 2); // value2 = value2 -2
		System.out.println(value2 /= 2); //value2 = value2 / 2
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 |= 2); // value2 = value2 | 2
		value2 = 5; System.out.println(value2 &= 2); // value2 = value2 & 2
		
		value2 = 5; System.out.println(value2 <<= 2); // value2 = value2 << 2 //결과값은 20
		value2 = 5; System.out.println(value2 >>= 2); //value2 = value2 >>2
		
		value2 = 5; System.out.println(value2 >>>= 2); //value2 = value2 >>> 2	
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);
		
	}

}
