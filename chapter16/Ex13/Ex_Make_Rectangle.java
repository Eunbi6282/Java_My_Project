package chapter16.Ex13;


// 두 점의 좌표값을 사용해서 넓이를 구하는 프로그램을 작성하세요. 제너릭 메서드를 사용

class Point<T,V>{ 	// 한점의 좌표를 담는 클래스
	T x;		// 한점의 x좌표
	V y;		// 한점의 y좌표
	
	Point(T x, V y){		// 생성자 , setter대신에 생성자 통해서 변수에 값을 할당
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
		
		return width * height; // 가로 * 세로 = 넓이를 리턴
	}


}

public class Ex_Make_Rectangle {
	public static void main(String[] args) {
		
		Point <Double, Double> p1 = new Point<Double, Double>(1.0,2.0); 
		Point <Double, Double> p2 = new Point<Double, Double>(10.0,50.0); 
		
		double rectangle = GenericMethod.<Double, Double>makeRectangle(p1, p2);
		//makeRectangle에 static키가 포함되어 있으므로 클래스명으로 메서드 호출 가능
		System.out.println("두 점의 넓이는 : " + rectangle);
		

	}

}
