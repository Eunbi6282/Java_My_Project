package chapter12.Ex02;

/*interface 구현한 클래스 , 
 	Overriding : 완전한 메소드를 자식 클래스에서 새놉게 재정의 하는 것. 
 	Implements : (인터페이스를 구현)미완성 메소드를 완성 시키는 것.
 	  extends  : (상속)부모 클래스의 기능을 상속받아서 자신의 기능을 추가해서 확장 
 
 
 */
	
interface AA{
	void cry();		//추상메소드(미완성된 메소드), public abstract생략
	void run();		// 추상메소드(미완성된 메소드) , public abstract 생략
}
class BB implements AA{			//BB클래스는 AA인터페이스의 미완성된 메소드를 구현한다. 

	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		AA aa = new BB();		//BB : 인터페이스의 미완성 메소드를 구현한 클래스 
		aa.cry();
		aa.run();
		
	} 	
	
}
public class Interface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
