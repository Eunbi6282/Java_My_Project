package chapter17.Ex13;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


class Account{
	private String ano;  //계좌번호
	private String owner; // 계좌주(이름)
	private int balance; // 통장 금액, 
	
	public Account(String ano,String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	
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
		return "계좌 번호 : " + ano + " 계좌 소유주 : " + owner + " 금액 : " + balance;
	}
}

public class BankAccountUsingArray {
	
	// 1. 일반 배열사용해서 Account 객체 등록
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount(){
		// 코드 작성 : 1. 계좌 생성후 배열에 저장 (스캐너로 Account의 세가지 값을 인풋받기-> 배열 객체에 저장)
		System.out.println("계좌번호를 입력하세요");
		String ano_sc = scanner.next();
		System.out.println("계좌주를 입력하세요");
		String owner_sc = scanner.next();
		System.out.println("금액을 입력하세요");
		int balance_sc = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {            // i 번째의 배열 자리가 비어있으면
	            accountArray[i] = new Account(ano_sc, owner_sc, balance_sc);   //값을 넣는다.
	         System.out.println("계좌 생성 완료");
	         break;
	         }
		}
	}

	
	private static void accountList() {
		// 코드 작성 : 2. 계좌 목록 출력배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
		for (int i = 0; i < accountArray.length; i++) {
			
			if (accountArray[i] == null) {
				break;
			}else {
				System.out.println(Arrays.toString(accountArray));
			}
		}
	}


	private static void deposit() {
		// 코드 작성: 3. 예금 <== 계좌 번호를 input 받아서 객체에서 해당 계좌를 찾아서 , 입금 금액을 input받아서 해당 계좌에 저장
		System.out.println("계좌 번호를 입력하세요>>>");
		String ano_sc = scanner.next(); //계좌번호 input
		System.out.println("입금 금액을 입력하세요>>>");
		String money_sc = scanner.next();
		
		for (int i = 0; i < accountArray.length; i++) {
			if (ano_sc.equals(findAccount(ano_sc))) {
				accountArray[i] =  
			}
		}
		
		
		
		
		
	}
	private static void withdraw() {
		// 코드작성 : 4. 출금 <== 계좌 번호를 인풋받아서 해당 계좌를 객체에서 찾아서 출금
		System.out.println("계좌 번호를 입력하세요>>>");
		String ano_sc = scanner.next(); //계좌번호 input
		
		if (findAccount(ano_sc) == ano_sc) {
			
		}
		
	}
	//배열에서 Account객체 내의 ano(계좌번호)와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌
	private static Account findAccount(String anb) {
		Account account = null;
		//코드작성
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			if (accountArray[i].getAno().equals(anb)) {
				account = accountArray[i];
			}
		}
		return account;
		
	}
	
	
	

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------");
			System.out.println("선택>>>");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				
				createAccount(); //메서드 호출
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
		System.out.println("프로그램 종료");
	}
}