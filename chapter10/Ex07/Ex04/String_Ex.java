package chapter10.Ex07.Ex04;

class A{
	String nameString;
	A(String nameString){
		this.nameString = nameString;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nameString.toString();		//name을 toString()해주면 메모리의 값을 return 해줌 -> 값이 찍힘
	}
}

public class String_Ex {

	public static void main(String[] args) {
		
		String s0 = new String("안녕");	//
		String s1 = "안녕";		//String은 참조변수
		
		System.out.println(s0);		//String은 객체를 출력할 때 toString()이 재정의 되어있다. -> 위치값이 아닌 값을 찍게 됨
		System.out.println(s1);
		
		A a = new A("안녕");			//A객체를 찍어서 출력하면 위칫값이 나온다. but toStiring 정의해서 값이 나옴
		System.out.println(a);
	}

}
