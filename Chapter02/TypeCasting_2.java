package Chapter02;
public class TypeCasting_2 {
	public static void main(String[] args) {
		/*
		 * 타입 캐스팅 : byte < short < char < int < long < float < double
		 * 	- 업캐스팅 : 작은 자료형에서 큰 자료형으로 변환되는 것
		 * 	- 다운 캐스팅 : 큰 자료형에서 작은 자료형으로 변환되는 것
		 * 
		 * 	정수형은 기본적으로 int로 저장됨
		 * 	실수형은 기본적으로 double로 저장됨
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("=======자동으로 타입 변환=======");
		float value1 = 3;	//int(3) ---> float으로 자동으로 업캐스팅 됨
		long value2 = 5;	//int(5) ---> long 데이터 타입으로 자동으로 업캐스팅
		double value3 = 7;	//int(7) ---> double 데이터 타입으로 자동으로 업캐스팅
		byte value4 = 9;	//int(9) ---> byte 데이터 타입으로 자동으로 다운캐스팅
		short value5 = 11;	//int(11) ---> short 데이터 타입으로 자동으로 다운캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("=======수동으로 타입 변환=============");
		
		byte value6 = (byte) 128;	//int ---> byte 타입으로 수동으로 타입 변환 (다운 캐스팅)
		int value7 = (int) 3.5;		//소수값이므로 기본형 double ---> int 타입으로 수동으로 타입 변환 (다운 캐스팅)
		float value8 = (float) 7.5;	//double ---> float 타입으로 수동으로 타입 변환 (다운 캐스팅)
		float value9 = 7.7F;		//double ---> float 타입으로 수동으로 타입 변환 (다운 캐스팅)
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		//
		
	}

}
