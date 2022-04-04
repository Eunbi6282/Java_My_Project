package chapter17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

// HashSet으로 변환
// Member 클래스의 memberid 컬람을 equlas(), hashCode()로 비교해서 설정 -> 동일한 코드인지 확인


class Member{		//DTO , VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	public Set<Member> hashSet;
	
	public Member (int memberid, String memberName) {// 생성자 통해서 필드의 값할당
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberid + "입니다.";
	}
	
	// 값비교 위한 equals(), hashCode()재정의 
	@Override
	public int hashCode() {
		return Objects.hash(memberid,memberName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			
			if(this.memberid == ((Member)obj).memberid && this.memberName == ((Member)obj).memberName){
				return true;
			}
		}
		return false;
	}

}

// 배열 : 직접값 할당
 // 컬렉션 프레임워크 : 메서드를 이용해서 값을 지정, 삭제 등등

class MemberHashSet{  
	private Set<Member> hashSet;
	
		// 제너ㅓ릭에서 객체생성 방법
		//List <Member> aList = new ArrayList<Member>();
		// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {	// 기본생성자(매개변수 값x)
		hashSet = new HashSet<>();		
			//MemberArrayList를 객체화 하면 arrayList객체가 만들어 진다.(활성화 됨)
	}
	
	public void addMember(Member member){ //Member객체를 받아서 맨마지막방에 값을추가하는 메서드 
		//코드 블락
		hashSet.add(member); 	//
	}
	
	public boolean removeMember(int memberid) {
		//iterator 사용해서 remove
		Iterator<Member> i1 = hashSet.iterator();
		while (i1.hasNext()) {
			Member member = i1.next();
		int	m2 = member.getMemberid();
			
			if (memberid == m2) {
				hashSet.remove(i1);
				System.out.println("회원님의 "+ memberid + "는 삭제 되었습니다.");
				return true;
			}
		}
		return false;
	}


	
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력하는 메서드
		//iterator 사용
		Iterator<Member> i2 = hashSet.iterator();
		while(i2.hasNext()) { // 값이 존재하면 true해서 밑의 구문 출력
			System.out.print(i2.next() + " ");
		}
	}
	
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
}
public class Ex_MemberHashSet {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();	
			// 객체를 생성하는 순간 arraryList 필드가 활성화
			// 메서드 호출하기 위해서 객체 생성
			// addMemeber(), addMember2 , removeMember(), showAllMember()
		
		// arrayList 활성화,
		// memberid -> equals()
		Member memberLee = new Member(7111, "이은비"); // 1객체에 2개의 값 , memberid membername
		Member memberSom = new Member(1581, "손흥민");
		Member memberPark = new Member(3333, "박은비");
		Member memberHong = new Member(3344, "홍길동");
		Member memberJung = new Member(5555, "정재현");
		
		
		//각 객체를 생성해서 저장
		memberHashSet.addMember(memberJung);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberSom);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberPark);
		
		
		//모든 사용자 정보 출력
		memberHashSet.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberHashSet.removeMember(7111);
		
		// 
		memberHashSet.showSize();
		
		
	}

}
