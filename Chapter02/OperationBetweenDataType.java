package Chapter02;
public class OperationBetweenDataType {
	public static void main(String[] args) {
		// 같은 자료형간의 연산
		int value1 = 3+5;	//int + int => int
		int value2 = 8/5;	//int / int => int
		float value3 = 3.0f + 5.0f;	//float + float => float
		double value4 = 8.0 / 5.0; //double + double => double
		
		byte data1 = 3;
		byte data2 = 5;
		
		//byte value5 = data1 + data2;	//오류 -> int보다 작은 자료형(short, byte)은 연산 결과를 int타입으로 반환
		int value5 = data1 + data2;	//int보다 작은 자료형은 연산 결과를 int타입으로 반환
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//다른 자료형 간의 연산
		//int value66 = 5 + 3.5;		//오류 
		double value6 = 5 + 3.5;	//int + double => double
		int value66 = (int)(5 + 3.5);	//다운캐스팅하면 int사용 가능
		
		double value8 = 5 / 2.0;	// 정수형 + 실수형 -> 실수형
		byte data3 = 3;
		short data4 = 5;
		
		//short value99 = data3+data4; //오류
		short value99 = (short)(data3+data4);
		int value9 = data3 + data4;	//int보다 작은 데이터 타입이 연산할 경우 int로 받아야 함
		double value10 = data3 + data4; // double형으로도 가능
		
		System.out.println(value6);
		System.out.println(value66);
		System.out.println(value8);
		System.out.println(value99);
		System.out.println(value9);
		System.out.println(value10);
		
		
		
	}

}
