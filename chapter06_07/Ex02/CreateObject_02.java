package chapter06_07.Ex02;
class Aaa{
	String nameString;	//필드 : 객체화 시켜야 사용 가능
	int age;			//필드의 값들은 heap영역에 저장, Heap영역의 변수들은 강제 초기화
	String emailString;// 필드는 선언만 되고 값이 할당이 되지 않는 경우 :
						//참조변수 : Null , int : 0; double: 0.0
	double weigth;
	boolean man;
	
	//메소드
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String na) {	//인풋되는 변수, 받는 변수 이름, 메모리 이름이 모두 동일 할 경우
		nameString = nameString;				// 메모리 이름에 this 지정해 줘야 함: 자신의 클래스 변수
	}										
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
}

public class CreateObject_02 {

	public static void main(String[] args) {

		Aaa aaa = new Aaa();	//객체생성(aa)
		
		//필드의 초기값 출력
		System.out.println(aaa.nameString);
		System.out.println(aaa.age);
		System.out.println(aaa.weigth);
		System.out.println(aaa.man);
		System.out.println(aaa.emailString);   // 선언만 되어있고 값을 할당하지 않음 -> heap영역에 저장되어 
												//-> heap영역에 저장되어 초기값 출력
		System.out.println("---------------------");
		//변수의 값을 직접대입[Heap] , 보안상 메모리에 직접 값을 항당하지 않는다. 캡슐화
		aaa.nameString = "박은비";
		aaa.age = 30;
		aaa.weigth = 55.0;
		aaa.man = false;
		aaa.emailString = "eunbi6282@gmail.com";
		
		//변수의 값을 출력
		System.out.println(aaa.nameString);
		System.out.println(aaa.age);
		System.out.println(aaa.weigth);
		System.out.println(aaa.man);
		System.out.println(aaa.emailString);

		//setter를 통해서 값을 대입, 메모리에 값을 넣을 때 제어를 할 수있다.
		//달을 저장하는 변수(1월~12월)
		aaa.setNameString("정재현");
		aaa.setAge(26);
		aaa.setEmailString("jaehyun0214@gmail.com");
		aaa.setMan(true);
		aaa.setWeigth(75.5);
		
		//getter를 통해서 값을 출력
		System.out.println(aaa.getNameString());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmailString());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeigth());
	}

}
