package chapter17.Ex16;

import java.util.Objects;


public class Account {
	private String ano ; 	//계좌 번호
	private String owner;   //계좌 주 , 이름
	private int balance; 	// 통장 금액, 
	
	Account(String ano, String owner, int balance){   //객체 생성시 필드의 값을 받아서 필드에 로드 
		this.ano = ano ; 
		this.owner = owner; 
		this.balance = balance; 	
	}
	//getter, setter 

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
		public boolean equals(Object obj) {
			if (obj instanceof Account) {
				if (this.ano.equals(((Account)obj).ano)) { //객체값에 있는 ano와 들어오는 값의 ano가 같을 때 true, 다를 때 false
					return true;
				}
			}
			return false;
		}
	
	@Override
		public int hashCode() {
			return Objects.hash(ano);
		}

}
