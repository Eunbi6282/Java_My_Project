package chapter06_07.Ex05;

public class C {			//�ٸ� ��Ű������ import����
	
	//�ʵ忡 �ο��Ǵ� ���� ������
	private String companyString = "�����ڵ���";	//ȸ��� -> ���� ������ �����Ƿ� �ڵ����� ��µȴ�. 
	String modelString;	//��, default
	protected String colorString;	//��
	public int maxSpeed;	//�ִ� �ӵ�
	
	
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
