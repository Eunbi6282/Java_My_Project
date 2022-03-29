package Test;
import java.util.Scanner;
public class Flexible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>> ");
		int a = 0;					//a의 크기만큼 입력받음
		a = sc.nextInt();
		int []num = new int [a];	//a크기의 변수 배열 선언
		
		for (int i = 0; i < num.length; i++) {	//a크기만큼 반복
			num[i] = sc.nextInt();	//배열에 값 넣기
		}
		
		method1(num);
	}
	public static void method1 (int...values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}	//합계 계산
		
		double avg = sum/values.length;
		System.out.println("합계 : " + sum + "평균 : " + avg);
	}
}