package chapter17.Ex17;

import java.util.Stack;

// Stack 자료구조 : LIFO (Last In First Out) : 제일 마지막에 저장한 값이 제일 처음 나옴  // 상자


public class StackMethod {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// 1. push(E element) : 스택에 값을 넣을 때 사용. 
		stack.push(2); //2가 제일 밑바닥에 있음
		stack.push(5);
		stack.push(3);
		stack.push(7); //7이 제일 위에
		
		// 2. E peek() : 가져올 값을 위에서 쳐다봄.
		System.out.println(stack.peek());
		System.out.println(stack.size()); //4
		System.out.println();
		
		// 3. search(Object o) : 검색 (값을 넣었을 때 index번호를 출력
				//주의 : 방번호는 위부터 1번부터 할당된다.
		System.out.println(stack.search(7)); //7번의 값에대한 index번호 -> 1
		System.out.println(stack.search(3)); //3번의 값에대한 index번호 -> 2
		System.out.println(stack.search(5)); //5번의 값에대한 index번호 -> 3
		System.out.println(stack.search(2)); //2번의 값에대한 index번호 -> 4
		System.out.println(stack.search(9)); //값이 존재하지 않을 경우 : -1을 리턴
		
		// 4. E pop() : 스택의 값을 가져오기 , 제일 마지막에 넣은 값부터 가져올 수 있다. 
		System.out.println(stack.pop()); 	// 7
		System.out.println(stack.pop()); 	// 3
		System.out.println(stack.pop());	// 5
		System.out.println(stack.pop());	// 2
		
		// 5. boolean empty()
		System.out.println(stack.empty()); // 값 꺼내서 empty임
		
		
		
		
		
		
		
		
		

	}

}
