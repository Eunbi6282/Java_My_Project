package Chapter01;


public class Ex01_ConsolOut02 {

	public static void main(String[] args) {
		System.out.printf("나의 나이는 %d 입니다. \n", 30); //prinf -> "출력 포멧",인자, 인자	/ %d는 뒤에 인자값을 넣어서 출력(10진수0}
		
		System.out.printf("%o\n", 10); //%o 는 8진수를 인자값으로 받을 때
	    System.out.printf("%x\n", 30); //%x 는 16진수를 인자값으로 받을 때
	    System.out.printf("%s\n", "출력"); //%s 는 문자열을 인자값으로 받을 때
	    System.out.printf("%f\n", 5.80000); //%f는 실수값을 인자값으로 받을 때
	    System.out.printf("%4.2f\n", 5.8); //%4.2f 는 전체 4자리, 소숫점이하 2자리를 인풋 받을 때 ex) 5.8000000dl이면 5.800에서 소숫점 2자리 만 5.80
	    System.out.printf("%d 와 %4.2f", 10, 5.8);
}
}