package Test;

public class Test_Ex_Car {

	public static void main(String[] args) {
		// Test_Car 를 객체화해서 5개의 객체를 생성해서 값을 할당해서 출력하기

		Test_Car sonata = new Test_Car();
		Test_Car miniCooper = new Test_Car();
		Test_Car bmw = new Test_Car();
		Test_Car genesis = new Test_Car();
		Test_Car benz = new Test_Car();
		
		//각 변수에 값을 할당하고 출력, 권장사항은 아님 -> 메모리에 원하지 않는 값을 직접할당할 수 있음
		//변수 이름앞에 private키워드 사용 : 캡슐화, 직접 변수의 값을 할당하지 못하도록
		//settter통해 값 할당: 변수의 입력되는 값을 제어할 수 있다.
		
		sonata.setColor("하양");
		sonata.setCompany("현대");
		sonata.setMaxSpeed(200);	//- 안됨, 700 이상은 넣을 수 없도록 제어
		sonata.setModel("신형");
		
		miniCooper.setColor("빨강");
		miniCooper.setCompany("bmw");
		miniCooper.setMaxSpeed(4);
		miniCooper.setModel("신형");
		
		bmw.setColor("하양");
		bmw.setCompany("bmw");
		bmw.setMaxSpeed(5);
		bmw.setModel("구형");
		
		genesis.setColor("하양");
		genesis.setCompany("현대");
		genesis.setMaxSpeed(7);
		genesis.setModel("신형");
		
		benz.setColor("회색");
		benz.setCompany("benz");
		benz.setMaxSpeed(9);
		benz.setModel("신형");
	
		// 직접 출력
		System.out.println("===sonata===");
		System.out.println("Color : " + sonata.getColor());
		System.out.println("Company : " + sonata.getCompany());
		System.out.println("MaxSpeed : " + sonata.getMaxSpeed());
		System.out.println("Model: " + sonata.getModel());
		
		System.out.println("===miniCooper===");
		System.out.println("Color : " +miniCooper.getColor());
		System.out.println("Company : " +miniCooper.getCompany());
		System.out.println("MaxSpeed : " +miniCooper.getMaxSpeed());
		System.out.println("Model: " +miniCooper.getModel());
		
		System.out.println("===bmw===");
		System.out.println("Color : " +bmw.getColor());
		System.out.println("Company : " +bmw.getCompany());
		System.out.println("MaxSpeed : " +bmw.getMaxSpeed());
		System.out.println("Model: " +bmw.getModel());
		
		System.out.println("===genesis===");
		System.out.println("Color : " +genesis.getColor());
		System.out.println("Company : " +genesis.getCompany());
		System.out.println("MaxSpeed : " +genesis.getMaxSpeed());
		System.out.println("Model: " +genesis.getModel());
		
		System.out.println("===benz===");
		System.out.println("Color : " +benz.getColor());
		System.out.println("Company : " +benz.getCompany());
		System.out.println("MaxSpeed : " +benz.getMaxSpeed());
		System.out.println("Model: " +benz.getModel());
		
	}
				

}
