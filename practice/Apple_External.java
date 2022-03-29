package practice;

import javax.xml.crypto.Data;

public class Apple_External {
	public static void main(String[] args) {
		//°´Ã¼È­
		Apple apple = new Apple();
		
		apple.print();
		
		int k = apple.data();
		System.out.println(k);
		
		double sum = apple.sum(2, 2.6);
		System.out.println(sum);
		
		apple.printMonth(5);
	}

}
