package Test;
import java.util.Scanner;
public class Flexible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� >>> ");
		int a = 0;					//a�� ũ�⸸ŭ �Է¹���
		a = sc.nextInt();
		int []num = new int [a];	//aũ���� ���� �迭 ����
		
		for (int i = 0; i < num.length; i++) {	//aũ�⸸ŭ �ݺ�
			num[i] = sc.nextInt();	//�迭�� �� �ֱ�
		}
		
		method1(num);
	}
	public static void method1 (int...values) {
		int sum = 0;
		for (int i : values) {
			sum += i;
		}	//�հ� ���
		
		double avg = sum/values.length;
		System.out.println("�հ� : " + sum + "��� : " + avg);
	}
}