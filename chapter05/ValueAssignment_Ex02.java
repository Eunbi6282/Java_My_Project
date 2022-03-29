package chapter05;
public class ValueAssignment_Ex02 {
	public static void main(String[] args) {
		//1. 배열 변수의 방에 값 할당하기 ( 3가지 )
		int[] array1= new int[3];	//배열 변수 : array1, 방크기 : 3,    방번호(index):0,1,2
					// array1[0] 0번째 방, array1[1] 1번째 방, arrary1[2] 2번째 방
		
		//배열의 각 방에 값을 할당
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1]+ " " + array1[2]);
		System.out.println("============================");
		
		int[] array2= new int[3];	//배열 변수 : array1, 방크기 : 3,    방번호(index):0,1,2
				// array1[0] 0번째 방, array1[1] 1번째 방, arrary1[2] 2번째 방
		
		//배열의 각 방에 값을 할당
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0] + " " + array2[1]+ " " + array2[2]);
			
		//배열의 원소값을 대입하는방법2  : 배열에 넣을 초기값을 알 때
		int[] array3 = new int[] {6,7,8,9,10};	//배열 변수 선언과 동시에 값할당, 초기값을 알 때
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] + " " +
		array3[3] + " " + array3[4]);
		
		System.out.println("===============");
		
		int[] array4;				//선언을 하고 값 넣기
		array4 = new int[] {3,4,5}; 
		System.out.println(array4[2]+ " ");  //2번방의 값만 찍어줭
		
		System.out.println("==================");
		
		//배열의 원소값을 대입하는 방법3
		int[] array5 = {10,11,12,13};	//new 키워드 없이 사용
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2] + " " + array5[3]);
		
		//int[] array6;				//한 라인에 바로 적으면 new int생략해도 가능하지만 이렇게 변수를 할당하고 new int를 선언하면 오류 발생
		// array4 = {3,4,5}; 
		//System.out.println(array6[2]+ " ");
		
		
	}

}
