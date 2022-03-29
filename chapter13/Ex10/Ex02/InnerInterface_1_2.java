package chapter13.Ex10.Ex02;
class Abc {		
	// 1. 객체 생성 후 필드에 직접 값을 할당(d1), 
	// 2. 생성자를 통해서 값할당(d2) 
	// 3. setter를 통해서 값 할당
	Def d; 				//필드 블락 제일 위에
	
	//기본생성자
	Abc(){}
	
	//생성자로 값할당
	Abc(Def d){
		this.d = d;
	}
	
	
	
	//setter로 값할당
	public void setDef(Def d) {
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}
public class InnerInterface_1_2 {
	public static void main(String[] args) {
		// 1. 객체 생성 후 필드에 직접 값을 할당(d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {		//Abc.Def타입으로
			
			@Override
			public void run() {
				System.out.println("빨리 달려가");
			}
			
			@Override
			public void fly() {
				System.out.println("빨리 날아가");
			}
		};
		d1.ghi();
		// 2. 생성자를 통해서 값할당(d2) 
		Abc d2 = new Abc(new Abc.Def() {		//Def타입 할당
			
			@Override
			public void run() {
				System.out.println("빨리 달려가");
			}
			
			@Override
			public void fly() {
				System.out.println("빨리 날아가");
			}
		}); 
		d2.ghi();
		// 3. setter를 통해서 값 할당
		d1.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("빨리 달려가");
			}
			
			@Override
			public void fly() {
				System.out.println("빨리 날아가");
			}
		});
		d1.ghi();
		

	}

}
