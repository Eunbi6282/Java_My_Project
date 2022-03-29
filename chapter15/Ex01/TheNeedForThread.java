package chapter15.Ex01;
public class TheNeedForThread {
	public static void main(String[] args) {
		// 1. 비디오 프레임 1 ~ 5
		int[] intArray = {1,2,3,4,5};
		
		// 2. 자막 프레임 : 하나 둘 셋 넷 다섯
		String[] strArray = {"하나","둘","셋","넷","다섯"};
		
		// 3. 비디오 프레임 출력 
			////동시 작업시 cpu의 속도가 너무 빠르기 때문에 잠시 순서대로 딜레이를 시켜줌
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("(비디오 프레임)" + intArray[i]);
			
			try {		// 0.2초동안 일시정지 -> 시작
				Thread.sleep(200);
			} catch (InterruptedException e) {
			} 	
		}
		// 4. 자막 프레임 출력
		for (int i = 0; i < strArray.length ; i++) {
			System.out.println("(자막번호)" + strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			} 
		}
	}
}
