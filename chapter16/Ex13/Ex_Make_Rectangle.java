package chapter16.Ex13;


// �� ���� ��ǥ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���. ���ʸ� �޼��带 ���

class Point<T,V>{ 	// ������ ��ǥ�� ��� Ŭ����
	T x;		// ������ x��ǥ
	V y;		// ������ y��ǥ
	
	Point(T x, V y){		// ������ , setter��ſ� ������ ���ؼ� ������ ���� �Ҵ�
		this.x = x;
		this.y =y;
	}

	public T getX() {
		return x;
	}

	public V getV() {
		return y;
	}
}

class GenericMethod {
	public static <T,V> double makeRectangle(Point <T,V> p1, Point <T,V> p2) {
		
		
//		 width = p2.getX() - p1.getX();
//		 height = p2.getV() - p1.getV();
		
		double width = (double)p2.getX() - (double)p1.getX();
		double height = (double)p2.getV() - (double)p1.getV();
		
		return width * height; // ���� * ���� = ���̸� ����
	}


}

public class Ex_Make_Rectangle {
	public static void main(String[] args) {
		
		Point <Double, Double> p1 = new Point<Double, Double>(1.0,2.0); 
		Point <Double, Double> p2 = new Point<Double, Double>(10.0,50.0); 
		
		double rectangle = GenericMethod.<Double, Double>makeRectangle(p1, p2);
		//makeRectangle�� staticŰ�� ���ԵǾ� �����Ƿ� Ŭ���������� �޼��� ȣ�� ����
		System.out.println("�� ���� ���̴� : " + rectangle);
		

	}

}
