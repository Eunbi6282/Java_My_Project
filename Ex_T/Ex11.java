package Ex_T;
public class Ex11 {
	public static void main(String[] args) {
		//기본 자료형일때 : == (값을 비교)
		//참조 자료형일때 : == (참조하는 주소의 번지를 비교)
		//참조 자료형일때 값을 비교: str1.equals(str2) <=참조변수 str1 값과 str2에 들어가 있는 값을 비교
		
		//String에 값을 할당할 때 생성자(new) 이용 //별도의 메모리 공간을 가짐
		String aa = new String ("안녕");
		String bb = new String("안녕");
		System.out.println(aa);
		System.out.println(bb);
		
		if(aa == bb) {	//메모리의 주소값을(aa,bb) 비교
			//참조 자료형에서 "=="는 메모리 주소를 비교한다. (메모리 주소가 같은지를 확인)
			System.out.println(true);
		}else {
			System.out.println(false); //aa와 bb는 다른 메모리 주소를 가진다.
		}
		System.out.println("===============");
		
		if(aa.equals(bb)) {			//메모리의 값을 비교할 때
			System.out.println(true);	//값은 같음
		}else {
			System.out.println(false);
		}
		
		System.out.println("=====================");
		
		
		//String에 literal값을 바로 할당하는 2가지 방법 //메모리 공간을 공유함
		String a = "안녕";
		String b = "안녕";
				
		if(a == b) {		//참조 자료형에서 "=="는 메모리 주소를 비교한다. (메모리 주소가 같은지를 확인)
			System.out.println(true); //aa와 bb는 같은 메모리 주소를 가진다.
		}else {
			System.out.println(false);
		}
	}

}
