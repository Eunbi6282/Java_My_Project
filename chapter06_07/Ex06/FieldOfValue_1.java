package chapter06_07.Ex06;

/* 객체의 필드에 값을 할당하는 세가지 
 * 1. 필드에 직접대입
 * 	  ==> 객체 생성 후
 * 2. setter를 통해 객체의 필드에 값을 부여(내가 원하는 값만 컨트롤 가능)
 *    ==> 객체 생성 후 'new'
 * 3. 생성자를 통해서 객체에 필드 값을 부여(내가 원하는 값만 컨트롤 가능)
 *    ==> 객체를 생성할 때 초기값으로 필드에 값을 할당
 * 
 * */

class Aa{	//객체 생성후 직접 필드에 값을 할당하는 경우
	String nameString; //이름
	int age;		   //나이				
	String mailString; //메일주소
	
	void print() {
		System.out.println("name : " + nameString + " age : " + age + " mail : " + mailString);
	}
}

class Bb{
	String nameString; //이름
	int age;		   //나이				
	String mailString; //메일주소
	
	public void setName(String nameString) {
		this.nameString = nameString;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mailString) {
		this.mailString = mailString;
	}
	
	void print() {
		System.out.println("name : " + nameString + " age : " + age + " mail : " + mailString);
	}
}

class Cc{
	String nameString; //이름
	int age;		   //나이				
	String mailString; //메일주소
	
	Cc(String a,String b, int c) {
		nameString = a;
		mailString = b;
		age = c;
	}
		
	void print() {
		System.out.println("name : " + nameString + " age : " + age + " mail : " + mailString);
	}
}
public class FieldOfValue_1 {

	public static void main(String[] args) {
		// 1. 객체의 필드에 직접 값을 할당.
		Aa aa = new Aa();
		
		aa.age = 25;
		aa.mailString = "eunbi628268@gmail.com";
		aa.nameString = "박은비";
		aa.print();
		
		//2. 객체의 setter을 사용해서 필드의 값을 부여
		Bb bb = new Bb();
		
		bb.setAge(25);
		bb.mailString = "eunbi628268@gmail.com";
		bb.nameString = "박은비";
		bb.print();
		
		//3. 생성자를 사용해서 필드의 값을 부여
		Cc cc = new Cc("박은비", "eun628268@gmail.com", 25);
		cc.print();
		
		

	}

}
