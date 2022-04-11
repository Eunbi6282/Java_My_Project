package chapter18.Ex08;

// 배열의 생성자 참조

interface A{
	int[] abc (int len);
}

public class RefOfArrayConstructor {

	public static void main(String[] args) {
		// 배열의 생성자 참조
		// 1. 익명 이너클래스
		A a1 = new A() {  // 배열선언 => int[] arr = new int[방의 개수];
			@Override
			public int[] abc(int len) {  //정수로 len값을 받아서 
				return new int[len];    // 정수를 input받아서 배열의 방의 크기를 리턴 돌려줌
			}
		};
		
		// 2. 람다식
		A a2 = (int len) -> {return new int[len];};
		
		// 3. 배열의 생성자 참조 표현식
		A a3 = int[] :: new; 
		
		// 배열 선언 구문
		// int[] array1 = new int[3];   ==> 배열 선언 동시에 방번호 할당
		// int[] array2 = new int[] {1,2,3,4,5};  ==> 선언과 동시에 값 할당
		// int[] array2 = {1,2,3,4,5};  ==> 선언과 동시에 값 할당
		
		
		int[] array1 = a1.abc(3);
		System.out.println(array1.length);
		
		int[] array2 = a2.abc(4);
		System.out.println(array2.length);
		
		int[] array3 = a3.abc(5);
		System.out.println(array3.length);
		
		

	}

}
