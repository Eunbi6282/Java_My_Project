package chapter06_07.Ex02;
class Abc {
	int m = 3;		//필드(heap에 저장)
	int n = 4;
	
	void work1() {		//메소드 (인풋값이 없는 메소드)
		int k = 5;		//지역변수 (stack영역에 저장): 메소드 안에서 선언된 변수 , 메소드 종료시 없어진다. 
		System.out.println(k);
		work2(3);		//다른 메소드 호출
	}
	
	void work2(int i) {
		int j =4;	//지역변수(stack공간에 변수와 값이 저장)
		System.out.println(i + j);
		
		int l;
		
		//System.out.println(l);  -> 류
		//지역변수는 stack영역에 저장되므로 강제 초기화가 ㅈ되지 않는다.
		//Heap영역은 강제 초기화가 됨
	}							
}
public class FieldComponent {

	public static void main(String[] args) {
		
		//클래스를 활용해서 객체(abc) 생성
		Abc abc = new Abc();
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		//메소드 호출
		abc.work1();
		abc.work2(0);
		
		
		
		
		
		
	}

}
