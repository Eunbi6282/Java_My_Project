package chapter10.Ex07.Ex04;
class AA{
	String nameString;
	AA (String nameString){
		this.nameString = nameString;
	}
}
class BB{
	String nameString;
	BB (String nameString){
		this.nameString = nameString;
	}
	@Override
	public String toString() {		//원래(패키지명.클래스명@해쉬코드 -> name 필드의 값을 출력)
		// TODO Auto-generated method stub
		return nameString.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if (this.nameString == ((BB)obj).nameString) {
			return true;
		}else {
			return false;
		}
	}
	
}
public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String ("안녕");
		String s2 = "안녕";
		
		System.out.println(s1); //String 클래스는 toString()이 재정의되어 있다.
		System.out.println(s1.equals(s2)); //true -> //String 클래스는 equals도 재정의되어 있다.
			// 값을 비교하도록 재정의
		
		AA aa1 = new AA("안녕");
		AA aa2 = new AA("안녕");
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));	//객체의 주소를 비교하기 때문에 false
		
		BB bb1 = new BB("안녕");
		BB bb2 = new BB("안녕");
		
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
	}

}
