package chapter17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO (First In First Out) :처음들어간 값이 처음 나옴  //파이프


public class QueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		// 1. 예외 처리를 미포함한 메서드(add(), element(), remove())
			// (1) add() : 큐에 값을 추가할 때
		// System.out.println(queue1.element()); // element(): 큐에 어떤 값이 있는지 봄
			// 아무값도 안들어 있기 때문에 실행시 오류 -> 예외 처리 안됨
			queue1.add(3);
			queue1.add(4);
			queue1.add(5);
			
		// 2. element()
			System.out.println(queue1.element()); // 제일 처음 나올 값을 확인! 끄집어 내는거 아님
			System.out.println();
			
		// 3. E remove() : 큐의 값을 끄집어 낼 때 사용
			System.out.println(queue1.remove()); //3
			System.out.println(queue1.remove()); //4
			System.out.println(queue1.remove()); //5
			// System.out.println(queue1.remove()); // 모두 끄집어 내고 나서 끄집어 낼 때 예외 발생
			System.out.println();
			
		// 2. 예외 처리 포함 메서드 (offer(), peek(), poll()) <== 권장사항
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		System.out.println(queue2.peek()); //element를 썼을 땐 오류 났지만 peek()는 예외 처리가 되어 있어서 예외가 발생하지 않는다. 
		
			//1. offer(E item) : 값을 추가
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
			
			//2. E peek() : 출력할 값을 미리 보는 것
			System.out.println(queue2.peek()); // 처음으로 나올 값 확인
			
			//3. poll() :값을 끄집어 내기
			System.out.println(queue2.poll()); // 3
			System.out.println(queue2.poll()); // 4
			System.out.println(queue2.poll()); // 5
			System.out.println(queue2.poll()); // 모두 끄집어 낸 뒤 또 적용해도 예외가 발생하지 않음
			
	}

}
