package chapter05;
public class PrimaryAndReferenceType_04 {
	public static void main(String[] args) {
		
		// 1. 기본 데이터 타입의 대입 연산 (Stack 값을 복사)
		int value1 = 3;
		int value2 = value1;
		
		value2 = 7;
		System.out.println(value1);		//3
		System.out.println(value2);		//7
		System.out.println("==================");
		
		// 2. 참조 자료형의 대입 연산 (Stack의 힙의 주소(-> 참조 자료형은 값을 힙영역에 저장하기 때문)을 복사)
		int[] array1 = new int [] {3,4,5,7};
		int[] array2 = array1;		//array2는 스택영역에서 array1의 heap영역의 주소를 카피
		array2[0] = 7;
		System.out.println(array1[0]);		//7
		System.out.println(array2[0]);		//7
		System.out.println(array1);
		System.out.println(array2);
		
		

		
	}

}
