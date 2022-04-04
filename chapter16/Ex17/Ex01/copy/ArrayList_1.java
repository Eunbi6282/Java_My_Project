package chapter16.Ex17.Ex01.copy;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

// java.lang 패키지의 클래스들은 import가 필요하지 않다. 
/*
 	컬렉션 : 동일한자료형을 저장. 방의 크기가 동적으로 변화. 
 	배열 : 동일한자료형을 저장. 방의 크기가 고정되어 있다. 배열 생성시 방의 크기를 지정하면 수정 불가
 
 	List<E> : 인터페이스 / 제너릭으로 구성 -> 다양한 데이터 타입이 올 수 있음(String, Object...
 		공통적 특징 : 인덱스(방번호)를 가지고 있다. 방의 크기는 동적으로 변화한다. 
 		
		list 인터페이스를 구현한 자식 클래스
 		-ArrayList<E> : 싱글 쓰레드 환경에서 사용. 검색은 빠르나 추가하거나 삭제시 느리다.
 		- Vactor<E> : 멀티 쓰레드 환경에서 사용. 모든 메서드가 동기화 되어 이싿. 
 		- LinkedList<E> : 검색은 느리나 값을 추가나 삭제시 빠르다.
 */


public class ArrayList_1 {

	public static void main(String[] args) {
		// 1. 배열
		String[] array = new String[] {"가", "나","다","라", "마","바","사"};
		System.out.println(array.length); //7
		
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);  	//삭제해도 방의 크기 그대로
		
		// 1. Arrays.toSting(배열변수)
		System.out.println(Arrays.toString(array)); // Arrays.toSting(배열변수)
		
		// (1)for 문 사용해서 출력
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1 ) {  	//마지막 방번호 에서는 " ," 출력하지 마라
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + " , ");
			}
		}
		System.out.println();
		System.out.println("========================================");
		
		// (2) Enhanced For문 사용해서 출력
		for(String k : array) {
			System.out.print(k + " , ");
		}
		System.out.println();
		System.out.println("========================================");
		
		//2. List : 인터페이스 , 객체 생성을 생성할 수 없음, 타입은 지정가능
		List<String>aList = new ArrayList<String>();
		List<String>aList2 = new ArrayList<>();
		List<String>aLsit = new ArrayList();
		
			// List에서 방의 개수 출력 : aList.size(); <<== List , 배열 -> .length
		System.out.println(aList.size()); // 처음 방의 크기 : 0
		
		// List에 값 할당하기 : .add("값") 메서드 사용 -> 제일 마지막에 값을 추가한다.
		aList.add("가"); aList.add("나"); aList.add("다"); aList.add("라"); aList.add("마"); aList.add("바"); aList.add("사");
		
		// List에 저장된 데이터의 개수 구하기: aList.size
		System.out.println(aList.size()); // 7
		
		//List에 저장된 값을 제거 : aList.remove("삭제할 내용")
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size()); // 7 -> 5
		
		///List는 index를 가지고 있다. \
		// (1)(FOR)
		for (int i = 0; i < aList.size(); i++) { 	// aList.size() :방의 개수 출력
			System.out.print(aList.get(i)+ " , " );	// aList.get(i) : 방의 값을 출력
		}
		System.out.println();
		System.out.println("========================================");
		
		// (2) EnhancedFor
		
		// (3) 객체에 toString()을 호출해서 출력
		System.out.println(aList); // List는 toString()가 재정의 되어있다. 
			//System.out.println(Arrays.toString(array)); -> 배열의 경우 Arrays.toString()으로 값을 호출해야 함
		
		
		
		
	}

}
