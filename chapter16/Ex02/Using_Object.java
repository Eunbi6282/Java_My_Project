package chapter16.Ex02;

 
// Object는 모든 객체를 저장할 수 있다.
// 상품을 저장하는 클래스에 Object타입으로 저장하면 모든 객체를 담을 수 있다. <== 새로운 상품이 생길때 마다 클래스를 추가해줘야 함
// Object를 사용해서 모든 상품을 저장할 수 있다. 
	// Object의 장점 : 모든 객체를 담을 수 있다(캐스팅 가능). 
	// Object의 단점 : 매번 다운 캐스팅을 해서 출력해야 한다, 
					//약한 타입 체크를 하기 때문에 실행시 오류가 생길 수 있다. (ClassCastException)

class Apple{	//사과 클래스 ,  사과의 정보를 담은 객체
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	public void abc() {
		System.out.println("abc() 메서드 출력");
	}
	@Override
	public String toString() {		/// apple 객체 자체를 출력시 객체의 주소가 나오므로 필드의 값이 나오도록 toString()
		return "이름 : " + name + " , 가격 : " + price;
	}
}

class Goods {		//Object를 사용해서 모든 상품을 저장할 수 있다. 
	private Object object = new Object();		//Object : 모든 클래스는 Object타입으로 변환

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {	// Object타입으로 업캐스팅 됨
		this.object = object;
	}
}

class Pencil{	// 연필 클래스 
	String name;
	int price;
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		/// 객체 자체를 출력시 객체의 주소가 나오므로 필드의 값이 나오도록 toString()
		return "이름 : " + name + " , 가격 : " + price;
	}
}

public class Using_Object {
	public static void main(String[] args) {
		
		// 1. Apple을 저장 후 출력 Object
		Goods goods1 = new Goods();
		goods1.setObject(new Apple("사과3", 4000));	//Setter로 값을 할당
		System.out.println((Apple)goods1.getObject());	// Getter로 객체를 출력 : Object타입의 객체를 받아 오기 때문에 Apple로 다운캐스팅 필요
		((Apple)goods1.getObject()).abc(); //abc()메서드를 활용하려면 -> 다운캐스팅, 	
			// toString()은 Object의 toStirng()을 오버라이딩해 온 거기 때문에 다운캐스팅안해도 출력됐던거임 근데 답 나오더라도 다운캐스팅 꼭 해!!!
			
		
		// 2. Pencil을 저장후 출력. Object
		Goods goods2 = new Goods();
		goods2.setObject(new Pencil("연필3",5000));
		System.out.println((Pencil)goods2.getObject());
			// Getter로 객체를 출력 : Object타입의 객체를 받아 오기 때문에 Apple로 다운캐스팅 필요
		
		// 3. 잘못된 캐스팅을 할 수 있다.(약한 타입 체크) : Object의 문제점
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("사과4", 5000));
		System.out.println((Pencil)goods3.getObject());	//오류 -> 약한 타입 체크 : 실행시 오류 발생
		
	}

}
