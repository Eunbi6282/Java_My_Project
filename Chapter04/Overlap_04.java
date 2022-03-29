package Chapter04;

import java.util.Iterator;

import javax.xml.crypto.dsig.XMLObject;

public class Overlap_04 {
	public static void main(String[] args) {
		
		//1. if문 내의 if 중복
		int value1 = 6;
		int value2 = 3;
		
		if (value1 > 5) {
			if (value2 < 2) {
				System.out.println("실행 1");
			} else {
				System.out.println("실행 2");
			}
		}else {
			System.out.println("실행 3");
		}
		System.out.println("=================");
		
		//2. switch 내의 for문
		
		int value3 = 1;
		switch (value3) {
		case 1 : 
			for (int k = 10; k > 0; k--) {		
				System.out.print(k + " ");
			} 
			System.out.println();
			break;  // break없으면 위 아래 결과가 다 출력 됨
		case 2 : 
			for (int k = 0; k < 10; k++) {
				System.out.print(k + " ");
			}
			break;
		}
		
		//3. for문 내의 for 문
		
		for (int i = 0; i < 3 ; i++) {		///0부터 2까지 3번 돌아감
			for (int j = 0; j < 5 ; j++) {	//0부터 4까지 1씩증가
				// System.out.println(i + " , " + j);
				if ( i == j) {
					System.out.println(i + " = " + j);
				} else {
					System.out.println(i + " , " + j); // 이 방식도 가능
				}
				
			}
			
		}
	}

}
