package Test;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// 임의의 운동을 넣고 해당 운동의 구성원(명수)를 넣어서 출력
		// 탁구 2 야구 9 축구 11 농구 6 씨름 2
		// 출력 -> 탁구 : 2, 야구 : 9, 축구 : 11, 농구 : 6, 씨름 :2
		// 운동종목 구성원 총 합계 : 
		// 운동종목 구성원 평균 구성원수 :
		//"그만"이라고 입력하면 프로그램 종료
		
		Scanner scanner = new Scanner(System.in);
		String exr;
		String array[];
		
		while (true) {
			System.out.println("운동과 구성원 수를 공백으로 나눠서 입력하세요 >>> ");
			exr = scanner.nextLine();	//입력받을 값:exr
			array = exr.split(" ");
			
			if(exr.equals("그만")){
				break;
			}
			method(array);
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
		
		static void method(String ...valStrings){
			double avg;
			int sum = 0;
			
			for (int i = 0; i < valStrings.length; i++) {
				if(i % 2 != 0) {
					sum += Integer.parseInt(valStrings[i]);	//홀수 index 정수변환
				}
			}
			avg = (double) sum/(valStrings.length/2);
			
			for (int i = 0; i < valStrings.length; i++) {
					if(i%2==0) {			//출력 짝수번째
						if (i+2 == valStrings.length) {		//마지막 짝수번째
							System.out.print(valStrings[i] + " : " + valStrings[i+1]);
							break;
						}else { 
							System.out.print(valStrings[i] + " : " + valStrings[i+1] + " , ");
						}
					}
				}
			System.out.println();
			System.out.println("운동 종목 구성원의 총 합계 : " + sum);
			System.out.println("운동종목 구성원 평균 구성원수 : " + avg);
			
		}
}

//					if(i % 2 == 0 && i+1 % 2 != 0) {
//					System.out.print(valStrings[i] + " : " + valStrings[i+1]+ " ");
//					}
//					
//					//마지막방까지 갔을 때 값이 없을 때
//					if(i == valStrings.length - 1) {
//						System.out.print(valStrings[i] + " : " + valStrings[i+1] + " ");
//						break;
//					}
//					