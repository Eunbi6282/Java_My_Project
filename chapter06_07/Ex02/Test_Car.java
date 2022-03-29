package chapter06_07.Ex02;

public class Test_Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {		//RAM의 값을 부여할 때 setter
		this.company = company;						// this : 자신의 객체
													// 메소드에 인풋되는 변수명 = 인풋된 변수를 받는 변수명 =  메모리에 로드할 변수 -> this.메모리에 로드할 변수
 	}
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {	//인풋, 인풋을 받는 변수 , 메모리에 로드할 변수의 이름이 각각 다르면 -> this. 생략가능
		model = mo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
