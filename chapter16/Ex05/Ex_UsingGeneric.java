package chapter16.Ex05;

// 제네릭을 사용해서 4개의 객체를 저장하고 출력해보기

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

class Total<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Ex_UsingGeneric {
	public static void main(String[] args) {
		//Student
		Total<Student> total1 = new Total<Student>();
		total1.setT(new Student("박은비", "20170033", 6282));
		System.out.println(total1.getT());
		
		//Professor
		Total<Professor>total2 = new Total<Professor>();
		total2.setT(new Professor("박은비", 2017, "eun6282@naver.com"));
		System.out.println(total2.getT());
		
		//Tiger
		Total<Tiger>total3 = new Total<Tiger>();
		total3.setT(new Tiger("호랑이", "사족보행"));
		System.out.println(total3.getT());
		
		//Banana
		Total<Banana> total4 = new Total<Banana>();
		total4.setT(new Banana("바나나", "노랑", 5000));
		System.out.println(total4.getT());
	}

}
