package chapter17.Ex08;

import java.util.TreeSet;

//!!!중요!!!!!

//TreeSet에 일반 객체를 저장할 경우, 특정 필드를 크기비교 기준 필드가 존재해야 한다.
	//1번 방법 : Comparable<E> 인터페이스의 compareTo() 메서드 재정의: TreeSet에 일반 객체를 저장할 때 일반 객체의 특정 필드를 재정의 해야 한다.
	// 2번 방법 : Comparator<E> 인터페이스 compare() 메서드를 재정의 함
	// 3번 방법 : 익명 내부 객체를 사용해서 처리하는 방법

//내가 만드는 일반객체 -> TreeSet안에 안들어감(방법필요)
	//일반 클래스
class Myclass{
	int data1;
	int data2;
	public Myclass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

	//Comparable<E>인터페이스를 구현한 클래스 생성
class MyComparableClass implements Comparable<MyComparableClass>{
	
	int data1;  	// <<== data1 필드를 비교 기쥰으로 설정, compareTo()재정의
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	

	@Override
	public int compareTo(MyComparableClass o) { 	//객체의 크기비교기준을 설정하는 메서드,<TreeSet에서 사용>(음수 , 0 , 양수)
		if(this.data1 < o.data1) { //매개변수가 o로 들어옴, this.data1 => 기준점
			// 내 데이터의 필드(this.data1)와 들어오는 데이터(o.data1)을 비교
			return -1; //내가(this.data1) 작을 때(음수) => ascending 정렬(반대로 하면 내림차순 됨)
		}else if (this.data1 == o.data1) {
			return 0; 	//나와(this.data1) 같을 때(0)
		}else {
			return 1; // 내가(this.data1) 더 클 때(양수)
		}
	}
	
	@Override
		public String toString() {
			return data1 + " " + data2;
		}
	
}

//TreeSet의 장점 : 1. 중복저장되지 않는다.(Set) 2. 오름차순 정렬되어 입력 3. 정렬되어 출력(오름차순) 4. 검색기능 사용 가능 5. 특정 범위의 값을 추출가능 6. asc(오름차순), desc(내림차순)

	//Set -> equals(),hashCode()재정의해서 값 비교

public class TreeSetMethod_2 {

	public static void main(String[] args) {
		// wrapper 클래스는 Comparable<E>인터페이스의 comparTo()를 재정의 하고 있다.
			//wrapper 클래스의 값을 TreeSet에 넣으면 정렬되어서 저장-> compareTo()가 재정의되어 있기 때문
		// 1. Integer wrapper 클래스의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(); //treeSet1에 정수타입 넣을 수 있음
		// 타입을 Set으로 지정하면 안된다.
		
		Integer intValue1 = new Integer(20); //큰값
		Integer intvalue2 = new Integer(10); // 작은 값
		//TreeSet으로 값을 넣으면 큰 값을 먼저 넣더라도 작은값부터 큰값으로(오름차순) 정렬되어서 출력됨
		
		treeSet1.add(intValue1);
		treeSet1.add(intvalue2);
		System.out.println(treeSet1);
		
		// 2. String wrapper 클래스의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나"); //작은 값
		//String str1 = "가나"; <- 이것도 가능
		String str2 = new String("다라"); //큰값
		
		treeSet2.add(str1); //treeSet2.add()를 사용해서 객체를 저장할 경우 값의 쿠기를 비교하는 필드가 정의 되어 있어야 한다.
		treeSet2.add(str2); // Comparable<E> 인터페이스 ,compareTo()메서드가 재정의 되어야 한다.
		System.out.println(treeSet2);
		
		// 3. MyClass가 TreeSet에 저장이 될까? ->X (일반 객체안에는 크기를 비교하는 메서드가 재정의 안되어있기 때문에 -> Comparable<E> 인터페이스의 compareTo()재정의 필요)
		
/*		TreeSet<Myclass> treeSet3 = new TreeSet<Myclass>();
		Myclass myclass1 = new Myclass(2, 5);
		Myclass myclass2 = new Myclass(3, 3);
		treeSet3.add(myclass1); //TreeSet에는 Comparable<E>인터페이스의 compareTo()메서드를 재정의한 클래스만 넣을 수 있다.
		treeSet3.add(myclass2); //실행시 오류 발생 ->ClassCastException:
		System.out.println(treeSet3);
*/		
		
		//4. MyComparableClass 객체크기 비교
		TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>(); 
		MyComparableClass m1 = new MyComparableClass(2, 5);
		MyComparableClass m2 = new MyComparableClass(3, 3);
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		
		
		
		
		
		
		
		
		

	}

}
