package chapter16.Ex05;

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

class Pencil{	// 연필 클래스 
	String name;
	int price;
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	public void bcd() {
		System.out.println("bcd() 메서드 출력");
	}
	@Override
	public String toString() {		/// 객체 자체를 출력시 객체의 주소가 나오므로 필드의 값이 나오도록 toString()
		return "이름 : " + name + " , 가격 : " + price;
	}
}

// 제너릭을 사용해서 객체를 저장후 값 읽어오기
	// 제너릭 클래스
class Goods<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}

public class ObjectGeneric {

	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<Apple>(); //goods1은 Apple데이터 타입이다. 
		goods1.set(new Apple("사과", 1000)); // 업캐스팅이 아니라서 다운캐스팅 할 필요가 없다. (그 타입으로 들어가서 그 타입으로 return되기 때문에)
		System.out.println(goods1.get());   // 제너릭에서는 다운캐스팅을 할 필요가 없다 
		goods1.get().abc(); 	// 다운케스팅 없이 Apple객체의 abc()호출
		
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.set(new Pencil("연필", 700));
		System.out.println(goods2.get());
		goods2.get().bcd();
		

	}

}
