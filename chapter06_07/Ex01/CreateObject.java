package chapter06_07.Ex01;

class AA {
	String name;	//필드(멤버) : 인스턴스화 시켜야 사용이 가능 [Heap]
	int age;		
	String email;
	
	public String getName() { 		//메소드(멤버) : 인스턴스화 시켜야 사용 가능
		return name;				// Heap공간에 주소만 저장됨, 실제 값은 Class 영역 내의 메소드 영역에 저장됨
	}
			//return : 메서드를 호출하는 곳으로 변수의 값을 던져준다.
	
	public void setName(String name) {		//void : 리턴값이 없다를 알려주는 식별자
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class CreateObject {
	public static void main(String[] args) {
		
		AA aa = new AA();	//AA클래스(설계도)를 aa(객체)를 생성
		
		//객체의 메소드 호출 : 메소드는 ()가 들어있음
		System.out.println(aa.getName());		//.get() 은 각 자료형으로 return해줌
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("--------------------------------------");
		
		// 객체의 필드(메모리) 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		
		
		//메소드 호출
		//setters : 객체의 메모리에 값을 할당할 때
		aa.setName("박은비");		//객체에 변수의 값을 할당
		aa.setAge(25);
		aa.setEmail("eunbi628268@gmail.com");

		
		
		// 객체의 필드(메모리) 호출
		// getters : 객체의 메모리의 값을 가지고 올 때
		System.out.println(aa.getName()); 	//메모리 값을 가지고 와랑
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("--------------------------------------");
		
		//setter로 값 주입
		AA bb = new AA();
		bb.setName("정재현");
		bb.setAge(26);
		bb.setEmail("jaehyun0214@gmail.com");
		
		//getter로 값 호출
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		System.out.println("--------------------------------------");
		
		AA cc = new AA();
		cc.setName("이도현");
		cc.setAge(28);
		cc.setEmail("dohyun0411@gmail.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
	}

}
