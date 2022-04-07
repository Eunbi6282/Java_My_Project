package Ex_T;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


class Account{
	private String ano;  //���¹�ȣ
	private String owner; // ������(�̸�)
	private int balance; // ���� �ݾ�, 
	
	//��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
	public Account(String ano,String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter , setter //DTO,VO<= �� �������� �ʵ��� ���� �����ϰ� ����
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "���� ��ȣ : " + ano + " ���� ������ : " + owner + " �ݾ� : " + balance;
	}
}

public class BankAccountUsingArray {
	
	// 1. �Ϲ� �迭����ؼ� Account ��ü ���
	private static Account[] accountArray = new Account[100];
		//Account[] : �迭 Ÿ�� ����, ����Ÿ��, �迭�� �� �濡 ���� �������� ���� ��� �⺻������ null�� ��
		//�迭 ������ ��(index)�� ũ�⸦ ����, index = 0, length()<- ���� ����
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount(){
		// �ڵ� �ۼ� : 1. ���� ������ �迭�� ���� (��ĳ�ʷ� Account�� ������ ���� ��ǲ�ޱ�-> �迭 ��ü�� ����)
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String ano_sc = scanner.next(); //�޼��� �������� ���Ǵ� ��������
		System.out.println("�����ָ� �Է��ϼ���");
		String owner_sc = scanner.next();
		System.out.println("�ݾ��� �Է��ϼ���");
		int balance_sc = scanner.nextInt();
		
		//�� �ʵ��� ������ ����ڷκ��� �Ҵ�޾Ƽ� ��ü�� ������ �� ��ü�� �ʵ��� ���� ����
		Account newAccount = new Account(ano_sc, owner_sc, balance_sc);
		
		// ��ü�� �迭�� ����(����ִ� �濡 ������ �ؾ���).for���� ����ؼ� null�� ���� ã�Ƽ� null�ΰ�� ��ü�� ���� 
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {            // ��ü�� ����ִ� ��찡 ���� �� �� �ֱ� ������ -> i ��°�� �迭 �ڸ��� ��������� //.add�� ����� ���(�ڿ������� �� ����)
	            accountArray[i] = newAccount;   //���� �ִ´�.
	         System.out.println("���� ���� �Ϸ�");
	         break; //���� ������ for�� ����������
	         }
		}
	}

	
	private static void accountList() {
		// �ڵ� �ۼ� : 2. ���� ��� ��¹迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		//�迭�� ������ ��ȸ�ϸ鼭 Null�� �ƴ� ��� �迭���� ��ü�� ������ ����� �ʵ��� ���� ���
		System.out.println("----------------");
		System.out.println("2. ���� ��� ���");
		System.out.println("----------------");
		
		//�迭�� ������ null�� �ƴѰ��, ��ü�� �ʵ��� ���� ���
		for (int i = 0; i < accountArray.length; i++) {
			//�� ���� ��ü�� ��� ������ ����
			Account account = accountArray[i]; //0~99���� ��ü�� account���������� ��´�.
			if (account != null) { 	//������ ���� null�� �ƴ� ��� ��ü ������ �����ͼ� ����
				System.out.print(account.getAno());//��������
				System.out.print("    ");
				System.out.print(account.getOwner()); //������
				System.out.print("    ");
				System.out.print(account.getBalance()); //�ݾ�
				System.out.println(); //���ΰ���
			}
		}
	}


	private static void deposit() {
		// �ڵ� �ۼ�: 3. ���� <== 1. ���� ��ȣ�� input �޾Ƽ� 2. ��ü���� �ش� ���¸� ã�Ƽ� , 3. �Ա� �ݾ��� input�޾Ƽ� �ش� ���¿� ����
		System.out.println("������ ���� ��ȣ�� �Է��ϼ���>>>");
		String ano_sc = scanner.next(); //���¹�ȣ input
		System.out.println("�Ա� �ݾ��� �Է��ϼ���>>>");
		int money_sc = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� ���Ϲ޾ƿ�
		Account account = findAccount(ano_sc); //�޼��忡�� ã�� ��ü�� ���Ϲ޾ƿ�
		//findAccount()-> ��ǲ���� ���¸� �迭���� ���¿� ���ؼ� ���� ������ ���Ͻ�����
		
		if(account == null) { //���ϰ��� null�̸� ���¸� ��ã������
			System.out.println("��� : �ش���°� �������� �ʽ��ϴ�.");
			return; //return�� ������ �޼��带 �������´�.
		}else { 
			account.setBalance(account.getBalance() + money_sc);
			//setter�� ���� ���� ����(������ ��(account.getBalance())�� �����ͼ� ��ǲ���� ��(money_sc)�� �߰���
			System.out.println("��� : ������ ���������� �ԱݵǾ����ϴ�.");
		}
		
		
		
		
		
	}
	private static void withdraw() {
		// �ڵ��ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ�޾Ƽ� �ش� ���¸� ��ü���� ã�Ƽ� ���
		System.out.println("���� ��ȣ�� �Է��ϼ���>>>");
		String ano_sc = scanner.next(); //���¹�ȣ input
		
		if (findAccount(ano_sc) == ano_sc) {
			
		}
		
	}
	//�迭���� Account��ü ���� ano(���¹�ȣ)�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������(�ߺ� �ڵ带 �ϳ��� �������)
	//����, ����� �� ����޼���
	//���� �޼��忡�� �ߺ����� �� ������ �޼��带 �����ؼ� �ߺ��ڵ鸣 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) { //���¹�ȣ�� ��ǲ����
		Account account = null;
		//�ڵ��ۼ�
		for (int i = 0; i < accountArray.length; i++) {
			
			if (accountArray[i] != null) { //�迭���� ���� null�� �ƴ� ��쿡 ��ü�� anoȮ��
				// �� ��ü�� ���� ano�� ��� ���� ����
				String dbAno = accountArray[i].getAno(); //�迭�� �� �濡 ����� ��ü�� ano�� �����ͼ�(gettert���) ������ ���� //����ü �ȿ� �ִ� ���º�ȣ
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account; //ã���� ��ü ������ ������
	}
	
	
	

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1. ���� ���� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("-----------------------");
			System.out.println("����>>>");
			
			//�޼��� ȣ���� ��ü �������� �޼��� ������ �ٷ� ȣ��� -> staticŰ�� �پ��ֱ� ������
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				
				createAccount(); //�޼��� ȣ��
			}else if (selectNo == 2) {
				accountList();
			}else if(selectNo == 3){
				deposit();
			}else if(selectNo == 4){
				withdraw();
			} else if (selectNo == 5) {
				break;
			}

	}
		
		
		
		scanner.close();
		System.out.println("���α׷� ����");
	}
}
