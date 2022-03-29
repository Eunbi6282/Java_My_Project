package chapter06_07.Ex06;
//static 키가 할당된 필드는 모든 객체에서 공유해서 사용하는 메모리 영역

class Pizza{
	int m = 3;		//인스턴스 필드 : 객체화해서 사용
	static int n = 5;	//static 필드 : 객체화 필요없음(Aaaa.n)으로 사용 가능 , 객체화 해도 됨
							//모든 객체에서 공유하는 필드
	
}

public class Static_2 {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		Pizza pizza4 = new Pizza();
		
		//인스턴스 필드 : 각 객체에서 공유되지 않는 그 객체에서만 사용.
		pizza.m = 5;
		pizza2.m = 6;
		pizza3.m = 7;
		pizza4.m = 8;
		System.out.println(pizza.m);
		System.out.println(pizza2.m);
		System.out.println(pizza3.m);
		System.out.println(pizza4.m);
		
		System.out.println();
		
		//정적 필드
		pizza.n= 10;	//한곳에서만 바꿔도 모두 바뀜
		pizza.n= 100;
		System.out.println(pizza.n);
		System.out.println(pizza2.n);
		System.out.println(pizza3.n);
		System.out.println(pizza4.n);

		Pizza.n = 200;		//객체생성없이 클래스명으로 호출 가능
		System.out.println(pizza.n);
		System.out.println(pizza2.n);
		System.out.println(pizza3.n);
		System.out.println(pizza4.n);

	}

}
