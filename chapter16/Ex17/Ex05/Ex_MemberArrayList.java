package chapter16.Ex17.Ex05;

import java.util.ArrayList;

class Member{		//DTO , VO : 각 계층간의 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	
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
}

// 배열 : 직접값 할당
 // 컬렉션 프레임워크 : 메서드를 이용해서 값을 지정, 삭제 등등

class MemberArrayList{  
	private ArrayList<Member> arrayList;
	
		// 제너ㅓ릭에서 객체생성 방법
		//List <Member> aList = new ArrayList<Member>();
		// ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {	// 기본생성자(매개변수 값x)
		arrayList = new ArrayList<Member>();		
			//MemberArrayList를 객체화 하면 arrayList객체가 만들어 진다.(활성화 됨)
	}
	
	public void addMember(Member member){ //Member객체를 받아서 맨마지막방에 값을추가하는 메서드 
		//코드 블락
		arrayList.add(member); 	//
	}
	public void addMember2(int a, Member member) {		// 매개변수 2개를 받아서 특정 index방번호에 값을 추가(삽입)
		//예외 처리해보기
		
		try {
		arrayList.add(a, member);  // 주의 :IndexOutOfBoundsException 이 발생될 수 있음
		}catch (IndexOutOfBoundsException e) {
			System.out.println("예외가 발생되었습니다. 방번호에 맞게 입력해주세요");
		}
		
		
		
		
	}
	public boolean removeMember(int memberid) {
		// ArrayList에 저장된 memberid를 검색해서 해당 객체를 삭제하는 메서드
		
		for(int i = 0; i  < arrayList.size(); i++) {
			Member member =	arrayList.get(i); 	//각 방에 저장된 Member 객체를 member참보 변수에 할당
			int temid = member.getMemberid(); 	// 객체의 getMemberid(), 객체 내부의 memberid
			
			if (temid == memberid) {
				arrayList.remove(i);  //arrayList 방의 객체를 제거
				System.out.println("회원님의 "+ memberid + "는 삭제 되었습니다.");
				return true;
			}
		}
		System.out.println(memberid + "가 존재하지 않습니다. ");
		return false;
	}
	public void showAllMember() {
		// ArrayList에 저장된 모든 사용자 정보를 출력하는 메서드
		for (int i = 0; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i)); //각방의 Member객체가 자체를 출력
		}
		
	}
}
public class Ex_MemberArrayList {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();	
			// 객체를 생성하는 순간 arraryList 필드가 활성화
			// 메서드 호출하기 위해서 객체 생성
			// addMemeber(), addMember2 , removeMember(), showAllMember()
		
		// arrayList 활성화
		Member memberLee = new Member(7111, "이은비"); // 1객체에 2개의 값 , memberid membername
		Member memberSom = new Member(1581, "손흥민");
		Member memberPark = new Member(3333, "박은비");
		Member memberHong = new Member(3344, "홍길동");
		Member memberJung = new Member(5555, "정재현");
		
		
		//각 객체르르 생성해서 ArrayList에 저장
		memberArrayList.addMember(memberJung);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberSom);
		
		//특정 index방에 추가적인 사용자
		memberArrayList.addMember2(3, memberJung); //3번방에 추가
		
		memberArrayList.addMember2(10, memberHong); //IndexOutOfBoundsException
//		memberArrayList.showSize();
		
		
		//모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberArrayList.removeMember(3344);
		
	}

}
