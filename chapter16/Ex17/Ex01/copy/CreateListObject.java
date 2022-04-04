package chapter16.Ex17.Ex01.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		// 1. List구현 클래스의 새성자를 사용하여 객체 생성
			// List는 인터페이스 이므로 new 키 뒤에 올 수 없다(객체 생성x), 타입지정만 가능
		// capacity : 메모리의 방의 크기를 할당, 기본값은 10 생성자에 넣는 값 -> 메모리에 공간할당,
		// size() : 방에 저장된 값의 개수 <<===== 
		
		List<Integer> aList1 = new ArrayList<>(); //capacity = 10(기본값)
		List<Integer> aList2 = new ArrayList<>(30); //capacity = 30, 메모리 공간 확보
		
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30); // 공간 확보 30
		
		List<Integer> aList5 = new LinkedList<>();
		// List<Integer> aList6 = new LinkedList<>(40); // LinkedList는 저장 공간을 할당 못함, 기본저장 공간만 사용 가능 
		
		// 2. Arrays 클래스의 정적 메서드를 이용하는 방법 : 데이터 크기를 바꾸지 못함, 배열과 같이 방개수(데이터크기)가 변하지 않고 고정됨
			//요일, 계정, 하루24시간 같은경우에 사용 ((데이터 크기 고정되어 있는 경우)
		List<Integer> aList7 = Arrays.asList(1,2,3,4); 	// 고정된 값
		List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일"); 
		aList7.set(1, 7);	//set() : 기존에 있는 값을 추가, 수정할 때 index 1에 7을 넣겠다.
		//aList7.add(5); //오류발생 -> 방번호가 4개인데 마지막값다음에 5를 추가한다? 안됨(데이터 크기 고정되어 있음)
			//add()-> 마지막에서 값을 더 추가할 때 사용
		
		aList8.set(0, "일");
		// aList8.add("일요일") -> 오류발생 , 더 추가는 안됨 asLsit특성상 값이 고정되어 있기 때문에 
		System.out.println(aList7);
		System.out.println(aList8);
		

	}

}
