package practice;


import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
//		[���� 12] ��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������. ���ô� ����
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
//		if(str[n].equals("����")) //��ǻ�Ͱ� �� ���� "����"���� ���ϴ� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String str[] = {"����", "����", "��"};
		String user;	//����ڰ� ���� ��(��ĳ��)
		String computer; //��ǻ��
		int n;
		
		while (true) {
			System.out.println("���� ���� ��! >>> ");
			user = sc.next();
			
			if (user.equals("�׸�")) {
				break;
			}
			
			n = (int)(Math.random()*3);
			computer = str[n];
			
			if (user.equals("����")) {
				if(computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " �����ϴ�.");
				}else if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if (computer.equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ����ڰ� �̰���ϴ�.");
				}
			}else if (user.equals("����")) {
				if(computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ����ڰ� �̰���ϴ�.");
				}else if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " �����ϴ�.");
				}else if (computer.equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}else if (user.equals("��")) {
				if(computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ��ǻ�Ͱ� �̰���ϴ�.");
				}else if (computer.equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " ����ڰ� �̰���ϴ�.");
				}else if (computer.equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer + " �����ϴ�.");
				}
			}	
		}
		sc.close();
		System.out.println("������ �����մϴ�.");
	}

}
