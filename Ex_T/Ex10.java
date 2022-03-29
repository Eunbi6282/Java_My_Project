package Ex_T;
public class Ex10 {
	public static void main(String[] args) {
		
		int a,b;	//a => 10의자리 표현, b => 1의 자리 표현
		
		for (int i = 1; i <= 99; i++) {
			a = i/10 ; 	//a => 10의자리 표현, i 를 10으로 나눠서 몫만 가져옴
			b = i%10;	//b => 1의자리 표현, i를 10으로 나눈 나머지값만 가져옴
			
			if((a == 3 || a== 6 || a == 9) && (b == 3 || b == 6 || b == 9)) { //십의자리, 일의자리모두 3,6,9의 배수
				System.out.println(i + " : 박수 짝짝");
			}else if ((a==3 || a==6 || a==9) && (b!=3 || b!=6 || b !=9)) {
				System.out.println(i + " : 박수 짝");
			}else if((a!=3 || a!=6 || a !=9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " : 박수 짝");
			}
		}
	}

}
