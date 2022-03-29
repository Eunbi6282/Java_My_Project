package chapter13.Ex10;

class Button{
	//OnClickListener:��üŸ��, ocl :�������� 
	OnClickListener ocl; 	// ocl �⺻�� null
	
	
	
	//setter�� OnClickListener�� �������� ocl�� ��ü �ּҸ� ��´�.
	void setOnClickListener(OnClickListener ocl) {		
		this.ocl = ocl;		//�ʱⰪ(null)������ ������ �޴� ������ ��ü Ȱ��ȭ��Ŵ
	}
	
	//�������̽��� ����, ������ �ڽ� Ŭ������ �������� �ʴ´�.
		// ȣ���ϴ� ������ onClick()�� �������ؼ� ȣ���ؾ� ��
	interface OnClickListener{		//InnerInterFace , static����, Button.OnClickListener : 
		void onClick();		//�߻�޼���, ���� ��, �������� �������̵� �ؼ� ������ �ʿ�
	}
	
	void click() {	//�������� �� ocl.onClick()�� ȣ��
		ocl.onClick();	//ocl : �������� / �ʱⰪ(null) ===> set���� Ȱ��ȭ
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {
		// ������ 1 : Ŭ���� �������
		Button button1 = new Button();	//button1 ��ü ����,
		
		//A.B = new A.B() {�̳��������̽� B�� �޼��带 ������ �ڵ�
		//OnClickListener ��üŸ������ ��ü �����ؼ� �Ű������� ������
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������1. �������");
				
			}
		} ); 	
//		
		button1.click();
		System.out.println("==============");
		
		
		// ������ 2 : Ŭ���� ���̹� ����
		Button button2 = new Button();
		
		// setOnClickListener() �޼��忡 �Ű������� OnClickListener�� ���� �͸� ��ü�� ������
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������2. ���̹� ����");
			}
		}); 	//�������̽� ������ Ÿ�� �־��ֱ�
		button2.click(); // click()�� Ȱ��ȭŰ���� 
	}

}
