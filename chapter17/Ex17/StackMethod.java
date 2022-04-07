package chapter17.Ex17;

import java.util.Stack;

// Stack �ڷᱸ�� : LIFO (Last In First Out) : ���� �������� ������ ���� ���� ó�� ����  // ����


public class StackMethod {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// 1. push(E element) : ���ÿ� ���� ���� �� ���. 
		stack.push(2); //2�� ���� �عٴڿ� ����
		stack.push(5);
		stack.push(3);
		stack.push(7); //7�� ���� ����
		
		// 2. E peek() : ������ ���� ������ �Ĵٺ�.
		System.out.println(stack.peek());
		System.out.println(stack.size()); //4
		System.out.println();
		
		// 3. search(Object o) : �˻� (���� �־��� �� index��ȣ�� ���
				//���� : ���ȣ�� ������ 1������ �Ҵ�ȴ�.
		System.out.println(stack.search(7)); //7���� �������� index��ȣ -> 1
		System.out.println(stack.search(3)); //3���� �������� index��ȣ -> 2
		System.out.println(stack.search(5)); //5���� �������� index��ȣ -> 3
		System.out.println(stack.search(2)); //2���� �������� index��ȣ -> 4
		System.out.println(stack.search(9)); //���� �������� ���� ��� : -1�� ����
		
		// 4. E pop() : ������ ���� �������� , ���� �������� ���� ������ ������ �� �ִ�. 
		System.out.println(stack.pop()); 	// 7
		System.out.println(stack.pop()); 	// 3
		System.out.println(stack.pop());	// 5
		System.out.println(stack.pop());	// 2
		
		// 5. boolean empty()
		System.out.println(stack.empty()); // �� ������ empty��
		
		
		
		
		
		
		
		
		

	}

}
