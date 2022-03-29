package Ex_T;

public class Ex06 {

	public static void main(String[] args) {
		int[] array = {4,5,1,8,3,10};
		int max = 0; 	//최대값 저장하는 변수
		
		//순환하면서 각 배열들을 비교하면서 더 큰 값을 max변수 값에 담음
		for (int i = 0; i < array.length; i++) { // 각 방에서 값을 가져옴
			if(array[i] > max) {	//각 방에 있는 값이 max보다 클 때 
				max = array[i];		//max에 큰 값을 담음
			}
		}
		System.out.println("최대값은 : " + max);
	
		
		
		
	}

}
