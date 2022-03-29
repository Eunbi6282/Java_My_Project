package chapter16.Ex01;

// Generic 사용전 문제점
// 객체를 담을 클래스를 만들경우, 매번 객체를 생성할 때 마다 그 객체를 담을 클래스를 만들어 줘야 한다. 
// 객체를 저장할 클래스를 생성해서 객체 정볼르 담을 수 있다. <== 새로운 상품이 추가될 때 마다 그 상품을 담을 클래스를 생성해줘야 한다.
		// -> 코드가 매우 복잡해진다. 

class Apple{	//사과 클래스 ,  사과의 정보를 담은 객체
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		/// apple 객체 자체를 출력시 객체의 주소가 나오므로 필드의 값이 나오도록 toString()
		return "이름 : " + name + ", 가격 : " + price;
	}
}
// 1. Apple을 담을 수 있는 클래스 생성
class Goods1 {		// 상품에 사과를 담은 클래스
	private Apple apple = new Apple("사과", 1000);  // private이 선언되어있기 때문에 setter와 getter로 값을 할당하고 출력해야 함

	public Apple getApple() {	//getter : 객체 필드의 정보를 출력
		return apple;
	}

	public void setApple(Apple apple) {		//setter
		this.apple = apple;
	}
}

class Goods2{		//연필 상품을 담은 클래스 
	private Pencil pencil = new Pencil("연필", 1500);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
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
public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// Goods1상품이 저장되어 있다. Apple객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();		//기본생성자 호출
		goods1.setApple(new Apple("사과2", 2000));
		System.out.println(goods1.getApple()); // 필드의 내용 출력
		
		// Goods2 상품이 저장. Pencil 객체를 저장
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil("연필2", 3000));	//Setter로 Pencil객체 생성 및 값 할당
		System.out.println(goods2.getPencil());  //goods2.getPencil()이 return값으로 돌아오기 때문에 출력구문 안에 넣어야 함

	}

}
