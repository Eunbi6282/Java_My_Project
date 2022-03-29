package chapter05;
public class NoneRectangleArray_Ex08 {
	public static void main(String[] args) {
		
		// 1.비정방형(NoneRectangle) 선언과 값 대입 방법 (첫 번째)
			//비정방형이란 ? 행에 따라서 열의 갯수가 각각 다르다. 
		int[][] array1 = new int [2][];		// 열의 방개수는 나중에 생성
		array1[0] = new int [2];			//index 0번 행에 열의방 2개 생성
		//값넣기
		array1[0][0] = 1;
		array1[0][1] = 2;
		
		array1[1] = new int [3];		//index 1번행의 열의 방 3개 생성;
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.print(array1[0][0] + " " + array1[0][1]);
		System.out.println();
		System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
		System.out.println();
		System.out.println("================================================");
		
		int[][] array2 = new int [2][];
		array2[0] = new int[] {1,2};		//값을 바로 할당
		array2[1] = new int[] {3,4,5};
		
		System.out.print(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		System.out.println("================================================");
		
		// 1.비정방형(NoneRectangle) 선언과 값 대입 방법 (두 번째) : 초기값을 알 수 있는 경우
		int [][] array3 = new int [][] {{1,2},{3,4,5}};		//비정향형으로 값을 바로 대입
		
		System.out.print(array3[0][0] + " " + array3[0][1]);
		System.out.println();
		System.out.println(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
		System.out.println();
		System.out.println("================================================");
		
		
		int [][] array4;
		array4 = new int [][] {{1,2},{3,4,5}};		//비정향형으로 값을 바로 대입
		
		System.out.print(array4[0][0] + " " + array4[0][1]);
		System.out.println();
		System.out.println(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
		System.out.println();
		System.out.println("================================================");
		
		// 1.비정방형(NoneRectangle) 선언과 값 대입 방법 (세 번째)
		int [][] array5 ={{1,2},{3,4,5}};		//비정향형으로 값을 바로 대입
		
		System.out.print(array5[0][0] + " " + array5[0][1]);
		System.out.println();
		System.out.println(array5[1][0] + " " + array5[1][1] + " " + array5[1][2]);
		System.out.println();
		System.out.println("================================================");
		
		/*
		int[][] array6;
		array6 = {{1,2                                                                                                                                                                                                            },{4,5,6}} ;	// 사용 불가능, new int를 생략하는 경우에는 값을 동시에 할당해야 함
		System.out.print(array6[0][0] + " " + array6[0][1] + " " + array6[0][2]);
		System.out.println();
		System.out.println(array6[1][0] + " " + array6[1][1] + " " + array6[1][2]);
		System.out.println();
		Sys
		*/
	}
}
