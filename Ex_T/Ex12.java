package Ex_T;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
//		��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������. ���ô� ����
//		�׸��� ����. ���ں��� ���� �����Ѵ�. ���ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ�
//		<Enter>Ű�� ġ��, ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ�
//		��ǻ�Ͱ� �� ������ �Ѵ�. ���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ�
//		���� �̰���� �Ǵ��Ѵ�. ���ڰ� ���� ���� �� ��� "�׸�"�� �Է��ϸ� ������
//		������.
//		��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.
//		���� ���� ��! >> ����
//		����� = ���� , ��ǻ�� = ���� ����ڰ� �̰���ϴ�.
//		���� ���� ��! >> ����
//		����� = ���� , ��ǻ�� = ���� �����ϴ�.
//		���� ���� ��! >> �׸�
//		������ �����մϴ�...
//		[Hint] 
//		������ ���� ���ڿ� �迭�� �����.
//		String str[] = {"����", "����", "��"};
//		��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ��� ���� �ڵ带 �̿��Ѵ�.
//		int n = (int)(Math.random()*3); // n �� 0, 1, 2 �߿��� �����ϰ� ����
//		��ǻ�Ͱ� �� ���� "����" ���� ���ϴ� �ڵ�� ������ ���� �Ѵ�.
//		if(str[n].equals("����")) //��ǻ�Ͱ� �� ���� "����"���� ���ϴ� 

		
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String uSelect, comSelect;//uSelect : ����� �� ��(��ĳ�ʷ� ��ǲ), comSelect : ��ǻ�Ͱ� ����(Math.random���� ��ǲ)
		int n;	//��ǻ�Ͱ� �� �� (0,1,2)
		//Math.random() : 0.000000xxx ~ 0.999999xxx
		
		System.out.println("��ǻ�Ϳ� \"���� ���� ��\" ������ �մϴ�.");
		
		do {
			System.out.println("���� ���� ��! >>");
			uSelect = sc.next();
			if (uSelect.equals("�׸�")) {
				break;
			}
			
			n = (int)(Math.random()*3);	//n�� ��ǻ�Ͱ� ���� �� : 0,1,2
			comSelect = str[n]; //��ǻ�Ͱ� ���� �� : n�� 0�϶� -> ����, 1 -> ����, 2 -> ��
			
			if(uSelect.equals("����")) {		//����ڰ� ������ ��
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " �����ϴ�.");
				}else if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�. ");
				}else if (comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " ����ڰ� �̰���ϴ�.");
				}
				
			}else if (uSelect.equals("����")) {	//����ڰ� ������ ��
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " ����ڰ� �̰���ϴ�.");
				}else if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " �����ϴ�. ");
				}else if (comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else if (uSelect.equals("��")) {	//����ڰ� ���� ��
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " ����ڰ� �̰���ϴ�.");
				}else if (comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + ", ��ǻ�� = " + comSelect + " �����ϴ�.");
				}
			}
			
			
		}while(true);
		
		
		sc.close();
		System.out.println("������ �����մϴ�.");
	}

}
