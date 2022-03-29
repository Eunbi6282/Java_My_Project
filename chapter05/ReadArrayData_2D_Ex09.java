package chapter05;
public class ReadArrayData_2D_Ex09 {
	public static void main(String[] args) {
		// 1. 2차원 데이터 배열의 길이
		int[][] array1 = new int [2][3];
		System.out.println(array1.length);  // 2차원 배열인 경우 :.length -> 행의 개수 출력
		System.out.println(array1[0].length);	// 행의 인덱스 0의 열의 개수
		System.out.println(array1[1].length);	// 행의 인덱스 1의 열의 개수
		
		int[] array11 = new int [10];
		System.out.println(array11.length);	// 1차원 배열인 경우 :.length -> 열의 개수 출력
		System.out.println();
		System.out.println("=========================");
		
		// 2차원 배열 출력 방법 1
		int [][] array2 = new int [][] {{1,2},{3,4,5}};
		
		//2차원 배열에서 행, 열 개수
		System.out.println(array2.length);		// 2 (행의 개수)
		System.out.println(array2[0].length);	// 2 (0번 행의 열의 개수)
		System.out.println(array2[1].length);	// 3 (1번 행의 열의 개수)
		System.out.println("=========================");
		
		// 배열의 index 번호로  출력하는 방법
		System.out.print(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.print(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		
		System.out.println();
		System.out.println("==========이중 for문을 사용해서 출력==================");
		
		//이중for문을 사용해서 출력하는 경우 (2차원배열이기 때문에 이중for문 사용)
		for (int i = 0; i < array2.length; i++) {		//바깥쪽 for문 : 행을 loop돌림
			for (int j = 0; j < array2[i].length; j++) {	// i -> 행의 번호 , 안쪽 for문 : 열을 loop돌림
				 System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============이중 enhanced for 문=======================================");
		for (int[] array : array2) {	// 2차원 배열의 행의 값을 1차원 배열 변수(array)에 담고  
			for (int k : array) {		//배열의 값을 변수에 담아서 출력
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		int [][] a = {{1,2,3,4,5},{1,2,3}};
		
		System.out.println(a.length);
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int[] is = a[j];
				
			}
		}
		
		
	}

}
