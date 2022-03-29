package chapter10.Ex07.Ex01;

class AA{
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}
class BB{
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}
class CC{
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}

public class Object_Type {

	public static void main(String[] args) {
		//�ڹ��� ��� ��ü�� ObjectŸ������ ����ȯ�� �����ϴ�. 
		Object aaObject = new AA();
		Object bbObject = new BB();
		Object ccObject = new CC();
		
		//Object �迭�� ��ü ����
		Object[] arr1 = {aaObject,bbObject,ccObject};
		for(int i = 0; i<arr1.length;i++) {
			System.out.println(arr1[i].toString()); //��ü���� toString()ȣ��
			 //Object�� toString�� ȣ���� ��� �ڽ��� toString�޼ҵ尡 ȣ��
		}
		System.out.println("===========================");
		for (Object k : arr1) {
			System.out.println(k); 		//��ü ��ü�� ����� ��� toString()�� ���
					//aa,bb,cc�� k�� ��
		}
	}

}
