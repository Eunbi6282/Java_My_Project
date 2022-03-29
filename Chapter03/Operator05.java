package Chapter03;
public class Operator05 {
	public static void main(String[] args) {
		
		//상황 연산자 : (조건)? 참 : 거짓
		int value1 = (3>5)? 6 : 9;	//참이면 6, 거짓이면 9
		System.out.println(value1);
		
		int value2 = (5 > 3)? 10:20;	//조건이 참이므로 vlaue2에 10이 저장됨
		System.out.println(value2);
		
		int value3 = 5;
		System.out.println((value3 % 2 == 0)? "짝수" : "홀수"); // 나머지가 0이 아니므로 false, "홀수"출력
		System.out.println("======================");
		
		//if 문으로 처리
		if (value3 % 2 == 0) {
			System.out.println("짝수");
		}else {
				System.out.println("홀수");
			}
		}
	}


