package chapter17.Ex16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// Account 객체를 TreeSet에 저장, ano[계좌번호], owner[이름], balance[예금금액]
// TreeSet에 일반객체를 넣을 때 어떤 컬럼을 정렬할지를 지정. Comparator<E> , Comparable<E>
// Account객체를 수정하지 않고 balance를 내림차순으로(값이 큰것부터)출력되도록 구성

public class BankAccountUsingTreeSet {
	
	private static TreeSet<Account> tSet = new TreeSet<Account>(new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			if (o1.getBalance() < o2.getBalance()) {  //balance는 private이므로 get으로 가져와야 함
				return 1;
			}else if (o1.getBalance() == o2.getBalance()) {
				return 0;
			}else {
				return -1;
			}
		}
		
	});
	//.add() : 제일 마지막방에 값을 추가할 경우, .size(), .remove() : 각 방의 값을 삭제 시
	
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//코드 작성 : 1. 계좌 생성.  스캐너로 1.계좌번호, 2. 이름, 3. 초기통장 금액
		//배열 객체에 저장. 
		System.out.println("----------");
		System.out.println("1. 계좌 생성");
		System.out.println("----------");
		System.out.println("계좌 번호를 입력 하세요 >>");
		String ano = scanner.next();    //계좌 번호를 인풋 받아서 ano 변수에 할당. <메소드 내에서만 사용하는 지역 변수>  
		System.out.println("이름을 입력 하세요>>");
		String owner = scanner.next(); 
		System.out.println("계좌 개설시 초기 금액을 입력 하세요 >>");
		int balance = scanner.nextInt(); 
		
		//각 필드의 정보를 사용자로 부터 할당 받아서 객체를 생성후 객체에 필드의 값을 저장. 
		Account newAccount = new Account(ano, owner, balance);    //생성자를 통해서 객체에 필드값적용후 객체 생성. 
		
		//객체를 배열에 저장(비어있는 방에 저장). for 문을 사용해서 null인 방을 찾아서 null경우 객체를 저장.  
		tSet.add(newAccount);   //null 인 방에 객체를 저장. 
		System.out.println("계좌가 성공적으로 생성되었습니다. ");
			
	}
	private static void accountList() {
		//코드 작성 :2. 계좌 목록 출력 :  배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액 을 출력 
		//HashSet의 각 방을 순회 하면서 null이 아닌 경우 배열에서 객체를 꺼내서 필드의 정보를 출력. 
		System.out.println("------------");
		System.out.println("2. 계좌목록출력");
		System.out.println("------------");
		
		Iterator<Account> iterator = tSet.iterator();
		while (iterator.hasNext()) {
			Account account = iterator.next();    // 0 ~ 99 방의 객체를 account 참조 변수에 담는다. 
			if (account != null) {
				System.out.print(account.getAno());  //계좌 정보. 
				System.out.print("    ");
				System.out.print(account.getOwner());   //이름
				System.out.print("    ");
				System.out.print(account.getBalance());  //금액
				System.out.println();   //라인 개행. 
			}
		}
	}
	private static void deposit() {
		//코드 작성 : 3. 예금 <== 계좌번호를 받아서 객체에서 해당 계좌를 찾아서, 입금금액 : 해당 계좌에 저장. 
		//1. 사용자로 부터 입금할 계좌를 받아야 한다. 
		//2. 사용자로 받은 계좌 번호를 배열에 저장된 객체내의 계좌 번호를 확인후 해당 계좌에 입금. 
		
		System.out.println("----------");
		System.out.println("3.예금하기");
		System.out.println("----------");
		System.out.println("예금할 계좌 번호를 입력하세요 >>");
		String ano = scanner.next(); 
		System.out.println("예금할 금액을 입력 하세요 >>");
		int money = scanner.nextInt(); 
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다. 
		Account account = findAccount(ano);      //findAccount(계좌번호)
		
		if (account == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.  ");
			return;    //메소드를 종료. 
		}
		account.setBalance(account.getBalance() + money );   //setter 를 사용해서 기존의 금액 + 추가 입금 
		System.out.println("결과 : 예금이 성공적으로 입금 되었습니다. ");
		
	}
	private static void withdraw() {
		//코드 작성 : 4. 출금 <== 계좌 번호를 인풋 받아 해당 계좌를 객체에서 찾아서 출금.
		
		
		System.out.println("----------");
		System.out.println("4.출금하기");
		System.out.println("----------");
		System.out.println("출금할 계좌 번호를 입력하세요 >>");
		String ano = scanner.next(); 
		System.out.println("출금할 금액을 입력 하세요 >>");
		int money = scanner.nextInt(); 
		
		//해당 계좌를 배열에서 찾아서 찾은 객체를 받아온다. 
		Account account = findAccount(ano);      //findAccount(계좌번호)
		
		if (account == null) {
			System.out.println("결과 : 해당 계좌가 존재하지 않습니다.  ");
			return;    //메소드를 종료. 
		}
		account.setBalance(account.getBalance() - money );   //settor 를 사용해서 기존의 금액 - 추가 입금 
		System.out.println("결과 : 예금이 성공적으로 출금 되었습니다. ");
		System.out.println("남은 금액 : " + account.getBalance());
		
		
		
	}
	
	//Set에서 Account 객체 내의 ano[계좌번호] 와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌. 
	//예금, 출금할때 공통코드 , 여러 메소드에서 중복 사용 될때 별도의 메소드를 생성해서 중복코드를 간단하게 만들어 준다. 
	private static Account findAccount(String ano) {
		Account account = null ; 
		//코드 작성 
		Iterator<Account> iterator = tSet.iterator();
		
		
//			//방법 1
//			while (iterator.hasNext()) {
//				// 각 객체의 방에 ano를 담는 변수 선언
//				dbAno = iterator.next().getAno(); //Set의 각방에 저장된 객체의 ano를 dbAno변수에 할당
//				if (dbAno.equals(ano)) {  // 객체에 저장된 ano의 값이 들어오는 변수의 ano의 값과 같다면 
//					account = tSet.iterator().next();
//				}
//			}
//			
			//방법 2
			while (iterator.hasNext()) {
				Account account2 = iterator.next();
			String dbAno = account2.getAno(); 	//저장된 객체의 ano를 dbAno변수에 할당
				if (dbAno.equals(ano)) {
					account = account2;
					return  account;
				}
				
			}
			
		return account;
	}
	
	
	


	public static void main(String[] args) {
		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>>");
			int selectNO = scanner.nextInt(); 
			
			if (selectNO == 1) {
				createAccount() ; 	//메소드 호출 , 객체 생성 없이 메소드명으로 호출(static) , 
			}else if (selectNO == 2) {
				accountList(); 
			}else if (selectNO == 3) {
				deposit(); 
			}else if (selectNO == 4) {
				withdraw(); 
			}else if (selectNO == 5) {
				run = false; 
				//break; 
			}
			
		}
		scanner.close(); 
		System.out.println("프로그램 종료");
		
		
		
		

	}

}
