package Ex_T;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


class Account{
	private String ano;  //계좌번호
	private String owner; // 계좌주(이름)
	private int balance; // 통장 금액, 
	
	//객체 생성시 필드의 값을 받아서 필드에 로드
	public Account(String ano,String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter , setter //DTO,VO<= 각 계층으로 필드의 값을 지정하고 전달
	
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
		//Account[] : 배열 타입 지정, 참조타입, 배열의 각 방에 값이 존재하지 않을 경우 기본값으로 null이 들어감
		//배열 생성시 방(index)의 크기를 선언, index = 0, length()<- 방의 개수
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createAccount(){
		// 코드 작성 : 1. 계좌 생성후 배열에 저장 (스캐너로 Account의 세가지 값을 인풋받기-> 배열 객체에 저장)
		System.out.println("계좌번호를 입력하세요");
		String ano_sc = scanner.next(); //메서드 내에서만 사용되는 지역변수
		System.out.println("계좌주를 입력하세요");
		String owner_sc = scanner.next();
		System.out.println("금액을 입력하세요");
		int balance_sc = scanner.nextInt();
		
		//각 필드의 정보를 사용자로부터 할당받아서 객체를 생성한 후 객체에 필드의 값을 저장
		Account newAccount = new Account(ano_sc, owner_sc, balance_sc);
		
		// 객체를 배열에 저장(비어있는 방에 저장을 해야함).for문을 사용해서 null인 방을 찾아서 null인경우 객체를 저장 
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null) {            // 객체가 들어있는 경우가 있을 수 도 있기 때문에 -> i 번째의 배열 자리가 비어있으면 //.add와 비슷한 기능(뒤에서부터 값 삽입)
	            accountArray[i] = newAccount;   //값을 넣는다.
	         System.out.println("계좌 생성 완료");
	         break; //계좌 생성후 for문 빠져나오기
	         }
		}
	}

	
	private static void accountList() {
		// 코드 작성 : 2. 계좌 목록 출력배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
		//배열의 각방을 순회하면서 Null이 아닌 경우 배열에서 객체를 꺼내서 저장된 필드의 값을 출력
		System.out.println("----------------");
		System.out.println("2. 계좌 목록 출력");
		System.out.println("----------------");
		
		//배열의 각방의 null이 아닌경우, 객체의 필드의 값을 출력
		for (int i = 0; i < accountArray.length; i++) {
			//각 방의 객체를 담는 변수를 선언
			Account account = accountArray[i]; //0~99방의 객체를 account참조변수에 담는다.
			if (account != null) { 	//각방의 값이 null이 아닐 경우 객체 정보를 가져와서 츨력
				System.out.print(account.getAno());//계좌정보
				System.out.print("    ");
				System.out.print(account.getOwner()); //소유주
				System.out.print("    ");
				System.out.print(account.getBalance()); //금액
				System.out.println(); //라인개행
			}
		}
	}


	private static void deposit() {
		// 코드 작성: 3. 예금 <== 1. 계좌 번호를 input 받아서 2. 객체에서 해당 계좌를 찾아서 , 3. 입금 금액을 input받아서 해당 계좌에 저장
		System.out.println("에금할 계좌 번호를 입력하세요>>>");
		String ano_sc = scanner.next(); //계좌번호 input
		System.out.println("입금 금액을 입력하세요>>>");
		int money_sc = scanner.nextInt();
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 리턴받아옴
		Account account = findAccount(ano_sc); //메서드에서 찾은 객체를 리턴받아옴
		//findAccount()-> 인풋받은 계좌를 배열안의 계좌와 비교해서 값이 같으면 리턴시켜줌
		
		if(account == null) { //리턴값이 null이면 계좌를 못찾은거임
			System.out.println("결과 : 해당계좌가 존재하지 않습니다.");
			return; //return을 만나면 메서드를 빠져나온다.
		}else { 
			account.setBalance(account.getBalance() + money_sc);
			//setter을 통해 값을 주입(기존의 값(account.getBalance())을 가져와서 인풋받은 값(money_sc)를 추가함
			System.out.println("결과 : 예금이 성공적으로 입금되었습니다.");
		}
		
		
		
		
		
	}
	private static void withdraw() {
		// 코드작성 : 4. 출금 <== 계좌 번호를 인풋받아서 해당 계좌를 객체에서 찾아서 출금
		System.out.println("계좌 번호를 입력하세요>>>");
		String ano_sc = scanner.next(); //계좌번호 input
		
		if (findAccount(ano_sc) == ano_sc) {
			
		}
		
	}
	//배열에서 Account객체 내의 ano(계좌번호)와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌(중복 코드를 하나로 만들어줌)
	//예금, 출금할 때 공통메서드
	//여러 메서드에서 중복사용될 떄 별도의 메서드를 생성해서 중복코들르 간단하게 만들어 준다.
	private static Account findAccount(String ano) { //계좌번호를 인풋받음
		Account account = null;
		//코드작성
		for (int i = 0; i < accountArray.length; i++) {
			
			if (accountArray[i] != null) { //배열방의 값이 null이 아닐 경우에 객체의 ano확인
				// 각 객체의 방의 ano를 담는 변수 선언
				String dbAno = accountArray[i].getAno(); //배열의 각 방에 저장된 객체의 ano을 가져와서(gettert사용) 변수에 담음 //객ㅁ체 안에 있는 계좌변호
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account; //찾으면 객체 정보를 리리턴
	}
	
	
	

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------");
			System.out.println("선택>>>");
			
			//메서드 호출이 객체 생성없이 메서드 명으로 바로 호출됨 -> static키가 붙어있기 때문에
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
