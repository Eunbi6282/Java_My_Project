package chapter10.Ex07.Ex03;

import java.util.HashMap;
//HashMap : Key = 값으로 저장되는 자료구조.
	// Key는 절대로 중복 될 수 없다. 
	//HashMap의 Key에 객체를 저장할 경우, Key에 저장되는 객체가 중복되지 않는 고유한 정보를 저장해야 한다.
	//Object클래스의 hashcode()를 사용해서 객체가 key에 저장될 경우 중복죄디 않도록 설정
class A{
	String nameString;
	A(String namesString){
		this.nameString = namesString;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.nameString == ((A)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return nameString;
	}
	
}
class B{		//hashCode() + equals() <- 재정의  
	String nameString;
	B(String namesString){
		this.nameString = namesString;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.nameString == ((B)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return nameString.hashCode();
	}
	@Override
	public String toString() {
		return nameString;
	}
}
public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hml= new HashMap<>();	
			//<Integer <==Key(키)
			// String <== Value(값)
		hml.put(1, "데이터1");
		hml.put(1, "데이터2");		
			//1 : 데이터1 ==> 데이터2로 바뀜(마지막 값으로 바뀜)
		hml.put(2, "데이터3");
		System.out.println(hml);
		System.out.println("==========");
		
		//Key에 객체를 만들경우
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		
		System.out.println(hm2); 	//HashMap이 잘못 구현된 경우{첫번째=데이터1, 두번째=데이터3, 첫번째=데이터2}
																//-> Key가 중복되어서 출력됨
		
		System.out.println("============");
		HashMap<B, String> hm3 = new HashMap<>();	//hashcode() + equals()재정의
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		
		System.out.println(hm3); 	//HashMap의 구현이 제대로 된 경우 : Key가 중복되면 안된다. 
			//원래 객체만 찍으면 객체의 주소만 출력 됨 but,
			//hm3(HashMap의 객체)는 toString()가 재정의되어 있어 객체를 찍어도 값이 출력됨
		
		System.out.println("첫번째".hashCode());
		System.out.println("첫번째".hashCode());
		System.out.println("두번째".hashCode());
	}
	

}
