package chapter16.Ex17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {
	public static void main(String[] args) {
		/* List의 메서드 (13개)
		 	1. ArrayList
		 	2. Vector
		 	3. LinkedList
		 */
		
		List<Integer>aList1 = new ArrayList<Integer>();
		// 1. add(E element) : 마지막 값에 값을 추가
		aList1.add(3); aList1.add(4); aList1.add(5);
		System.out.println(aList1);
		System.out.println(aList1.size()); 	// 3

		//2. add(int index, E element)
		aList1.add(1, 6); 	// 방번호 1번에 6을 추가
		System.out.println(aList1);
		
		//3. addAll( 또다른 리스트의 객체를 복사해서 추가)
		List<Integer>aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		
		aList2.addAll(aList1); 	//aLsit1에 저장된 값을 복사해서 aList2에 추가함
		System.out.println(aList2);
		
		//4. addAll(int index, 또 다른 객체)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		
		aList3.addAll(1,aList3); // 자신의 값에 다른 객체를 추가
			// 1번방 다음에 자기 객체의 값을 추가
		System.out.println(aList3);
		
		//5. set(int index, E element) : 특정 방번호의 값을 수정
		aList3.set(1, 5);	// 1번방번호의 값을 5로 수정해라
		aList3.set(3, 6);
		// aList3.set(4, 7); -> 오류발생 (4번방은 존재하지 않음)
		System.out.println(aList3);
		
		//6. remove (int index) : 특정 방번호의 값을 삭제,
		aList3.remove(1); // 방번호 1번에 있는 값을 삭제, 방번호를 삭제하는거임!!!!
			// 삭제되면 뒤에 있는 값이 앞으로 땡겨옴
		System.out.println(aList3); // 1번방의 값이 삭제되고 뒤의 값들이 앞으로 당겨짐
		
		// 7. remove(Object O) :값으로 삭제
		aList3.remove(new Integer(2)); //값으로 삭제를 할 수 있다. , 값 2가 삭제됨
		System.out.println(aList3);
		
		// 8. clear() : 모두 삭제
		aList3.clear();
		System.out.println(aList3);
		
		// 9. isEmpty(): 값이 비어있으면 true, 그렇지 않으면 false
		System.out.println(aList3.isEmpty()); //true -> 앞에서 clear사용해끼 때문에
		
		// 10. size() :방의 개수, 값의 개수
		System.out.println(aList3.size());
		aList3.add(1); aList3.add(2); aList3.add(3);
		System.out.println(aList3);
		System.out.println(aList3.size());
		
		System.out.println("=========");
		
		// 11 . get(int index) : 방번호의 값을 출력
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		
		System.out.println("===========");
		
		// 12.toArray() : List(리스트) ----> Array (배열)로 변환
		System.out.println(aList3); //List일땐 toString()이 재정의 되어있기 때문에 값을 출력한다.
		
		Object[]objects = aList3.toArray(); //기본적으로 toArray()메서드는 Object타입으로 리턴이 됨/ List를 배열타입으로 
			// 다운캐스팅 필요
		System.out.println(Arrays.toString(objects)); //배열일 때는 Arrays.toString()사용
		
		System.out.println("============");
		
		//13-1 toArray(T[] t)  ===> t타입으로 바로 변환 가능
			//Integer로 바로 캐스팅, 다운캐스팅 필요x
		Integer[] integer1 = aList3.toArray(new Integer[0]);
		//Integer[0]-> 방의 크기 보다 작게 넣었음 : 실제 값이 저장되어있는 값까지만 출력
		System.out.println(Arrays.toString(integer1));
		
		//13-2 toArray(T[] t)  ===> t타입으로 바로 변환 가능
		//Integer로 바로 캐스팅, 다운캐스팅 필요x
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		//Integer[5]-> 방의 크기 보다 더 클 때 : 비어있는 부분에 null값이 출력됨
		System.out.println(Arrays.toString(integer1));
		
		//toArray는 기본적으로 Object타입이어서 Integer로 다운캐스팅 필요함 그런데 toArray(T[] t)사용해서 바로 다운캐스팅
		
		
		
		
		
		
		
	}

}
