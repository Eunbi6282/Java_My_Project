package chapter06_07.Ex05;

public class C {			//다른 패키지에서 import가능
	
	//필드에 부여되는 접근 제어자
	private String companyString = "현대자동차";	//회사명 -> 값이 정해져 있으므로 자동으로 출력된다. 
	String modelString;	//모델, default
	protected String colorString;	//색
	public int maxSpeed;	//최대 속도
	
	
	public void setModel(String modelString) {
		this.modelString = modelString;
	}
	public void setColor(String colorString) {
		this.colorString = colorString;
	}
	
	public void setmaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	


	public void print() {
		System.out.println("company : " + companyString + " model : " + modelString + " color : " + colorString
				+ " maxSpeed : " + maxSpeed);
	}
	

}
