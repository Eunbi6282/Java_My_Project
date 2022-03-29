package Chapter02;

public class FloatVsDouble {
	public static void main(String[] args) {
		// Float vs Double 의 정밀도 : float은 7자리가지 , double은 15자리까지
		
		float f1 = 1.0000001f; //float에는 변수에 값을 담을 때, f(대소문자 상관x)로 명시하여 저장
		System.out.println(f1);
		float f2 = 1.00000001f;
		System.out.println(f2); //7자리가 넘어가면 잘려서 처리됨
		System.out.println("=====================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2); //15자리가 넘어가면 잘려서 처리됨
		
		
		
		
		

	}

}
