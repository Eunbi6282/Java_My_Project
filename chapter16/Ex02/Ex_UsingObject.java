package chapter16.Ex02;

// 4개의 객체를 Object타입을 사용해서 저장하고 출력
class Student {
	String name;
	String id;
	int pw;
	
	Student(String name, String id, int pw) {	// 받은 값 활성화
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {			//toString()으로 객체를 출력하면 주소만 나오는걸 값이 나오도록 함!
		return "이름은 : " + name + " , 아이디 : " + id + " , 패스워드 : " + pw;
	}
}
class Professor{
	String name;
	int year;
	String email;
	
	Professor(String name, int year, String email) {
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	@Override
	public String toString() {			//toString()으로 객체를 출력하면 주소만 나오는걸 값이 나오도록 함!
		return "이름은 : " + name + " , 근무 시작 년도 : " + year + " , 이메일 : " + email;
	}
}
class Tiger{
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "이름은 : " + name + " , 다리개수 : " + run;
	}
}
class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름은 : " + name + " , 색 : " + color + " , 가격 : " + price;
	}
}

class Total {		//Object를 사용해서 모든 상품을 저장할 수 있다.
	private Object object = new Object();	//private사용 -> setter로 값 할당, getter로 값 출력

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;			// Object타입으로 업캐스팅 됨
	}
}

public class Ex_UsingObject {
	public static void main(String[] args) {
		// 1. Student
		Total total1 = new Total();
		total1.setObject(new Student("박은비", "20170033", 6282));
		System.out.println((Student)total1.getObject());	// 다운그레이드 필요
		
		// 2. Professor
		Total total2 = new Total();
		total2.setObject(new Professor("박은비", 2017, "eun7292@ddd.ddd"));
		System.out.println((Professor)total2.getObject());
		
		// 3. Tiger
		Total total3 = new Total();
		total3.setObject(new Tiger("호랑이", "사족보행"));
		System.out.println((Tiger)total3.getObject());
		
		//4. Banana
		Total total4 = new Total();
		total4.setObject(new Banana("바나나", "노랑색",2500));
		System.out.println((Banana)total4.getObject());
		
		
	}

}
