package Chapter02;
public class TypeCasting_1 {
	public static void main(String[] args) {
		
		System.out.println("======캐스팅 방법1 : 자료형을 선언=======");
		//int value1 = 5.3;  //오류 -> 정수값만 넣어야함
		int value1 = (int) 5.3;  //캐스팅 : 자료형 변환해서 변수에 값을 할당
		long value2 = (long) 10.333;
		float value3 = (float) 5.8;
		double value4 = (double) 5; //정수 5를 double 형식으로 변환
		double value5 = 10; 
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		System.out.println("====캐스팅방법2: L,F 라고 선언해서 캐스팅, long(l,L), float(f,F)=======");
		long value6 = 10L;
		long value7 = 10l;
		float value8 = 5.8f;
		float value9 = 5.8f;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
				
		
		
		
		
	}

}
