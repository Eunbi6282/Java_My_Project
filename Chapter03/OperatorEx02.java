package Chapter03;
public class OperatorEx02 {
	public static void main(String[] args) {
		//# 크기 비교( <, >, <=, >= ) ====> 결과값을 true, false로 리턴함
		System.out.println(5 < 2);
		System.out.println(-5 < 5);
		System.out.println(5 <= 5);
		System.out.println();
		
		//등가 비교 ( ==(같다) , !=(같지 않다) ) ===> 결과값을 true, false로 리턴함
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a == b);
		System.out.println(a != b); //같지 않으니 true
		System.out.println(a == c);
		System.out.println(a != c);
		
		//참조 자료형 등가 비교 (객체의 메모리의 번지를 비교)
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1 == str2);	//객체의 메모리의 번지를 비교
		System.out.println();
	
	}

}
