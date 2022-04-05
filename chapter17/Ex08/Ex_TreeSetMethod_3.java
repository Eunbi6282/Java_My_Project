package chapter17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

import chapter06_07.Ex04.ThisKeyword_1;

// 이름과 나이를 입력했을 때 이름을 오름차순으로 출력하도록 구현하다. TreeSet에 name컬럼을 정렬시킴
// 1. Comparable<E>인터페이스의 compareTo()메서드 재정의 (기존 객체 수정 필요)
// 2. Comparator<E>의 compare()구현 (기존 객체 수정 X)

class Abc{
	String name;  //  << 정렬컬럼. 오름차순정렬: 가나다라...하/ 강감찬, 이순신, 홍길동 처럼 나오게 구현
	int age;  // 나이
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
}

class Abc_T implements Comparable<Abc_T>{
	
	String name;  //  << 정렬컬럼. 오름차순정렬: 가나다라...하/ 강감찬, 이순신, 홍길동 처럼 나오게 구현
	int age;  // 나이
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	@Override
	public String toString() {
		return name + " " + age;
	}




	@Override
	public int compareTo(Abc_T o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}




}


public class Ex_TreeSetMethod_3 {
	public static void main(String[] args) {
		// 1. Comparable<E>인터페이스의 compareTo()메서드 재정의 (기존 객체 수정 필요)
		TreeSet<Abc_T> treeSet1 = new TreeSet<Abc_T>();
		Abc_T at1 = new Abc_T("홍길동", 80);
		Abc_T at2 = new Abc_T("강감찬", 70);
		Abc_T at3 = new Abc_T("이순신", 100);
		
		treeSet1.add(at1);
		treeSet1.add(at2);
		treeSet1.add(at3);
		System.out.println(treeSet1);
		
		// 2. Comparator<E>의 compare()구현 (기존 객체 수정 X)
			//익명 내부 클래스 생성
		TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {

			@Override
			public int compare(Abc o1, Abc o2) {
				return o1.name.compareTo(o2.name);
							}
			
		});
		Abc a1 = new Abc("홍길동", 80);
		Abc a2 = new Abc("강감찬", 70);
		Abc a3 = new Abc("이순신", 100);
		treeSet2.add(a1);
		treeSet2.add(a2);
		treeSet2.add(a3);
		System.out.println(treeSet2);
		
		
		

	}

}
