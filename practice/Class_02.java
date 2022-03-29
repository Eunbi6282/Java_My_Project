package practice;

import javax.swing.AbstractAction;

class AA {
	int age;
	String name;
	String number;
	
	//get, set
	public int getAge() {		
		return age;	//retrun -> 메서드를 호출하는 곳으로 변수의 값을 던져줌
		// retrun 값이 int -> 정수로 값을 출력
	}
	public void setAge(int age) {	//void -> return값이 없다. 
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}


public class Class_02 {

	public static void main(String[] args) {
		//객체 생성(1개의 클래스에 여러개의 객체 생성 가능)
		AA aa = new AA();
		
		//객체의 메소드 호출
		System.out.println(aa.getAge());  // 값을 할당 안해서 초기값인 0출력 됨
		System.out.println(aa.getName());	//string 타입 -> 초기값 null
		System.out.println(aa.getNumber());
		
		System.out.println("--------------------------");
		
		//객체의 필드 호출
		System.out.println(aa.age);
		System.out.println(aa.name);
		System.out.println(aa.number);
		
		System.out.println("------------------------------");
		
		//메소드 호출
		//setters : 객체의 메모리에 값을 할당 , 
		//아직 출력할 수 없음 할당만 할 뿐 getter이용해 메모리값 출력
		aa.setAge(25);	// 객체에 변수 값을 할당
		aa.setName("박은비");
		aa.setNumber("010-2055-6282");
		
		//getters : 객체의 메모리의 값을 가지고 올 때
		System.out.println(aa.getAge());
		System.out.println(aa.getName());
		System.out.println(aa.getNumber());
		
		System.out.println("========2번째 객체 생성======");
		
		AA bb = new AA();
		
	}

}
