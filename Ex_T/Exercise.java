package Ex_T;

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
		System.out.println("운동이름과 구성원 수를 공백을 이용해서 입력하세요");
		System.out.println("예시) 입력 >>> 탁구 : 2, 야구 : 9, 축구 : 11, 농구 : 6, 씨름 :2");
		
		String str;	//전체 string값을 인풋받는 변수
		String[] array;	//공백을 기준으로 잘라서 배열에 저장하는 변수
		
		int sum;	//운동 구성원의 멤버의 합을 저장하는 변수 
		int memberCount; 	
		double avg;	//평균을 구하는 변수 
		int b;		//각 종목의 구성원을 담는 변수
		
		do {
			sum = 0;	//계속 루프가 돌아가기 때문에 초기화를 do while문 안에 해줘야 함
			avg = 0;
			b = 0;
			memberCount = 0;
			
			str = scanner.nextLine();	//sc.next() : 공백까지만 String으로 잡는다.
										//sc. nextLine() : 엔터까지 전체를 String으로 잡는다. 
			
			if(str.equals("그만")) {		//
				break;
			}
			
			array = str.split(" ");		//str을 공백을 기준으로 잘라서 arr배열에 대입
			for (int i = 0; i < array.length; i++) {	//arr.length : 배열의 index 0번방 부터 마지막방까지
				if(i % 2 != 0) {	// i : 방의 번호이고 숫자만 가지고 온다. 
					b = Integer.parseInt(array[i]);	//각방의 String 타입을 정수로 변환
					sum += b;		//sum = sum + b		//sum : 전체 구성원의 합
					memberCount++;	//avg = sum / memberCount
				}
			}
			avg = (double) sum / memberCount;
			
			System.out.println(str);
			System.out.println("구성원의 총합 : " + sum);
			System.out.println("구성원의 평균 : " + avg);
			
		
			
		} while (true);
		
	}

}
