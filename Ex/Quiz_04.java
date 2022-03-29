package Ex;
class Studentt {
	int studentId;
	String name;
	int kor;
	int eng;
	
	Studentt(int studentId, String name, int kor, int eng) {
		this.studentId = studentId;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public boolean equals(Object obj) {		//객체를 매개변수로 넣을 때 object타입으로 자동으로 업캐스팅
		if (this.studentId == ((Studentt)obj).studentId) {	//Studentt타입으로 다운캐스팅 후 
				//각 객체의 studentId의 값을 비교.
			return true;
		}else {
			return false;		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId + " , " + name + " , " + kor + " , " + eng;
	}
}
class E extends Object{
	String name;
	
	E(){}		//기본생성자 : 클래스내의 다른 생성자가 존재할 때 외부에서 기본생성자를 호출할 때 생략되어 있으면 안됨
	
	E (String name){
		this.name = name;	//매개변수이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 모두 동일
												// this : 자신의 객체
	}

	@Override
	public String toString() {
		return "이름 : " + name ;  		//this.nameString
	}
	
	@Override
	public boolean equals(Object obj) {				//e2.equals(a3);
	
		if (this.name == ((E)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}	
	
	
public class Quiz_04 {
	public static void main(String[] args) {
			Studentt student1 = new Studentt(20170033, "박은비", 90, 90);
			Studentt student2 = new Studentt(19950411, "이도현", 80, 80);
			Studentt student3 = new Studentt(19970214, "정재현", 100, 100);
			Studentt student4 = new Studentt(20170033, "박은비", 80, 80);
			
			System.out.println(student1);
			System.out.println(student2);
			System.out.println(student3);
			System.out.println(student4);
			
			/*객체의 StudentId 컬럼을 비교해서 같을 경우 같은 학생이다 라고 출력
			StudentId가 같은 경우 '같은 학생이다' 라고 출력
				 == : 기본타입 (boolean, byte, short, int, long, double, float, char)
				    : 값을 비교
				    : 참조타입(배열 ,객체,String[특수함]인 경우 객체의 주소를 비교
				    	String : toString() , equals 가 재정의 되어 있다.
				  
				   Object의 toString() ,equals()를 재정의해서 많이 쓴다. 
				   		toString() - 객체 자체를 println()할때/ 패키지이름.클래스이름@해쉬코드
				   			//오버라이딩해서 필드의 정보를 출력
				   	    equals() : == 와 같다 , 객체의 주소를 비교
				   	     	//재정의해서 객체내의 필드값을 비교
			 */
			
			System.out.println(student1.equals(student2));
			System.out.println(student1.equals(student3));
			System.out.println(student1.equals(student4));
			
			if (student1.equals(student2)==true) {
				System.out.println("같은학생이다");
			}
			if (student1.equals(student3)==true) {
				System.out.println("같은학생이다");
			}
			if (student1.equals(student4) == true) {
				System.out.println("같은학생이다");
			}
			
			E e1 = new E();		//기본생성자 호출 : heap의 필드의 값은 강제 초기화 됨
			System.out.println(e1.name);	//강제초기화 -> null
			
			E e2 = new E("안녕");
			System.out.println(e2.name);
			
			E e3 = new E("안녕");
			
			System.out.println("========================");
			System.out.println(e2 == e3);	//참조타입 (==) : 객체의 주소를 비교
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e2.equals(e3)); //Object의 equals() : (==) 객체의 주소를 비교
	}
}