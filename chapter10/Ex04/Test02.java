
package chapter10.Ex04;

import java.util.Arrays;

import javax.naming.StringRefAddr;

class Animal3{		//부모클래스 , 모든 클래스는 Odject를 상속한다. 
	String nameString ;
	int age;
	
	void cry() {
		System.out.println("동물은 웁니다.");
	}
	@Override		//Object.toString메서드는 객체 자체를 출력할 때 객체 자체를 출력할 때 호출이 된다. 
	public String toString(){	//객체의 주소를 출력합니다. [패키지명.클래스명@객체의 메모리의 해쉬코드]
		return "이름은 : " + nameString + "이고 , 나이는 : " + age + "입니다." ;
	}
}

class Tiger3 extends Animal3{
	
	Tiger3(){}			//기본생상자: 변수의 초기화 값을 할당하지 않고 초기화. 
	
	Tiger3(String a,int b ){	//생성자 : 객체를 생성할 때 메모리의 초기값을 할당할 때 사용
		super.nameString=a;		// super : 부모(super)클래스, this :자기 자신의 객체 
		super.age = b;
		
	}
	
	@Override
	void cry() {
		//super.cry();	//super키워드는 부모클래스, super : 상속 관계일 때 부모클래스
						//this 키워드는 자기자신의 객체
	System.out.println("호랑이는 어흥하고 웁니다.");
	
	}
}
class Cat3 extends Animal3{
	
	Cat3(){}
	
	Cat3(String a, int b){		//생성자
		super.nameString=a;		// super : 부모(super)클래스, this :자기 자신의 객체 
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();
		System.out.println("고양이는 야옹하고 웁니다.");
	}
}
class Dog3 extends Animal3{
	
	Dog3(){}
	
	Dog3(String a, int b){	//생성자
		super.nameString = a;
		super.age =b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("개는 멍멍하고 웁니다.");
	}
}
public class Test02 {

	public static void main(String[] args) {	
		Animal3 animal3 = new Animal3();	//a3객체 생성
		
		System.out.println(animal3);	//객체 자체를 출력할 경우, Object클래스의 toSting메서드가 호출된다. 
				// Object.toString() : 객체의 메모리주소의 해쉬코드를 출력
				// chapter10.Ex04.Animal3@32d2fa64 <-- 패키지명.객체명.@해쉬코드
		System.out.println(animal3.toString());
		
		// 객체 자체를 출력하면 Object 클래스의 toString 메서드를 호출
		 Animal3 tiger3 = new Tiger3();	//Tiger3를 Animal3로 업캐스팅   
		 // 다른 생성자가 없을 땐 상관없지만 다른 생성자를 지정한다면 기본생성자를 호출할 때 기본생성자를 선언해야 함
		 System.out.println("*다른 생성자가 없을 땐 상관없지만 다른 생성자를 지정한다면 기본생성자를 호출할 때 기본생성자를 선언해야 함*");
		 Animal3 cat3 = new Cat3();		//Cat3 fmf Animal3로 업캐스팅
		 Animal3 dog3 = new Dog3();
		 
		 tiger3.cry();  //부모의cry()를 호출할 경우 오버라이딩된 Tiger3의 cry()를 호출
		 cat3.cry(); 	// Animal3.cry()호출 ---> 오버라이딩된 Cat3의 cry()호출
		 dog3.cry();
		System.out.println("======================================");
		
		Animal3 [] arr = {tiger3, cat3, dog3};
		
		for ( int i = 0; i <arr.length; i++) {
			arr[i].cry();
		}
		System.out.println("=======================================");
		for (Animal3 k : arr) {
			k.cry();;
		}
		
		System.out.println("=======================================");
		Animal3 aa3 = new  Tiger3("호랑이",4);
		Animal3 cc3 = new Cat3("고양이", 3);
		Animal3 dd3 = new Dog3("개",10);
		
		System.out.println(aa3);	//객체 자체 출력시, 기본적으로 객체의 메모리 헤쉬코드가 출력
										//Object의 toString()메서드를 재정의
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("=======================================");
		
		//배열에 객체 넣기
		Animal3[]arr2 = {aa3,cc3,dd3};		//생성자를 통해 초기값을 할당한 후 배열에 넣었음
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);	//print아닌 String값이므로 출력문으로 출력해주기
			
		}

		System.out.println("----enhanced for----");
		for (Animal3 kAnimal3 : arr2) {
			System.out.println(kAnimal3);
		}
		
		System.out.println(Arrays.toString(arr2));
	}
	
	
	
	
	
	

}
